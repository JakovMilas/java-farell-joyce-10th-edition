/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 03a

Task:
Create a program that contains a String that holds your favorite inspirational quote and
display the total number of spaces contained in the String. Save the file as CountSpaces.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;

public class CountSpaces {

	public static void main(String[] args) {

		String quote = "Better to be young and rich than old and poor";
		int quoteLength = quote.length();
		int whitespaces = 0;

		for (int i = 0; i < quoteLength; i++)
			if (quote.charAt(i) == ' ')
				whitespaces++;

		JOptionPane.showMessageDialog(null, quote + "\nNumber of whitespaces: " + whitespaces);

	}

}
