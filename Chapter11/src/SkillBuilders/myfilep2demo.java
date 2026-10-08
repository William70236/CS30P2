package SkillBuilders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class myfilep2demo {

	public static void main(String[] args) 
	{
		// Do not use scanner to access files
		   File textFile;
		   String response;
		   Scanner input = new Scanner(System.in);
		   
		   // Create a file
		   textFile = new File("C:\\Users\\48321005\\git\\CS30P2\\Chapter11\\src\\SkillBuilders\\zzz.txt");
		   
		   //Check if file exists
		   if(textFile.exists())
		   {
			   System.out.println("zzz.txt exists");
		   }
		   else
		   {
			   try {
			         textFile.createNewFile();
			         System.out.println("zzz.txt file created");
			   }
			   catch(IOException e) 
			   {
				   System.out.println("File could not be created");
				   System.err.println("IOException:" + e.getMessage());
				   
			   }
		 }
	
		 //Delete if user chooses to delete the file
		   System.out.println("Would you like to (K)eep or (D)elete your file?");
		   response = input.next();
		   
		   if(response.equalsIgnoreCase("D"))
		   {
			   //Delete the file
			   if(textFile.delete())
			   {
				   System.out.println("File has been deleted");
			   }
			   
		   }
		   else 
		   {
			   System.out.println("File has been kept`	.");
		   }
	}

}
