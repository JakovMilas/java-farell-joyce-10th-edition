/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 3

Task:
Write a program that accepts a number of quarts from a user and converts the value to gallons. Include
exception-handling capabilities in the program so that while any nonnumeric value is entered, the program
continually displays an error message, reprompts the user, and accepts new input. Save the file as
QuartsToGallonsWithExceptionHandling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.*;

public class QuartsToGallonsWithExceptionHandling
{
	public static void main(String[] args)
	{
		String input;
		boolean isValidInput = false;
		input = JOptionPane.showInputDialog(null, "Enter number of gallons");
		while(!isValidInput)
		{
			try
			{
				int numberOfQuarts = Integer.parseInt(input);
				double numberOfGallons = numberOfQuarts / 4.0;
				JOptionPane.showMessageDialog(null, numberOfQuarts + " quarts equals to "
						+ numberOfGallons + " gallons");
				isValidInput = true;
			}
			catch (NumberFormatException e)
			{
				input = JOptionPane.showInputDialog(null, "Wrong input, try again\nEnter number of quarts");
			}
		}
	}
}
