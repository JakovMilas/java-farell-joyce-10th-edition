/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 2

Task:
Create a game that generates a random number from 1 to 10. Include a loop that
continually prompts the user for the number, indicating whether the guess is high
or low, until the user enters the correct value. After the user correctly guesses
the number, display a count of the number of attempts it took.
Save the file as RandomGuess3.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;
import java.util.Random;

public class RandomGuess3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int guess, rand;
		Random random = new Random();
		rand = random.nextInt(10) + 1;
		
		System.out.print("Enter your guess >> ");
		guess = input.nextInt();

		while (guess != rand) {
			if (guess < rand)
				System.out.println("\nYour guess is lower than random number");
			else
				System.out.println("\nYour guess is higher than random number");
			System.out.print("Try againg >> ");
			guess = input.nextInt();
		}

		System.out.println("\nYou guessed it! The number was " + rand);
		
	}

}
