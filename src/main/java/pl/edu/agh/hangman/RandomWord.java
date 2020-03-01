package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Random;

public class RandomWord {
	
	public String getRandomWord(ArrayList<String> wordsList) {
		Random random = new Random();
		int size = wordsList.size();
		int  randomNumber = random.nextInt(size);
		String word = wordsList.get(randomNumber);
		return word;
	}

}
