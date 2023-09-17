/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 5

Task:
Write an application that prompts the user to enter an integer and displays its square root. Accept the user?s
entry as a String using the nextLine() method. Then try to use the Integer.parseInt() method to
convert the String to an integer. If the conversion throws an Exception, display an error message, and set
the number to 0. Then, if the entered number is less than 0, throw an ArithmeticException to a catch
block that explains you cannot take the square root of a negative number. If the entered number is not less than
0, take the square root of the number using the Math.sqrt() method, and display the result.
Save the file as SqrtException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class SqrtException
{
	public static void main(String[] args)
	{
		int number = 0;
		String userInput;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer >> ");
		userInput = input.nextLine();
		try
		{
			number = Integer.parseInt(userInput);
			if(number < 0)
				throw(new ArithmeticException(
					"You can not take the square root of a negative number"));
		}
		catch (NumberFormatException nfe)
		{
			number = 0;
			System.out.println("Wrong input, number is set to 0");
		}
		catch(ArithmeticException sqrt)
		{
			System.out.println(sqrt.getMessage());
		}
		if(!(number < 0))
			System.out.println("Square root of " + number + " is " + Math.sqrt(number));
	}
}
