package pl.edu.agh.hangman;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };


    public static void main(String[] args) throws FileNotFoundException {
        Guess letterToGuess = new Guess();
        String letter = letterToGuess.guessLetter();
        System.out.println(letter); 

    	WordsReader wordsReader = new WordsReader();
    	ArrayList<String> wordsList = wordsReader.getWordsList("src/main/resources/slowa.txt");
		System.out.println(wordsList.toString());

    	RandomWord random = new RandomWord();
    	String word = random.getRandomWord(wordsList);
    	System.out.println(word);
    	
    	UnderscoreCreator underscoreCreator = new UnderscoreCreator();
    	String underscores = underscoreCreator.getUnderscores(word);
    	System.out.println(underscores);
    	

    }
}
