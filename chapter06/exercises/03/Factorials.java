/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 3

Task:
Write an application that displays the factorial for every integer value
from 1 to a user-entered limit. A factorial of a number is the product
of that number multiplied by each positive integer lower than it.
For example, 4 factorial is 4 * 3 * 2 * 1, or 24. (You can use the int
data type for the factorial, but if you enter a number greater than 16,
the results will be unexpected because the factorial value exceeds the
largest value that can be stored in an int.)
Save the file as Factorials.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Factorials {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int limit;

		System.out.print("Enter limit for display factorials >> ");
		limit = input.nextInt();
		for (int i = 1; i <= limit; i++) {
			System.out.println("Factorial for " + i + " is " +
							getFactorial(i));
		}

	}

	public static long getFactorial(int i) {
		long factorial = 1;
		for (int j = 1; j <= i; j++)
			factorial *= j;
		return factorial;
	}
	
}
