/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 2

Task:
Write an application that asks a user to type an even number or the
sentinel value 999 to stop. When the user types an even number,
display the message Good job! and then ask for another input. When
the user types an odd number, display an error message and then ask
for another input. When the user types the sentinel value
999, end the program. Save the file as EvenEntryLoop.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userInput;
		final int SENTINEL = 999;

		System.out.print("Enter an even number >> ");
		userInput = input.nextInt();

		while (userInput != SENTINEL) {
			if(userInput % 2 == 0)
				System.out.print("Good job!\nEnter an even number or " +
								SENTINEL + " to quit >> ");
			else
				System.out.print(userInput + " is not even number, " +
								"try again!\nEnter an even number or " +
								SENTINEL + " to quit >> ");
			userInput = input.nextInt();

		}

	}

}
