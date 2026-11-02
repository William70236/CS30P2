package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class wordguess {
    public static void main(String[] args) {
        final String flag = "!";
        File file = new File("../Chapter11/src/Mastery/words.txt");
        FileReader in = null;
        BufferedReader out = null;
        Random rand = new Random();
        
        int numWords = 0, wordtoguess;
        String secretword = "";
        String wordsofar = "", newword = "";
        String letterguess = "";
        int numGuesses = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            in = new FileReader(file);
            out = new BufferedReader(in);
            
            numWords = Integer.parseInt(out.readLine());
            
            wordtoguess = rand.nextInt(numWords);
            
            for (int i = 0; i <= wordtoguess; i++) {
                secretword = out.readLine();
            }
            
            out.close();
           
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        } catch (IOException e) {
            System.out.println("Error reading file.");
            return;
        }

        System.out.println("WordGuess game.\n");

        for (int i = 0; i < secretword.length(); i++) {
            wordsofar += "-";
        }
        System.out.println("Word so far: " + wordsofar);

        do {
            System.out.print("Enter a letter (or " + flag + " to quit): ");
            letterguess = scanner.nextLine();
            
            if (letterguess.equals(flag)) {
                break;
            }

            numGuesses++;

            newword = "";
            for (int i = 0; i < secretword.length(); i++) {
                if (secretword.substring(i, i + 1).equals(letterguess)) {
                    newword += letterguess;
                } else {
                    newword += wordsofar.substring(i, i + 1);
                }
            }
            wordsofar = newword;

            System.out.println("Word so far: " + wordsofar);

        } while (!letterguess.equals(flag) && !wordsofar.equals(secretword));

        if (wordsofar.equals(secretword)) {
            System.out.println("You guessed the word: " + secretword);
        } else {
            System.out.println("Game over. The secret word was: " + secretword);
        }
        System.out.println("Total guesses: " + numGuesses);
        scanner.close();
    }
}
