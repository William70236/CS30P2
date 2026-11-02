package Mastery;

import java.io.*;
import java.util.Scanner;

public class countvowels 
{

   public static void main(String[] args) 
   {
	   File dataFile= new File("../Chapter11/src/Mastery/vowel.txt");
      
	   FileReader in;
       BufferedReader readFile;
      
       int numVow = 0;
       String fileName;
       Scanner input = new Scanner(System.in);
     
       
       System.out.println("Enter file location.");
       fileName = input.next();

       try {
           dataFile = new File(fileName);
           in = new FileReader(dataFile);
           readFile = new BufferedReader(in);
           
           String line = null;
           while ((line = readFile.readLine()) != null) {
               String lowercase = line.toLowerCase();
              
               for (int i = 0; i < lowercase.length(); i++) {
                   char letter = lowercase.charAt(i);
                   
                   if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                       numVow++;
                   }
               }
           }

           if (readFile != null) {
               readFile.close();
           }
           if (in != null) {
               in.close();
           }
           System.out.println("Total number of vowels: " + numVow);

       } catch (FileNotFoundException e) {
           System.out.println("Couldn't find " + fileName);
       } catch (IOException e) {
           System.out.println("Couldn't read file");
       }{
           
           }
       }
   }
