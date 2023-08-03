/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 4

Task:
Write an application that prompts a user for two integers and displays
every integer between them. Display a message if there are no integers
between the entered values. Make sure the program works regardless of
which entered value is larger. Save the file as Inbetween.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Inbetween {

	public static void main(String[] args) {

		int first;
		int second;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer >> ");
		first = input.nextInt();
		System.out.print("Enter second integer >> ");
		second = input.nextInt();

		System.out.print("Between numbers: ");
		if (first < second) {
			for (int i = first + 1; i < second; i++)
				System.out.print(i + " ");
			System.out.println();
		} else
			if (first > second) {
				for (int i = second + 1; i < first; i++)
					System.out.print(i + " ");
				System.out.println();
		} else
			System.out.println("none");

	}

}
