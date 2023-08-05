/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 4b

Task:
Use the Die class to create a simple dice game in which the user chooses a number
between 2 (the lowest total possible from two dice) and 12 (the highest total
possible). The user “rolls” two dice up to three times. If the number chosen by
the user comes up, the user wins and the game ends. If the number does not come 
up within three rolls, the computer wins. Save the application as TwoDice3.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TwoDice3 {

	public static void main(String[] args) {

		final int MIN = 2;
		final int MAX = 12;
		final int ROLLS = 3;
		int dice = 0;
		int guess;
		int count = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("\n    GAME: Two Dice 3\n");

		System.out.print("Enter your guess from " + MIN + " to " + MAX + " >> ");
		guess = input.nextInt();
		input.nextLine();
		while (guess < MIN || guess > MAX) {
			System.out.print("Enter your guess from " + MIN + " to " + MAX + " >> ");
			guess = input.nextInt();
			input.nextLine();
		}

		while (dice != guess && count < ROLLS) {
			System.out.print("Press Enter to roll the dice >> ");
			input.nextLine();
			Die die1 = new Die();
			Die die2 = new Die();
			dice = die1.getValue() + die2.getValue();
			count++;
		}

		if (guess != dice)
			System.out.println("Your did not guessed it");
		else
			System.out.println("You guessed it! Dice is " + dice);

	}

}
