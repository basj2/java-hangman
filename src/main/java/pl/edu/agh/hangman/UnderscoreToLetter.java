package pl.edu.agh.hangman;

public class UnderscoreToLetter {
	
	public String underscoreToLetter (String word, String underscores, char letter) {
		int length = word.length();
		//char[] chars = new char[length];
		for (int i = 0; i < length; i ++) {
			if (word.charAt(i) == letter) {
				underscores = underscores.substring(0, i * 2) + letter +
						underscores.substring(i * 2 + 1);
			}

		}

		return underscores;
	}

}
