/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 4d

Task:
Modify the PigDiceGame application so that if a player rolls a 1, not only
does the player’s turn end, but all the player’s earned points during that
round are eliminated. (Points from earlier rounds are not affected. That is,
when either the player or computer rolls a 1, all the points accumulated
since the other’s turn are subtracted.) Save the game as PigDiceGame2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class PigDiceGame2 {

	private static final int GOAL = 100;
	private static int playerTotal;
	private static int computerTotal;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("\n*****************************" +
						   "\n         GAME: PIG DICE" +
						   "\n       Game goal 100 points" +
						   "\n*****************************");
		System.out.print("Press ENTER to start the game >> ");
		input.nextLine();

		while (playerTotal < GOAL && computerTotal < GOAL) {
			System.out.println("\nYour turn!");
			playerRoll();
			System.out.println("Your total: " + playerTotal);
			if (playerTotal < GOAL) {
				System.out.println("\nComputer's turn!");
				computerRoll();
			}
			System.out.println("Computer's total: " + computerTotal);
		}

		if (playerTotal > computerTotal)
			System.out.println("\nYou win!");
		else
			System.out.println("\nComputer won!");
	}

	private static void playerRoll() {
		Scanner input = new Scanner(System.in);
		Die d1 = new Die();
		Die d2 = new Die();
		int die1 = d1.getValue();
		int die2 = d1.getValue();
		int choice = 1;
		while (playerTotal < GOAL && choice == 1 && die1 != 1 && die2 != 1) {
			System.out.print("Enter 1 to roll the dice or any other to pass >> ");
			choice = input.nextInt();
			if (choice == 1) {
				d1 = new Die();
				d2 = new Die();
				die1 = d1.getValue();
				die2 = d2.getValue();
				System.out.println("You rolled: " + die1 + ", " + die2);
				if (die1 == 1 && die2 == 1) {
					System.out.println("You rolled two 1's!");
					playerTotal = 0;
				} else
					if (die1 == 1 || die2 == 1) {
					System.out.println("Your rolled 1!");
				} else {
					playerTotal += (die1 + die2);
					System.out.println("Your total: " + playerTotal);
					System.out.println("Do you want to roll again?");
				} 
			
			} else {
				System.out.println("You pass...");
			}
		}
	}

	private static void computerRoll() {
		Die d1 = new Die();
		Die d2 = new Die();
		int die1 = d1.getValue();
		int die2 = d2.getValue();
		double choice = 1;
		while (computerTotal < GOAL && choice >= 0.5 && die1 != 1 && die2 != 1) {
			if (choice >= 0.5) {
				d1 = new Die();
				d2 = new Die();
				die1 = d1.getValue();
				die2 = d2.getValue();
				System.out.println("Computer rolled: " + die1 + ", " + die2);
				if (die1 == 1 && die2 == 1) {
					System.out.println("Computer rolled two 1's!");
					computerTotal = 0;
				} else
					if (die1 == 1 || die2 == 1) {
						System.out.println("Computer rolled 1!");
				} else {
					computerTotal += (die1 + die2);
					System.out.println("Computer total: " + computerTotal);
					choice = Math.random();
				}
			} else {
				System.out.println("Computer pass...");
			}
		}
	}

}
