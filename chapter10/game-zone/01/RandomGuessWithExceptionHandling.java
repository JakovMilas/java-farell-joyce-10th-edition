/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, Game Zone 1

Task:
Create an application that generates a random integer for a player to guess. When the player?s guess is not
entered as an integer, catch the Exception that is thrown and allow the player to try again. When the guess
is an integer that is too high or too low, display an appropriate message, and allow the player to guess again.
When the user guesses correctly, display the number of attempts it took to get the right answer.
Save the file as RandomGuessWithExceptionHandling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;
import javax.swing.*;

public class RandomGuessWithExceptionHandling
{
	public static void main(String[] args)
	{
		String input;
		int guessNumber = 0;
		Random random = new Random();
		int randomNumber = random.nextInt(10) + 1;
		boolean isValidInteger = false;
		int count = 0;

		while(randomNumber != guessNumber)
		{
			while (!isValidInteger)
			{
				try
				{
					input = JOptionPane.showInputDialog(null, "Guess a number between 1 and 10");
					guessNumber = Integer.parseInt(input);
					isValidInteger = true;
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "Entry not valid, try again");
				}
			}
			count++;
			isValidInteger = false;
			if(randomNumber > guessNumber)
				JOptionPane.showMessageDialog(null, "Your guess is too low");
			else
				if(randomNumber < guessNumber)
					JOptionPane.showMessageDialog(null, "Your guess is too high");
		}
		JOptionPane.showMessageDialog(null, "Your guessed it in " + count + " attempts");
	}
}
