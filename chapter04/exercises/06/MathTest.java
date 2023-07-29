/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 6

Task:
Write a Java application that prompts the user for an int and a double and
then uses Math class methods to display each of the following:
a. The square root of the int
b. A random number between 0 and the int (Hint: The Math.random() method
   returns a value between 0 and 1. For example, if the int is 10, you want
   a number that is 10 times larger than the value returned.)
c. The value of the floor, ceiling, and round of the double
d. The larger and the smaller of the int and the double
Save the application as MathTest.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class MathTest {

		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int intNumber;
		double doubleNumber;

		System.out.print("Enter an integer >> ");
		intNumber = input.nextInt();
		System.out.print("Enter an double >> ");
		doubleNumber = input.nextDouble();

		System.out.println("\nSquare root of the int: " + Math.sqrt(intNumber));
		System.out.println("Random number between " + intNumber + " and 0: " +
						((int)(Math.random() * intNumber)));
		System.out.println("Floor of " + doubleNumber + " is " + Math.floor(doubleNumber));
		System.out.println("Ceiling of " + doubleNumber + " is " + Math.ceil(doubleNumber));
		System.out.println("Round of " + doubleNumber + " is " + Math.round(doubleNumber));
		System.out.println("Smaller of " + intNumber + " and " + doubleNumber + " is " +
						Math.min(intNumber, doubleNumber));
		System.out.println("Larger of " + intNumber + " and " + doubleNumber + " Is " +
						Math.max(intNumber, doubleNumber));

	}

}
