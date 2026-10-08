package SkillBuilders;
import java.io.*;
public class myfilep2 {

	public static void main(String[] args)
	{
		File textFile = new File ("C:\\cs314.txt");
		if(textFile.exists()) 
		{
			System.out.println("File already exists.");
		}
		else {
			try {
				textFile.createNewFile();
				System.out.println("New file created");
			} catch (IOException e) {
				System.out.println("File could not be created");
				System.err.println ("IOException: " + e.getMessage());
			}
		}
    }
}
