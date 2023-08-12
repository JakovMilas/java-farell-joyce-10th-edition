/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 1

Task:
Write an application that stores nine integers in an array named numbers.
Display the integers from first to last, and then display the integers from
last to first. Save the file as NineInts.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class NineInts
{
	public static void main(String[] args)
	{
		int[] ints = {3, 23, 16, 7, 12, 5, 9, 10, 14};

		System.out.print("Nine ints from first to last: ");
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		System.out.println();
		System.out.print("Nine ints form last to first: ");
		for(int i = ints.length - 1; i >= 0; i--)
			System.out.print(ints[i] + " ");
		System.out.println();
	}
}
