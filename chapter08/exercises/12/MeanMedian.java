/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 12a

Task:
The mean of a list of numbers is its arithmetic average. The median of a list is its middle value when the
values are placed in order. For example, if an ordered list contains 1, 2, 3, 4, 5, 6, 10, 11, and 12, then the
mean is 6, and their median is 5. Write an application that allows you to enter nine integers and displays
the values, their mean, and their median. Save the file as MeanMedian.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class MeanMedian
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int entry, mean, sub, median, sum = 0;
		final int LIMIT = 9;
		int[] numbers = new int[LIMIT];
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print("Enter an integer >> ");
			entry = input.nextInt();
			numbers[i] = entry;
			sum += entry; 
		}
		Arrays.sort(numbers);
		mean = sum / 9;
		if(numbers.length % 2 == 0)
			median = (numbers[(numbers.length / 2) - 1] +
					numbers[(numbers.length / 2) + 1]) / 2;
		else
			median = numbers[numbers.length / 2];
		System.out.print("Numbers: ");
		for(int n : numbers)
			System.out.print(n + " ");
		System.out.println();
		System.out.println("Mean is " + mean + " and median is " + median);
	}
}
