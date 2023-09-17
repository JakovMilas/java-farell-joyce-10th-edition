/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter , exercise 2

Task:
The Double.parseDouble() method requires a String argument, but it fails if the String cannot be
converted to a floating-point number. Write an application in which you try accepting a double input from
a user and catch a NumberFormatException if one is thrown. The catch block forces the number to 0
and displays an appropriate error message. Following the catch block, display the number.
Save the file as TryToParseDouble.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.*;

public class TryToParseDouble
{
	public static void main(String[] args)
	{
		String input;
		double number;
		try
		{
			input = JOptionPane.showInputDialog(null, "Enter double value");
			number = Double.parseDouble(input);
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Wrong input");
			number = 0;
		}
		JOptionPane.showMessageDialog(null, "The double value is " + number);
	}
}
