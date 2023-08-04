/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 5

Task:
Write an application that displays every perfect number from 1 through
a user-supplied limit. A perfect number is one that equals the sum of
all the numbers that divide evenly into it. Figure 6-32 Typical execution
of For example, 6 is perfect because 1, 2, and 3 divide evenly into it,
and the DiagonalNums application their sum is 6; however, 12 is not a
perfect number because 1, 2, 3, 4, and 6 divide evenly into it, and
their sum is greater than 12. Save the file as Perfect.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int limit;
		int sum;

		System.out.print("Enter limit for displaying perfect numbers >> ");
		limit = input.nextInt();

		for (int i = 1; i <= limit ; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i)
				System.out.println(i + " is perfect number.");
		}
	}
}
