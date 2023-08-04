/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 7

Task:
Accept a digit from the user, then display a seven-line triangle pattern
that uses the digit. Figure 6-33 shows a typical execution. The
program can contain no more than three output statements. Save the
file as TriangleWithLoops.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TriangleWithLoops {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number;
		int lines = 7;

		System.out.print("Enter single-digit number >> ");
		number = input.nextInt();

		for (int row = 1; row <= lines; row++) {
			for (int col = lines; col >= row; col--)
				System.out.print(" ");
			for (int num = 1; num < row * 2; num++)
				System.out.print(number);
			System.out.println();
			
		}

	}

}
