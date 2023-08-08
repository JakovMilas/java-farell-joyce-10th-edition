/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 2

Task:
Create a Rock Paper Scissors game in which the user enters a string rock, paper, or scissors. Allow the choice to
be valid whether the player enters a choice in uppercase letters, lowercase letters, or a combination of the two.
To allow for player misspellings, accept the player?s entry as long as the first two letters are correct. (In other
words, if a player types scixxrs, you will accept it as scissors because at least the first two letters are correct.)
When the player does not type at least the first two letters of the choice correctly, reprompt the player and
continue to do so until the player?s entry contains at least the first two letters of one of the options.
Allow 10 complete rounds of the game. At the end, display counts of the number of times the player won, the
number of times the computer won, and the number of tie games.
Save the file as RockPaperScissors2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissors2 {

	private static final String ROCK = "rock";
	private static final String PAPER = "paper";
	private static final String SCISSORS = "scissors";
	private static String result = "";
	private static final int LIMIT = 10;

	public static void main(String[] args) {
		
		String player;
		String computer;
		Random random = new Random();
		int roundCount = 0;
		int playerCount = 0;
		int computerCount = 0;
		String winner;
		int roundResult;

		JOptionPane.showMessageDialog(null, "GAME: ROCK - PAPER - SCISSORS");
		while (roundCount < LIMIT) {
			player = JOptionPane.showInputDialog(null, "Round " + (roundCount + 1) +
					"\nEnter your choice:\nRock\nPaper\nScissors");
			player = resolvePlayer(player);
			computer = resolveComputer(random.nextInt(3));
			roundResult = determineWinner(player, computer);
			JOptionPane.showMessageDialog(null, "You: " + player.toUpperCase() + "\n" +
					"Computer: " + computer.toUpperCase() + "\n\n" + result);	
			if (roundResult == 1)
				playerCount++;
			else
				if (roundResult == 2)
					computerCount++;
			roundCount++;
		}
		if (playerCount > computerCount)
			winner = "You win!";
		else
			if (playerCount < computerCount)
				winner = "Computer won!";
		else
			winner = "It's a tie!";

		JOptionPane.showMessageDialog(null, "You won " + playerCount + " times" +
				"\nComputer won " + computerCount + " times" +
				"\nTie was " + (LIMIT - playerCount - computerCount) + " times\n" +
				winner);
	}

	public static String resolvePlayer(String player) {
		player = player.toLowerCase();
		boolean isValid = false;
		while (!isValid) {
			if (player.startsWith("ro")) {
				player = ROCK;
				isValid = true;
			} else
				if (player.startsWith("pa")) {
					player = PAPER;
					isValid = true;
			} else
				if (player.startsWith("sc")) {
					player = SCISSORS;
					isValid = true;
			} else
				player = JOptionPane.showInputDialog(null, "Try again, rock, paper or scissors");

		}
		return player;
	}

	public static int determineWinner(String player, String computer) {
		if (player.equals(ROCK) && computer.equals(ROCK)) {
			result = "It's a tie!";
			return 0;
		} else
			if (player.equals(ROCK) && computer.equals(PAPER)) {
				result = "Computer won!";
				return 2;
		} else
			if (player.equals(ROCK) && computer.equals(SCISSORS)) {
				result = "You win!";
				return 1;
		} else
			if (player.equals(PAPER) && computer.equals(ROCK)) {
				result = "You win!";
				return 1;
		} else
			if (player.equals(PAPER) && computer.equals(PAPER)) {
				result = "It's a tie!";
				return 0;
		} else
			if (player.equals(PAPER) && computer.equals(SCISSORS)) {
				result = "Computer won!";
				return 2;
		} else
			if (player.equals(SCISSORS) && computer.equals(ROCK)) {
				result = "Computer won!";
				return 2;
		} else
			if (player.equals(SCISSORS) && computer.equals(PAPER)) {
				result = "You win!";
				return 1;
		} else
			result = "It's a tie!";

		return 0;


	}

	public static String resolveComputer(int number) {
		String str = "";
		switch (number) {
			case 0:
				str = ROCK;
				break;
			case 1:
				str = PAPER;
				break;
			default:
				str = SCISSORS;
				break;
		}
		return str;
	}

}
