/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 7

Task:
Write an application that allows a user to enter the names and birthdates of up to 10 friends. Continue to
prompt the user for names and birthdates until the user enters the sentinel value ZZZ for a name or has
entered 10 names, whichever comes first. When the user is finished entering names, produce a count of
how many names were entered, and then display the names. In a loop, continually ask the user to type
one of the names and display the corresponding birthdate or an error message if the name has not been
previously entered. The loop continues until the user enters ZZZ for a name.
Save the application as BirthdayReminder.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;
import java.time.*;

public class BirthdayReminder
{
	public static void main(String[] args)
	{
		final int LIMIT = 3;
		final String EXIT = "ZZZ";
		String entry = "";
		int count = 0;
		Scanner input = new Scanner(System.in);
		String names[] = new String[LIMIT];
		LocalDate[] birthdays = new LocalDate[LIMIT];
		System.out.println("\nB i r t h d a y     r e m i n d e r\n");
		System.out.print("Enter friend's name or " + EXIT + " to exit >> ");
		entry = input.nextLine();
		while(count < LIMIT && !entry.equalsIgnoreCase(EXIT))
		{
			names[count] = entry;
			birthdays[count] = enterBirthday();
			count++;
			if(count == LIMIT)
				entry = EXIT;
			else
			{
				System.out.print("Enter friend's name or " + EXIT + " to exit >> ");
				entry = input.nextLine();
			}
		}
		if(count > 0)
		{	
			System.out.println("\n" + count + " names entered.");
			System.out.print("Your friends: ");
			for(int i = 0; i < count; i++)
				System.out.print(names[i] + " ");
			System.out.println();
			entry = "";
			while(!entry.equalsIgnoreCase(EXIT))
			{
				System.out.print("Enter friends name to see his/her birthday >> ");
				entry = input.nextLine();
				int sub = search(names, entry, count);
				if(sub >= 0)
					System.out.println(names[sub] + "'s birhtday is " + birthdays[sub]);
				else
					if(!entry.equalsIgnoreCase(EXIT))
						System.out.println(entry + " is not your friend");
			}
		}
	}
	public static LocalDate enterBirthday()
	{
		int yy, mm, dd;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter friends birthday:");
		System.out.print("Enter year >> ");
		yy = input.nextInt();
		System.out.print("Enter month >> ");
		mm = input.nextInt();
		System.out.print("Enter day >> ");
		dd = input.nextInt();
		LocalDate date = LocalDate.of(yy, mm, dd);
		return date;
	}
	public static int search(String[] names, String name, int limit)
	{
		for(int i = 0; i < limit; i++)
		{
			if(names[i].equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}
}
