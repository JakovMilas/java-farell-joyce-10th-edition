/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 11

Task:
Write an application that determines whether a phrase entered by the user is a palindrome.
A palindrome is a phrase that reads the same backward and forward without regarding
capitalization or punctuation. For example, Dot saw I was Tod, Was it a car or a cat I saw?,
and Madam, I’m Adam are palindromes. Save the file as Palindrome.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String userInput;

		System.out.print("Enter string to check if it is palindrome >> ");
		userInput = input.nextLine();

		if (checkIsPalindrome(userInput))
			System.out.println("\n'" + userInput + "' is palindrome.");
		else
			System.out.println("\n'" + userInput + "' is not palindrome.");

	}

	public static boolean checkIsPalindrome(String str) {
		int strLen = str.length();
		String stripped = "";
		int strippedLen = 0;
		String reversed = "";
		char c;
		boolean isPalindrome = false;
		for (int i = 0; i < strLen; i++) {
			c = str.charAt(i);
			if (Character.isLetterOrDigit(c))
				stripped += c;
		}
		strippedLen = stripped.length();
		for (int i = strippedLen - 1; i >= 0; i--) {
			c = stripped.charAt(i);
			reversed += c;
		}
		if (stripped.equalsIgnoreCase(reversed))
			isPalindrome = true;
		return isPalindrome;
	}

}
