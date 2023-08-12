/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 4

Task:
Create an application that prompts a user for 10 integers and stores them in an array.
The application should call five methods that in turn 
(1) display all the integers,
(2) display all the integers in reverse order,
(3) display the sum of the integers,
(4) display all values less than 12 or a message if none are less than 12, and
(5) display all values that are higher than the calculated average value.
Save the file as ArrayMethodDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class ArrayMethodDemo
{
	public static void main(String[] args)
	{
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print("Enter integer #" + (i + 1) + " >> ");
			numbers[i] = input.nextInt();
		}
		displayIntegers(numbers);
		displayIntegersReverse(numbers);
		displaySumOfIntegers(numbers);
		displayLessThanTwelve(numbers);
		displayHigherThanAverage(numbers);
	}
	public static void displayIntegers(int[] nums)
	{
		System.out.print("Integers: ");
		for(int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}
	public static void displayIntegersReverse(int[] nums)
	{
		System.out.print("Integers reverse: ");
		for(int i = nums.length - 1; i >= 0; i--)
			System.out.print(nums[i] + " ");
		System.out.println();
	}
	public static void displaySumOfIntegers(int[] nums)
	{
		int sum = 0;
		for(int i = 0; i < nums.length; i++)
			sum += nums[i];
		System.out.println("Sum of integers: " + sum);
	}
	public static void displayLessThanTwelve(int[] nums)
	{
		boolean isLowerFound = false;
		String lowerNumbers = "";
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] < 12)
			{
				isLowerFound = true;
				lowerNumbers += nums[i] + " ";
			}
		}
		if(isLowerFound)
			System.out.println("Integers lower than 12: " + lowerNumbers);
		else
			System.out.println("There is no numbers lower than 12");
	}
	public static void displayHigherThanAverage(int[] nums)
	{
		int sum = 0;
		int average;
		for(int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
		}
		average = sum / nums.length;
		System.out.print("Numbers higher than the average: ");
		for(int i = 0; i < nums.length; i++)
			if(nums[i] > average)
				System.out.print(nums[i] + " ");
		System.out.println();

	}
}
