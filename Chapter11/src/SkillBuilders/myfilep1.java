package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class myfilep1 
{

	public static void main(String[] args) 
	{
	   // Do not use scanner to access files
	   File textFile;
	   String fileName;
	   Scanner input = new Scanner(System.in);
	   
	   // Obtain file name from user
	   System.out.println("Enter file name");
	   // store file name in fileName
	   fileName = input.next();
	   
	   // Determine if file exists
	   textFile = new File(fileName);
	   
	   if(textFile.exists())
	   {
		   System.out.println("File exists.");
	   }
	   else
	   {
	      System.out.println("File does not exist.");
	   }
	   
	   

	}

}
