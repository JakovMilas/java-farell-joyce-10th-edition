/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 14c

Task:
Create an application that prompts the user for the type of object to create. Create it, 
and display the message that describes run for the class. Save the file as DemoRunners.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;

public class DemoRunners
{
	public static void main(String[] args)
	{
		String entry;
		Runner runner;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter type of runner:\n - machine (mac)\n" +
				" - athlete (ath)\n - political candidate (pol)\n >> ");
		entry = input.nextLine();
		while(!isValid(entry))
		{
			System.out.println("Wrong input, try again:");
			System.out.print("Enter type of runner:\n - machine (mac)\n" +
				" - athlete (ath)\n - political candidate (pol)\n >> ");
			entry = input.nextLine();
		}

		if(entry.startsWith("mac"))
			runner = new Machine();
		else
			if(entry.startsWith("ath"))
				runner = new Athlete();
			else
				runner = new PoliticalCandidate();
		System.out.println(runner.run());
	}
	public static boolean isValid(String entry)
	{
		if(!entry.startsWith("mac") && !entry.startsWith("ath")
				&& !entry.startsWith("pol"))
			return false;
		return true;
	}
}
