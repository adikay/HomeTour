package game;

public class Player {
	private String firstWord;
	private String secondWord;

	public Player(String firstWord, String secondWord) {
		this.firstWord = firstWord;
		this.secondWord = secondWord;
	}

	public String getfirstWord() {
		return firstWord;
	}

	public String getSecondWord() {
		return secondWord;
	}

	/*
	 * Return true if firstWord is unknown. Return true if this command is not
	 * understood, false otherwise
	 */
	public boolean isUnknown() {
		return (firstWord == null);
	}

	/*
	 * Returns true if the firstWord has a second word. false otherwise
	 */
	public boolean hasSecondWord() {
		return (secondWord != null);
	}

	public String getWordProcessed() {
		// TODO Auto-generated method stub
		return null;
	}

}
