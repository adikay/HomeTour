package game;

public class RoomManager {
	// a constant array of all valid words
	private static final String[] validWords = { "forward", "backward", "left", "right", "quit", "help" };

	/*
	 * Constructor - initialize the command words.
	 */

	public RoomManager() {
	}

	public boolean isWord(String aString) {
		for (int i = 0; i < validWords.length; i++) {
			if (validWords[i].equals(aString))
				return true;
		}
		// if we get here, the string was not
		// found in the words
		return false;
	}

	/*
	 * In this section print all valid words to System.out. "getWordList" and have
	 * it return a String instead of printing the words.
	 */

	public String getWordList() {
		String result = "";
		for (String word : validWords) {
			result += word + " ";
		}
		return result + "\n";
	}

}
