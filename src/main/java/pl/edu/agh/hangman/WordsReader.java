package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordsReader {
	
	public ArrayList<String> getWordsList(String file) throws FileNotFoundException{
		ArrayList<String> wordsList = new ArrayList<>();
		File wordsFile = new File(file);
		Scanner scanner = new Scanner(wordsFile);
		while (scanner.hasNext()) {
			String word = scanner.next();
			wordsList.add(word.toUpperCase());
			}
		scanner.close();
		return wordsList;
		
	}
	
	

}
