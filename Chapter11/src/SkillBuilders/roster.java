package SkillBuilders;
import java.io.*;
import java.util.Scanner;
public class roster {
private String firstName;
private String lastName;
private int numStu;
	public static void main(String[] args) 
	{
		File dataFile= new File("../Chapter11/src/SkillBuilders/roster.txt");
	      
	       FileReader in;
	       BufferedReader readFile;
	      
	       FileWriter out;
	       BufferedWriter writeFile;
	       
	       Scanner input = new Scanner(System.in);
	       
	       String fileName;
	       String firstName;
	       String lastName;
	       int numStu;
	       
	       System.out.println("Enter file name.");
	       fileName = input.next();
	       
	       System.out.println("How many students in your class?");
	       numStu = input.nextInt();
	       
	 try
     {
  	  
        dataFile = new File(fileName);
        
        out = new FileWriter(dataFile);
        writeFile = new BufferedWriter(out);
        
        for(int i=0; i < numStu; i++)
        {
      	  System.out.println("Enter students first name.");
      	  firstName = input.next();
      	  
      	  writeFile.write(firstName);
      	  writeFile.newLine();
          System.out.println("Enter students last name.");
          lastName = input.next();
        	  
          writeFile.write(lastName);
          writeFile.newLine();
          writeFile.newLine();
          }
        
 
  	   
  	   in = new FileReader(dataFile);
         readFile = new BufferedReader(in);
         
       
         while ((firstName = readFile.readLine()) != null)
         {
             System.out.println(firstName);
         } 
         {
         writeFile.close();
         out.close();
         System.out.println("Data written to file.");
         }}
	     catch(IOException e) {
        	 System.out.println("Problem writing to file.");
        	 System.err.println("IOException:  " + e.getLocalizedMessage());
         }
         System.out.println("Data written to file");
         }
	public String toString() {
		String stuString;
		
		stuString = firstName + "" + lastName;
		return(stuString);
		
	}

}
