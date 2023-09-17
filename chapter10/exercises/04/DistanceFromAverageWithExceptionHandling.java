/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 4

Task:
Write a program that prompts the user to enter an integer that represents an array size. Java generates a
NumberFormatException if the user attempts to enter a noninteger value using nextInt(). Handle this
exception by displaying an appropriate error message. If the size entered is an integer, create an array of type
double using the integer entered as the size. Java generates a NegativeArraySizeException if you
attempt to create an array with a negative size; handle this exception by setting the array size to a default
value of five. If the array is created successfully, use exception-handling techniques to ensure that each
entered array value is a double. Then calculate each element?s distance from the average. Save the file as
DistanceFromAverageWithExceptionHandling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class DistanceFromAverageWithExceptionHandling
{
	public static void main(String[] args)
	{
		double[] numbers;
		int arrayLength;
		double value;
		double sum = 0;
		double average;
		boolean isValidInput = false;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array >> ");
		try
		{
			arrayLength = input.nextInt();
			try
			{
				numbers = new double[arrayLength];
			}
			catch(NegativeArraySizeException nae)
			{
				numbers = new double[5];
			}
			for(int i = 0; i < numbers.length; i++)
			{
				while(!isValidInput)
				{
					try
					{
						System.out.print("Enter double value >> ");
						value = input.nextDouble();
						numbers[i] = value;
						isValidInput = true;
					}
					catch(InputMismatchException nfe)
					{
						System.out.println("Wrong input, try again");
					}
					input.nextLine();
				}
				isValidInput = false;
			}
			for(int i = 0; i < numbers.length; i++)
				sum += numbers[i];
			average = sum / numbers.length;
			System.out.printf("\nAverage is %.2f\n", average);
			for(int i = 0; i < numbers.length; i ++)
			{
				System.out.printf("%.2f distance from average is %.2f\n",
						numbers[i], (Math.abs(average - numbers[i])));
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Wrong input");
		}
	}
}
