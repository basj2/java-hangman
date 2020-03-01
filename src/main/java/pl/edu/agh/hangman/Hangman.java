package pl.edu.agh.hangman;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Hangman {

	public static final String[] HANGMANPICS = new String[] {
			"  +---+\n" + "  |   |\n" + "      |\n" + "      |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + "      |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + "  |   |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|   |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + "      |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + " /    |\n" + "      |\n" + "=========",
			"  +---+\n" + "  |   |\n" + "  O   |\n" + " /|\\  |\n" + " / \\  |\n" + "      |\n" + "========" };

	public static void main(String[] args) throws FileNotFoundException {
		WordsReader wordsReader = new WordsReader();
		ArrayList<String> wordsList = wordsReader.getWordsList("src/main/resources/slowa.txt");
		System.out.println(wordsList.toString());

		RandomWord random = new RandomWord();
		String word = random.getRandomWord(wordsList);
		System.out.println(word);

		UnderscoreCreator underscoreCreator = new UnderscoreCreator();
		String underscores = underscoreCreator.getUnderscores(word);
		System.out.println(underscores);

		int counter = 1;
		boolean continueGame = true;

		PicturePrinter picturePrinter = new PicturePrinter();
		int picturesNumber = HANGMANPICS.length;
		UnderscoreToLetter underscoreToLetter = new UnderscoreToLetter();
		// String underscore = underscores;

		while (continueGame) {
			picturePrinter.printPicture(HANGMANPICS, counter);
			System.out.println("\n" + underscores);
			System.out.println(counter);
			
			Guess letterToGuess = new Guess();
			char letter = letterToGuess.guessLetter();
			// System.out.println(letter);
			CheckLetter checkLetter = new CheckLetter();
			boolean hasLetter = checkLetter.checkLetter(word, letter);

			if (hasLetter) {

				underscores = underscoreToLetter.underscoreToLetter(word, underscores, letter);

			} else {

				counter++;

			}

			

			boolean hasUndescore = checkLetter.checkLetter(underscores, '_');

			if (counter < picturesNumber) {

				if (hasUndescore) {
					continueGame = true;
				} else {
					System.out.println("You won!");
					System.out.println(underscores);
					continueGame = false;

				}
			} else {
				System.out.println("You lost!");
				continueGame = false;
			}

		}

	}

	// CheckLetter checkLetter = new CheckLetter();
	// boolean hasLetter = checkLetter.checkLetter(word, letter);
	// System.out.println (hasLetter);

	// UnderscoreToLetter underscoreToLetter = new UnderscoreToLetter();
	// String underscore = underscoreToLetter.underscoreToLetter(word, underscores,
	// letter);
	// System.out.println(underscore);

}
