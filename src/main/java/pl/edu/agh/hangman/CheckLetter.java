package pl.edu.agh.hangman;

public class CheckLetter {
	public  boolean checkLetter(String word, char letter){
		int length = word.length();
		boolean hasLetter = false;
		for (int i=0; i < length && !hasLetter ; i ++) {
			if (word.charAt(i) == letter) {
				hasLetter = true;
			}
		}
		return hasLetter;
		
			
	}


}
