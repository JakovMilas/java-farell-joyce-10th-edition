/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 05

Task:
Write an application that counts the words in a String entered by a user. Words are separated by any
combination of spaces, periods, commas, semicolons, question marks, exclamation points, or dashes.
Figure 7-17 shows a typical execution. Save the file as CountWords.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import javax.swing.JOptionPane;

public class CountWords {

	public static void main(String[] args) {

		String userInput;
		int numberOfWords;

		userInput = JOptionPane.showInputDialog(null, "Enter string");

		numberOfWords = countWords(userInput);

		JOptionPane.showMessageDialog(null, userInput +
						"\nThere are " + numberOfWords + " words in the string");


	}

	public static int countWords(String str) {
		int count = 0;
		boolean isWord = false;
		int strLen = str.length();
		
		for (int i = 0; i < strLen; i++) {
			char c = str.charAt(i);
			if (Character.isLetterOrDigit(c))
				isWord = true;
			else
				if (isWord) {
					count++;
					isWord = false;
				}
		}
		if (isWord)
			count++;
		return count;
	}

}
