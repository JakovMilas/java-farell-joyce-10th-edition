/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 06b

Task:
Write an interactive version of the InchesToFeet class that accepts the inches value from a user.
Save the class as InchesToFeetInteractive.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {

		int inches;
		final int INCHES_IN_FOOT = 12;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of inches >> ");
		inches = input.nextInt();

		int feet = inches / INCHES_IN_FOOT;
		int restInches = inches % INCHES_IN_FOOT;

		System.out.println(inches + " inches equals " + feet + " feet and " + restInches + " inches.");

	}

}
