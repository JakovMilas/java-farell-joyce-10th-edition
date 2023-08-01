/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Game Zone 1

Task:
Create a class called RandomGuess2 that contains a game in which a player
guesses a random number. (See Appendix D for help with creating a random number.) Allow a player to enter a guess, and then display a message indicating whether
the player’s guess was correct, too high, or too low.
Save the file as RandomGuess2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;

public class RandomGuess2 {

	public static void main(String[] args) {
	
		String message;
		int randomNumber = (int)(Math.random() * 10) + 1;
		System.out.println(randomNumber);
		String userInput = JOptionPane.showInputDialog(null,
						"Guess a number from 1 to 10");
		int guess = Integer.parseInt(userInput);
		if (guess < randomNumber)
			message = "Your guess is lower than random number";
		else
			if (guess > randomNumber)
				message = "your guess is higher than random number";
			else
				message = "Your guess was correct!";
		JOptionPane.showMessageDialog(null, message);

	}

}
