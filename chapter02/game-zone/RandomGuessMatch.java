/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, Game Zone 2

Task:
Recall how to obtain a random number. For example, the following statement generates a random number
between the constants MIN and MAX inclusive and assigns it to a variable named random:
random = MIN + (int)(Math.random() * MAX);
Write a program that selects a random number between 1 and 5 and asks the user to guess the number. Display
a message that indicates the difference between the random number and the user’s guess. Display another
message that displays the random number and the Boolean value true or false depending on whether the
user’s guess equals the random number. Save the file as RandomGuessMatch.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {

		int random = (int)(Math.random() * 5) + 1;
		int guess;
		Scanner input = new Scanner(System.in);

		System.out.print("Guess number from 1 to 5 >> ");
		guess = input.nextInt();

		System.out.println("Difference between random number and your number is " + (Math.abs(guess - random)));
		System.out.println("Your guess equals random number is " + (guess == random));

	}

}
