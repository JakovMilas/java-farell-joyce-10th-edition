/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 10

Task:
Write a program that inserts parentheses, a space, and a dash into a String of 10 user-entered numbers
to format it as a phone number. For example, 5153458912 becomes (515)345-8912. If the user does not enter
exactly 10 digits, display an error message. Continue to accept user input until the user enters 999.
Save the file as PhoneNumberFormat.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class PhoneNumberFormat {

	public static void main(String[] args) {

		final String SENTINEL = "999";
		Scanner input = new Scanner(System.in);
		String phoneNumber;

		System.out.print("Enter phone number >> ");
		phoneNumber = input.nextLine();

		while (phoneNumber.length() != 10 || !checkIsDigit(phoneNumber)) {
			System.out.println("\nPhone number must have 10 digits and all numbers");
			System.out.print("Try again >> ");
			phoneNumber = input.nextLine();
		}

		phoneNumber = formatNumber(phoneNumber);
		System.out.println("\nYour phone number: " + phoneNumber);

	}

	public static String formatNumber(String number) {
		String formatted = "(" + number.substring(0, 3) + ")" + number.substring(3, 6) +
				"-" + number.substring(6, number.length());
		return formatted;
	}

	public static boolean checkIsDigit(String number) {
		boolean isDigit = true;
		int numLen = number.length();
		for (int i = 0; i < numLen && isDigit; i++) {
			if (!Character.isDigit(number.charAt(i)))
				 isDigit = false;
		}
		return isDigit;
	}

}
