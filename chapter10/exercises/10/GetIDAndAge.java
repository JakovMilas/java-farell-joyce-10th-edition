/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 10b

Task:
Write a program named GetIDAndAge that continually prompts the user for an integer ID number and
an integer age until a terminal 0 is entered for both. Throw a DataEntryException if the ID is not in
the range of valid ID numbers (0 through 999), or if the age is not in the range of valid ages (0 through
119). Catch any DataEntryException or InputMismatchException that is thrown, and display an
appropriate message. Save the file as GetIDAndAge.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class GetIDAndAge
{
	public static void main(String[] args)
	{
		final int exit = 0;
		int id = 9999, age = 9999;
		int count = 1;
		Scanner input = new Scanner(System.in);

		while(id != exit || age != exit)
		{
			try
			{
				System.out.print("Enter #" + count + " ID >> ");
				id = input.nextInt();
				if(id < 0 || id > 999)
					throw (new DataEntryException("ID must be between 0 and 999"));
			}
			catch(DataEntryException e)
			{
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong data type");
				id = 9999;
			}
			input.nextLine();
			try
			{
				System.out.print("Enter #" + count + " age >> ");
				age = input.nextInt();
				if(age < 0 || age > 119)
					throw (new DataEntryException("Age must be between 0 and 119"));
			}
			catch(DataEntryException e)
			{
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong data type");
				id = 9999;
			}
			input.nextLine();
			count++;
		}
	}	
}
