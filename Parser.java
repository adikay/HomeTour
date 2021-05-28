package game;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Parser {
	// holds all valid words
	private RoomManager words;
	// source of command input
	private Scanner reader;

	/*
	 * Create a parser to read from the terminal window.
	 */
	public Parser() {
		words = new RoomManager();
		reader = new Scanner(System.in);
	}

	/*
	 * Get the word from the user. return The next word from the user
	 */
	public Player getWord() {
		// Will hold input line
		String inputLine;
		String word1 = null;
		String word2 = null;
		// print prompt
		System.out.println("> ");
		inputLine = reader.nextLine();
		// Find up to two words on the line.
		Scanner tokenizer = new Scanner(inputLine);
		if (tokenizer.hasNext()) {
			word1 = tokenizer.next(); // get first word
			if (tokenizer.hasNext()) {
				word2 = tokenizer.next(); // get second word
				// note: we just ignore the rest of the input line.
			}
		}
		// Now check whether this word is known.
		// If so, create a word with it.
		// If not, create a "null" word
		if (words.isWord(word1)) {
			String firstWord = null;
			String secondWord = null;
			return new Player(firstWord, secondWord);
		} else {
			String secondWord = null;
			return new Player(null, secondWord);
		}

	}

	/*
	 * Part 2 Print out a list of valid words.
	 * 
	 */
	public String getWords() {
		return words.getWordList();
	}
}
