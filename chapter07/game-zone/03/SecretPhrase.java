/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Game Zone 3

Task:
Create a simple guessing game, similar to Hangman, in which the user guesses letters and then attempts to
guess a partially hidden phrase. Display a phrase in which some of the letters are replaced by asterisks: for
example, G* T*** (for Go Team). Each time the user guesses a letter, either place the letter in the correct spot
(or spots) in the phrase and display it again or tell the user the guessed letter is not in the phrase. Display a
congratulatory message when the entire correct phrase has been deduced. Save the game as SecretPhrase.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class SecretPhrase {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		String phrase = "You'll never guess it";
		int phraseLen = phrase.length();
		String secretPhrase = hidePhrase(phrase);
		while (!phrase.equalsIgnoreCase(secretPhrase)) {
			System.out.println("\nGuess secret phrase:");
			System.out.println(secretPhrase);
			System.out.print("\nEnter letter >> ");
			char c = input.nextLine().charAt(0);
			secretPhrase = revealLetter(phrase, c, secretPhrase);
		}
		System.out.println("\n" + secretPhrase);
		System.out.println("Congratulation! You guessed it!\n");
	
	}

	public static String hidePhrase(String phrase) {
		char c;
		boolean isWord = false;
		int phraseLen = phrase.length();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < phraseLen; i++) {
			c = phrase.charAt(i);
			if (i == 0)
			       strBuilder.append(phrase.charAt(i));
			else
				if (phrase.charAt(i) == ' ') {
					strBuilder.append(' ');
					isWord = true;
			} else
				if (isWord) {
				strBuilder.append(phrase.charAt(i));
				isWord = false;
			} else
				strBuilder.append('*');
		}
		return strBuilder.toString();
	}

	public static String revealLetter(String phrase, char c, String hiddenPhrase) {
		int phraseLen = phrase.length();
		for (int i = 0; i < phraseLen; i++) {
			if (c == phrase.charAt(i)) {
				hiddenPhrase = hiddenPhrase.substring(0, i) + c + hiddenPhrase.substring(i + 1, phraseLen);
			}
		}
		return hiddenPhrase;
	}

}
