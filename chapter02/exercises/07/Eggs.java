/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 07

Task:
Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs or 45
cents for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of
eggs in the order and then display the amount owed with a full explanation. For example, typical output might
be You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each
for a total of $7.85. Save the program as Eggs.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {

		final int EGGS_IN_DOZEN = 12;
		final double DOZEN_PRICE = 3.25;
		final double LOOSE_EGG_PRICE = 0.45;
		int eggsOrdered;
		int numberOfDozen;
		int looseEggs;
		double totalPrice;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of eggs >> ");
		eggsOrdered = input.nextInt();

		numberOfDozen = eggsOrdered / EGGS_IN_DOZEN;
		looseEggs = eggsOrdered % EGGS_IN_DOZEN;
		totalPrice = (numberOfDozen * DOZEN_PRICE) + (LOOSE_EGG_PRICE * looseEggs);

		System.out.println("You ordered " + eggsOrdered + "eggs.");
		System.out.println("That's " + numberOfDozen + " dozen at $" + DOZEN_PRICE + " per dozen");
		System.out.println("and " + looseEggs + " lose eggs at $" + LOOSE_EGG_PRICE + " each ");
		System.out.println("for a total of $" + totalPrice);

	}

}
