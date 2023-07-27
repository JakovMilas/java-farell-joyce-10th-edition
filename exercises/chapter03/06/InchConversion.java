/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 06

Task:
There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion. Its main() method
accepts a value in inches from a user at the keyboard and then passes the entered value to two methods.
One converts the value from inches to feet, and the other converts the same value from inches to yards. Each
method displays the results with appropriate explanation. Save the application as InchConversion.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class InchConversion {

	public static void main(String[] args) {

		int inches;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of inches >> ");
		inches = input.nextInt();

		inchesToFeet(inches);
		inchesToYards(inches);

	}

	public static void inchesToFeet(int inches) {

		System.out.println("In " + inches + " inches there is " + (inches / 12) +
			" feet and " + (inches % 12) + " inches.");

	}

	public static void inchesToYards(int inches) {

		System.out.println("In " + inches + " inches there is " +
			(inches / 12 / 3) + " yards, " +
			(inches / 12 % 3) + " feet and " +
			(inches % 12) + " inches.");

	}

}
