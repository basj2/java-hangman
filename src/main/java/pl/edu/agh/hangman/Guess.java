package pl.edu.agh.hangman;

import java.util.Scanner;

public class Guess {
	public char guessLetter(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess:");
		String letter = scanner.next();
		letter = letter.toUpperCase();
		char charLetter = letter.charAt(0);
		//scanner.close();
		return charLetter;
		
	}
		
}
