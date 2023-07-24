/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 06a

Task:
Write a program that declares a variable named inches, which holds a length in inches, and assign a
value. Display the value in feet and inches; for example, 86 inches becomes 7 feet and 2 inches. Be sure to
use a named constant where appropriate. Save the program as InchesToFeet.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



public class InchesToFeet {

	public static void main(String[] args) {

		int inches = 1234;
		final int INCHES_IN_FOOT = 12;
		int feet = inches / INCHES_IN_FOOT;
		int restInches = inches % INCHES_IN_FOOT;

		System.out.println(inches + " inches equals " + feet + " feet and " + restInches + " inches.");

	}

}
