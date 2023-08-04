/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 12b

Task:
Modify the BarChart program to accept the number of
points scored by each player in a season. The bar chart
displays one asterisk for each 10 points scored by a player.
For example, if a player has scored 48 points, then display
four asterisks. Save the program as BarChart2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class BarChart2 {

	public static void main(String[] args) {

		int ali, bob, cai, dan, eli;

		ali = getPoints("Ali");
		bob = getPoints("Bob");
		cai = getPoints("Cai");
		dan = getPoints("Dan");
		eli = getPoints("Eli");

		System.out.println("\nPoints for Game:");
		displayBar(ali, "Ali");
		displayBar(bob, "Bob");
		displayBar(cai, "Cai");
		displayBar(dan, "Dan");
		displayBar(eli, "Eli");

	}

	public static int getPoints(String name) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter points earned in season by " + name + " >> ");
		int points = input.nextInt();
		return points;
	}

	public static void displayBar(int points, String name) {
		points = points / 10;
		System.out.print(name + ": ");
		for (int i = 0; i < points; i++)
			System.out.print("*");
		System.out.println();
	}

}
