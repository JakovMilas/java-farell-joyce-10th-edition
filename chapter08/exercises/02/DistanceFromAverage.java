/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 2

Task:
Allow a user to enter any number of double values up to 15. The user should enter 99999 to quit entering
numbers. Display an error message if the user quits without entering any numbers; otherwise, display a count
of the numbers entered, the arithmetic average of the numbers, and each entered value and its distance from
the average. Save the file as DistanceFromAverage.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DistanceFromAverage
{
	public static void main(String[] args)
	{
		double[] numbers = new double[15];
		int count = 0;
		double sum = 0;
		double average;
		final double EXIT = 99999;
		double userInput;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter double value or " + EXIT + " to exit >> ");
		userInput = input.nextDouble();
		while(userInput != EXIT && count < numbers.length)
		{
			numbers[count] = userInput;
			count++;
			if(count == numbers.length)
				break;
			System.out.print("Enter another double value or " + EXIT + " to exit >> ");
			userInput = input.nextDouble();
		}
		if(count > 0)
		{
			for(int i = 0; i < count; i++)
				sum += numbers[i];
			average = sum / count;
			System.out.println("Count of the numbers entered: " + count);
			System.out.println("Arithmetic average of the numbers: " + average);
			System.out.println("Entered values: ");
			for(int i = 0; i < count; i++)
			{
				System.out.println(numbers[i] + ", distance form average is " +
						(Math.abs(average - numbers[i])));
			}
		}
		else
			System.out.println("You did not entered any values");
	}
}
