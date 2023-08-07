/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 6b

Task:
Write an application that accepts three Strings from the user and displays them in
alphabetical order without regard to case. Save the file as Alphabetize2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Alphabetize2 {

	public static void main(String[] args) {

		String word1 = enterWord();
		String word2 = enterWord();
		String word3 = enterWord();

		sort(word1, word2, word3);

	}

	public static String enterWord() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter word >> ");
		String word = input.nextLine();
		return word;
	}

	public static void sort(String word1, String word2, String word3) {
		
		System.out.print("Alphabetically ordered: ");
		if (word1.compareToIgnoreCase(word2) < 0 && word1.compareToIgnoreCase(word3) < 0){
			if (word2.compareToIgnoreCase(word3) < 0)
				System.out.println(word1 + " " + word2 + " " + word3);
			else
				System.out.println(word1 + " " + word3 + " " + word2);
		} else
			if (word2.compareToIgnoreCase(word1) < 0 && word2.compareToIgnoreCase(word3) < 0) {
				if (word1.compareToIgnoreCase(word3) < 0)
					System.out.println(word2 + " " + word1 + " " + word3);
				else
					System.out.println(word2 + " " + word3 + " " + word1);
		} else
			if (word3.compareToIgnoreCase(word1) < 0 && word3.compareToIgnoreCase(word2) < 0) {
				if (word1.compareToIgnoreCase(word2) < 0)
					System.out.println(word3 + " " + word1 + " " + word2);
				else
					System.out.println(word3 + " " + word2 + " " + word1);
		}

	}

}
