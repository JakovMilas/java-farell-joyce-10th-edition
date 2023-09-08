/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 12c

Task:
Write an application named DemoTurners that prompts the user to enter a type of turner and
demonstrates the turn() method for the class. Save the file as DemoTurners.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DemoTurners
{
	public static void main(String[] args)
	{
		String entry;
		boolean isValid = true;
		Turner turner = new Leaf();
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter type of turner:\n - leaf\n - page\n - pancake\n >> ");
		entry = input.nextLine().toLowerCase();
		if(entry.startsWith("lea"))
			turner = new Leaf();
		else
			if(entry.startsWith("pag"))
				turner = new Page();
			else
				if(entry.startsWith("pan"))
					turner = new Pancake();
				else
				{
					System.out.println("Wrong input.");
					isValid = false;
				}
		if(isValid)
			turner.turn();
	}
}
