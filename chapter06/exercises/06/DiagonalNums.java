/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 6

Task:
Write an application that prompts the user for a single-digit integer
and uses a loop to create the pattern shown in the example in
Figure 6-32. In the example, the user entered a 3, and 10 lines are
displayed; each 3 appears one additional space to the right. Save the
file as DiagonalNums.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DiagonalNums {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final int NUMBER_OF_LINES = 10;
		int number;

		System.out.print("Etner single-digit number >> ");
		number = input.nextInt();

		 for (int i = 0; i < NUMBER_OF_LINES; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			System.out.println(number);
		 }



	}

}
