/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 6a

Task:
Write an application that accepts three Strings from the user and, without regard to case,
appropriately displays a message that indicates whether the Strings were entered in
alphabetical order. Save the file as Alphabetize.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Alphabetize {

	public static void main(String[] args) {

		String word1 = enterWord();
		String word2 = enterWord();
		String word3 = enterWord();

		if (word1.compareToIgnoreCase(word2) < 0 && word1.compareToIgnoreCase(word3) < 0)
			System.out.println("Words are entered in alphabetical order");
		else
			System.out.println("Words are NOT entered in alphabetical order");

	}

	public static String enterWord() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter word >> ");
		String word = input.nextLine();
		return word;
	}

}
