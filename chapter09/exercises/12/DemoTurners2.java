/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 12c

Task:
Think of two more objects that use turn(), create classes for them, and then add objects to the
DemoTurners application, renaming it DemoTurners2.java. Save the files, using the names of new
objects that use turn().

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DemoTurners2
{
	public static void main(String[] args)
	{
		String entry;
		boolean isValid = true;
		Turner turner = new Leaf();
		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter type of turner:\n - leaf\n - page\n" +
				" - pancake\n - record\n - ted\n  >> ");
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
					if(entry.startsWith("rec"))
						turner = new Record();
					else
						if(entry.startsWith("ted"))
							turner = new Ted();
						else
						{
							System.out.println("Wrong input.");
							isValid = false;
						}
		if(isValid)
			turner.turn();
	}
}
