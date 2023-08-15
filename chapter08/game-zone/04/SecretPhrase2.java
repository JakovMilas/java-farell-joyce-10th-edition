/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 4

Task:
Create a Secret Phrase game similar to Hangman, in which the user guesses letters in a partially hidden phrase
in an attempt to determine the complete phrase. Within the program:
 - The phrase to be guessed is selected randomly from a list of at least 10 phrases.
 - The clue is presented to the user with asterisks replacing letters to be guessed but with spaces in the
  appropriate locations. For example, if the phrase to be guessed is No man is an island, then the user
  sees the following as a first clue: ** *** ** ** ****** The spaces indicate where individual words start and end.
 - Make sure that when a user makes a correct guess, all the matching letters are filled in, regardless of case.
Save the game as SecretPhrase2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class SecretPhrase2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String[] phrases =
		{
			"You'll never guess it",
			"The best of both worlds",
			"Speak of the devil",
			"To kill two birds with one stone",
			"Once in a blue moon",
			"When pigs fly",
			"To cost an arm and a leg",
			"A piece of cake",
			"Let the cat out of the bag",
			"To feel under the weather"
		};
		String phrase = phrases[random.nextInt(10)];
		int phraseLen = phrase.length();
		String secretPhrase = hidePhrase(phrase);
		String entry;
		while (!phrase.equalsIgnoreCase(secretPhrase)) {
			System.out.println("\nGuess secret phrase:");
			System.out.println(secretPhrase);
			System.out.print("\nEnter letter >> ");
			entry = input.nextLine();
			if(entry.length() == 0)
				System.out.println("Please enter an letter >> ");
			else
			{
				char c = entry.charAt(0);
				secretPhrase = revealLetter(phrase, c, secretPhrase);
			}
		}
		System.out.println(secretPhrase);
		System.out.println("\nCongratulation! You guessed it!\n");
	
	}

	public static String hidePhrase(String phrase) {
		char c;
		boolean isWord = false;
		int phraseLen = phrase.length();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < phraseLen; i++) {
			c = phrase.charAt(i);
			if (phrase.charAt(i) == ' ') {
				strBuilder.append(' ');
				isWord = true;
			} else
				if (isWord) {
				strBuilder.append('*');
				isWord = false;
			} else
				strBuilder.append('*');
		}
		return strBuilder.toString();
	}

	public static String revealLetter(String phrase, char c, String hiddenPhrase) {
		int phraseLen = phrase.length();
		for (int i = 0; i < phraseLen; i++) {
			if (Character.toString(c).equalsIgnoreCase(Character.toString(phrase.charAt(i)))) {
				hiddenPhrase = hiddenPhrase.substring(0, i) + phrase.charAt(i) +
					hiddenPhrase.substring(i + 1, phraseLen);
			}
		}
		return hiddenPhrase;
	}

}
