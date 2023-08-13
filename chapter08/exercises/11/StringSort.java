/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 11

Task:
Write an application containing an array of 15 String values. Accept any number of Strings
up to 15 from a user and display them in ascending order. Save the file as StringSort.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class StringSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String userInput;
		int count = 0;
		final String EXIT = "ZZZ";
		String[] strings  = new String[15];
		System.out.println("\nS t r i n g    s o r t\n");
		System.out.print("Enter an string or " + EXIT + " to exit >> ");
		userInput = input.nextLine();
		while(count < strings.length && !userInput.equalsIgnoreCase(EXIT))
		{
			strings[count] = userInput;
			count++;
			if(userInput.equalsIgnoreCase(EXIT))
				break;
			else
			{
				System.out.print("Enter an string or " + EXIT + " to exit >> ");
				userInput = input.nextLine();
			}
		}
		Arrays.sort(strings, 0, count);
		System.out.println();
		for(int i = 0; i < count; i++)
			System.out.println(strings[i]);
		System.out.println();
	}
}
