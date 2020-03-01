package pl.edu.agh.hangman;

import java.util.Scanner;

public class Guess {
	public String guessLetter(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess:");
		String guess = scanner.next();
		scanner.close();
		return guess.toUpperCase();
		
	}
		
}
