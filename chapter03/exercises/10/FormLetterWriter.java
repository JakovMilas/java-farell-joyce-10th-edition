/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 10

Task:
Create a class named FormLetterWriter that includes two overloaded methods named
displaySalutation(). The first method takes one String parameter that represents
a customer’s first name, and it displays the salutation Dear followed by the first
name. The second method accepts two String parameters that represent a first and
last name, and it displays the greeting Dear followed by the first name, a space,
and the last name. After each salutation, display the rest of a short business
letter: Thank you for your recent order. Write a main() method that prompts the
user for a first and last name and tests each overloaded method.
Save the file as FormLetterWriter.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class FormLetterWriter {

	public static void main(String[] args) {

		String firstName;
		String lastName;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your first name >> ");
		firstName = input.nextLine();
		System.out.print("Please enter your last name >> ");
		lastName = input.nextLine();

		displaySalutations(firstName);
		displaySalutations(firstName, lastName);

	}

	public static void displaySalutations(String firstName) {

		System.out.println("\nDear " + firstName + ", thank you for your order.");

	}

	public static void displaySalutations(String firstName, String lastName) {

		System.out.println("Dear " + firstName + " " + lastName +
			", thank you for your order.");

	}

}
