/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 7c

Task:
Create an application that prompts the user for the type of Rock collected. If the user does not enter
U, I, S, or M for the Rock type, then create a Rock with sample number 0 and weight 0. If the user selects
a valid Rock type, then prompt the user for the sample number and the weight. Create the appropriate
type of Rock, then pass it to a method that accepts a Rock parameter and displays all the details for the
Rock. Save the file as DemoRocks.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DemoRocks
{
	public static void main(String[] args)
	{
		String entry;
		char c;
		int numberOfSamples;
		int weight;
		Rock rock;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter rock type:\nU - unclassified\nI - Ingeous\n" + 
				"S - Sedimentary\n" + "M - Metaporphic\n >> ");
		entry = input.nextLine().toUpperCase();
		c = entry.charAt(0);

		if(c != 'U' && c != 'I' && c != 'S' && c != 'M')
		{
			rock = new Rock(0,0);
		}
		else
		{
			System.out.print("Enter number of samples >> ");
			numberOfSamples = input.nextInt();
			input.nextLine();
			System.out.print("Enter weight >> ");
			weight = input.nextInt();

			if(c == 'I')
				rock = new IgneousRock(numberOfSamples, weight);
			else
				if(c == 'M')
					rock = new MetamorphicRock(numberOfSamples, weight);
				else
					if(c == 'S')
						rock = new SedimentaryRock(numberOfSamples, weight);
					else
						rock = new Rock(numberOfSamples, weight);
			display(rock);
		}
	}

	public static void display(Rock rock)
	{
		System.out.println("\nRock details:");
		System.out.println("Number of samples: " + rock.getNumberOfSamples());
		System.out.println("Description: " + rock.getDescription());
		System.out.println("Weight in grams: " + rock.getWeight());
		System.out.println();
	}

}
