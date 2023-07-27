/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, Game Zone 2

Task:
Recall how to obtain a random number. For example, the following statement generates a random
number between the constants MIN and MAX inclusive and assigns it to a variable named random:
random = MIN + (int)(Math.random() * MAX);
Write a program that declares final values for MIN and MAX within its main() method and passes
the values to a method that displays a message asking the user to guess a value between MIN
and MAX. Accept the user’s guess and return it to the main() method. Set a boolean variable
to true if the user guessed the value and false if the user did not guess the value. Call a
method that accepts the random value, the user’s guess value, and the boolean value and then
displays all the values as well as how far away the user’s guess was from the random number.
Save the file as RandomGuessMatchWithMethods.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class RandomGuessMatchWithMethods {

	public static void main(String[] args) {

		final int MIN = 1;
		final int MAX = 6;
		int guessValue;
		int randomValue = (int)(Math.random() * MAX) + MIN;
		boolean isGuess;

		guessValue = guessInput(MIN, MAX);
		isGuess = (guessValue == randomValue);
		displayValues(guessValue, randomValue, isGuess);

	}

	public static int guessInput(final int MIN, final int MAX) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an number between " + MIN + " and " + MAX + " >> ");
		int guess = input.nextInt();
		return guess;

	}

	public static void displayValues(int guess, int random, boolean isGuess) {

		int difference = Math.abs(guess - random);
		System.out.println("\nGuess value: " + guess +
						   "\nRandom value: " + random +
						   "\nYour guess is: " + isGuess +
						   "\nYou missed it by: " + difference);

	}

}
