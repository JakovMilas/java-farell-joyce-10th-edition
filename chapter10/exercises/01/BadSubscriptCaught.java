/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 1

Task:
Write an application named BadSubscriptCaught in which you declare an array of eight first names. Write a
try block in which you prompt the user for an integer and display the name in the requested position. Create
a catch block that catches the potential ArrayIndexOutOfBoundsException thrown when the user
enters a number that is out of range. The catch block also should display an error message.
Save the file as BadSubscriptCaught.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class BadSubscriptCaught
{
	public static void main(String[] args)
	{
		String[] names = {"John", "James", "Don", "Ben", "Michael", "Ken", "Dolph", "Bruce"};
		int position;
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.print("Enter position to display name >> ");
			position = input.nextInt();
			System.out.println("On position " + position + " is " + names[position]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid position");
		}
	}
}
