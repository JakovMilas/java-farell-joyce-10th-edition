/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 04b

Task:
Convert the QuartsToGallons program to an interactive application. Instead of
assigning a value to the number of quarts, accept the value from the user as input.
Save the revised program as QuartsToGallonsInteractive.java.
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
