/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 4c

Task:
Create an application that prompts the user for the type of Poem to be created using an integer 1 through 4.
Continue to reprompt the user until a valid number is entered. Then prompt the user for the title. If it is
a plain Poem, also prompt the user for the number of lines. Instantiate the correct object, and display its
details. Save the file as DemoPoems.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DemoPoems
{
	public static void main(String[] args)
	{
		Poem poem = enterData();

		System.out.println("\nPoem details:");
		System.out.println("Name: " + poem.getName());
		System.out.println("Number of lines: " + poem.getNumberOfLines());
	}
	public static Poem enterData()
	{
		String name;
		int choice;
		Poem poem;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name of the poem >> ");
		name = input.nextLine();
		System.out.print("Enter type of the poem\n1 for plane Couplet\n" +
				"2 for Haiku\n3 for Limerick\n4 for plane Poem\n >> ");
		choice = input.nextInt();
		while(choice < 0 || choice > 4)
		{
			System.out.print("Try again, enter type of the poem\n1 for Couplet\n" +
				"2 for Haiku\n3 for Limerick\n4 for plane Poem\n >> ");
			choice = input.nextInt();
		}
		if(choice == 1)
			poem = new Couplet(name);
		else
			if(choice == 2)
				poem = new Haiku(name);
			else
				if(choice == 3)
					poem = new Limerick(name);
				else 
				{
					System.out.print("Enter number of lines fot the poem >> ");
					int numLines = input.nextInt();
					poem = new Poem(name, numLines);
				}
		return poem;
	}
		
}
