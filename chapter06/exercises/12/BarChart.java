/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 12a

Task:
The Huntington High School basketball team has five players
 named Ali, Bob, Cai, Dan, and Eli. Accept the number of
points scored by each player in a game, and create a bar
chart that illustrates the points scored by displaying an
asterisk for each point. The output looks similar to the chart
in Figure 6-34. Save the file as BarChart.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class BarChart {

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
		System.out.print("Enter points earned by " + name + " >> ");
		int points = input.nextInt();
		return points;
	}

	public static void displayBar(int points, String name) {
		System.out.print(name + ": ");
		for (int i = 0; i < points; i++)
			System.out.print("*");
		System.out.println();
	}

}
