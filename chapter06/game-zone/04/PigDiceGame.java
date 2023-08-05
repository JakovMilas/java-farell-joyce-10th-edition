/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 4c

Task:
Using the Die class, create a version of the dice game Pig that a user can
play against the computer. The object of the game is to be the first to
score 100 points. The user and computer take turns rolling a pair of dice
following these rules:
 ❯❯ On a turn, each player “rolls” two dice. If no 1 appears, the dice values
    are added to a running total, and the player can choose whether to roll
	again or pass the turn to the other player.
 ❯❯ If a 1 appears on one of the dice, nothing more is added to the player’s
    total, and it becomes the other player’s turn.
 ❯❯ If a 1 appears on both of the dice, not only is the player’s turn over,
    but the player’s entire accumulated score is reset to 0.
 ❯❯ In this version of the game, when the computer does not roll a 1 and can
    choose whether to roll again, generate a random value between 0 and 1.
	Have the computer continue to roll the dice when the value is 0.5 or more,
	and have the computer quit and pass the turn to the player when the value
	is not 0.5 or more.
Save the game as PigDiceGame.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class PigDiceGame {

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
