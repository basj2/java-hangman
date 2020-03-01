package pl.edu.agh.hangman;

public class UnderscoreCreator {
	
	public String getUnderscores (String word) {
		int length = word.length();
		String underscores = "";
		for (int i = 0; i < length; i ++) {
			underscores += "_ ";
		}
		return underscores;
	}

}
