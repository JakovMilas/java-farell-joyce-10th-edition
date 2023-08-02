/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 5

Task:
In the game Rock Paper Scissors, two players simultaneously choose one
of three options: rock, paper, or scissors. If both players choose the
same option, then the result is a tie. However, if they choose
differently, the winner is determined as follows:
 ❯❯ Rock beats scissors, because a rock can break a pair of scissors.
 ❯❯ Scissors beats paper, because scissors can cut paper.
 ❯❯ Paper beats rock, because a piece of paper can cover a rock.
Create a game in which the computer randomly chooses rock, paper, or
scissors. Let the user enter a number 1, 2, or 3, each representing one
of the three choices. Then, determine the winner.
Save the application as RockPaperScissors.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		String userInput;
		int player;
		int computer;

		JOptionPane.showMessageDialog(null, "GAME: ROCK - PAPER - SCISSORS");

		userInput = JOptionPane.showInputDialog(null, "Select:\n" +
						"1 for Rock\n2 for Paper\n3 for Scissors");

		player = Integer.parseInt(userInput);
		computer = (int)(Math.random() * 3) + 1;

		JOptionPane.showMessageDialog(null,
						"You:             " + choice(player) + "\n" +
						"Computer:  " + choice(computer) + "\n\n" +
						determineWinner(player, computer));

	}

	public static String determineWinner(int player, int computer) {
		String result;
		final int ROCK = 1, PAPER = 2, SCISSORS = 3;

		if (player == ROCK && computer == ROCK)
			result = "It's a tie!";
		else
			if (player == ROCK && computer == PAPER)
				result = "Computer won!";
		else
			if (player == ROCK && computer == SCISSORS)
				result = "You win!";
		else
			if (player == PAPER && computer == ROCK)
				result = "You win!";
		else
			if (player == PAPER && computer == PAPER)
				result = "It's a tie!";
		else
			if (player == PAPER && computer == SCISSORS)
				result = "Computer won!";
		else
			if (player == SCISSORS && computer == ROCK)
				result = "Computer won!";
		else
			if (player == SCISSORS && computer == PAPER)
				result = "You win!";
		else
			result = "It's a tie!";

		return result;


	}

	public static String choice(int number) {
		String word = "";
		switch (number) {
			case 1:
				word = "Rock";
				break;
			case 2:
				word = "Paper";
				break;
			case 3:
				word = "Scissors";
				break;
		}
		return word;
	}

}
