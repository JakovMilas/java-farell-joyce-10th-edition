/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 05a

Task:
Write a program that declares named constants to represent the number of inches, feet, and yards in
a mile. Also declare a variable named miles to represent a number of miles and assign a value to it.
Compute and display, with explanatory text, the value in inches, feet, and yards. Save the program as
MileConversions.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



public class MileConversion {

	public static void main(String[] args) {

		final int INCHES_IN_MILE = 63360;
		final int FEET_IN_MILE = 5280;
		final int YARDS_IN_MILE = 1760;
		int miles = 17;

		int inches = miles * INCHES_IN_MILE;
		int feet = miles * FEET_IN_MILE;
		int yards = miles * YARDS_IN_MILE;

		System.out.println("In " + miles + " miles there is " +
			inches + " inches, " +
			feet + " feet, " +
			inches + " inches");

	}

}
