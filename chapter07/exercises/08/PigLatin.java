/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 8

Task:
Write an application that accepts a word from a user and converts it to Pig Latin.
If a word starts with a consonant, the Pig Latin version removes all consonants from
the beginning of the word and places them at the end, followed by ay. For example,
cricket becomes icketcray. If a word starts with a vowel, the Pig Latin version is
the original word with ay added to the end. For example, apple becomes appleay.
If y is the first letter in a word, it is treated as a consonant; otherwise, it is
treated as a vowel. For example, young becomes oungyay, but system becomes ystemsay.
For this program, assume that the user will enter only a single word consisting of all
lowercase letters. Save the file as PigLatin.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import javax.swing.JOptionPane;

public class PigLatin {

	public static void main(String[] args) {

		String word = JOptionPane.showInputDialog(null, "Enter word to convert to Pig Patin");

		JOptionPane.showMessageDialog(null, word + " converted to Pig Latin is " + convertToPigLatin(word));

	}

	public static String convertToPigLatin(String word) {
		boolean isFound = false;
		String pigLatin = "";
		int wordLen = word.length();
		for (int i = 0; i < wordLen && !isFound; i++) {
			char c = word.charAt(i);
			if (i == 0) {
				if (isVovel(c)) {
					pigLatin = word + "ay";
					isFound = true;
				} else
					if (c == 'y') {
						pigLatin = word.substring(1, wordLen) + word.charAt(0) + "ay";
						isFound = true;
				}
			 } else
				if (isVovel(word.charAt(i)) || word.charAt(i) == 'y') {
					pigLatin = word.substring(i, wordLen) + word.substring(0, i) + "ay";
					isFound = true;
			}
		}
		return pigLatin;
	}

	public static boolean isVovel(char c) {
		if (c == 'a' || c == 'e' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		return false;
	}

}
