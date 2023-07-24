/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 04b

Task:
Write an interactive version of the InchesToFeet class that accepts the inches value from a user.
Save the class as InchesToFeetInteractive.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {

		final int QUARTS_IN_GALLON = 4;
		int quartsNeeded;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of quarts needed >> ");
		quartsNeeded = input.nextInt();

		int gallons = quartsNeeded / QUARTS_IN_GALLON;
		int quarts = quartsNeeded % QUARTS_IN_GALLON;

		System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
						gallons + " gallons plus " + quarts + " quarts.");

	}

}
