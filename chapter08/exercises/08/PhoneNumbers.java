/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 8

Task:
Create a personal phone directory that contains room for first names and phone numbers for 30 people. Assign
names and phone numbers for the first 10 people. Prompt the user for a name, and if the name is found in the
list, display the corresponding phone number. If the name is not found in the list, prompt the user for a phone
number, and add the new name and phone number to the list. Continue to prompt the user for names until the
user enters quit. After the arrays are full (containing 30 names), display a message if the user tries to make an
additional entry, and end the program. Save the file as PhoneNumbers.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.*;

public class PhoneNumbers
{
	public static void main(String[] args)
	{
		final int CAPACITY = 12;
		String[][] directory = new String[CAPACITY][2];
		int count = 0;
		String entry;
		final String EXIT = "quit";
		Scanner input = new Scanner(System.in);
		directory[0][0] = "Jakov";
		directory[0][1] = "+387 63 193 552";
		count++;
		directory[1][0] = "Mate";
		directory[1][1] = "+387 63 123 321";
		count++;
		directory[2][0] = "Jure";
		directory[2][1] = "+376 63 321 123";
		count++;
		directory[3][0] = "Kreso";
		directory[3][1] = "+387 63 323 321";
		count++;
		directory[4][0] = "Stipe";
		directory[4][1] = "+387 63 345 566";
		count++;
		directory[5][0] = "Jadranko";
		directory[5][1] = "+387 63 982 253";
		count++;
		directory[6][0] = "Spomenko";
		directory[6][1] = "+387 63 222 983";
		count++;
		directory[7][0] = "Berislav";
		directory[7][1] = "+387 63 992 543";
		count++;
		directory[8][0] = "Andrija";
		directory[8][1] = "+387 63 772 123";
		count++;
		directory[9][0] = "Davor";
		directory[9][1] = "+387 63 345 675";
		count++;
		System.out.println("\nP h o n e     d i r e c t o r y\n");
		System.out.print("Enter name to see phone number or " + EXIT + " to quit >> ");
		entry = input.nextLine();
		while(!entry.equalsIgnoreCase(EXIT))
		{
			int dirEntry = checkName(directory, count, entry);
			if (dirEntry >= 0)
			{
				System.out.println(directory[dirEntry][0] + "'s number: " + directory[dirEntry][1]);
			}
			else
			{
				if(entry.equalsIgnoreCase(EXIT))
					count = CAPACITY;
				else
					if(count < CAPACITY)
				{
						directory[count][0] = entry;
						System.out.print("Enter " + entry + "'s phone number >> ");
						String newPhoneNumber = input.nextLine();
						directory[count][1] = newPhoneNumber;
						count++;
				}
				else
					System.out.println("Phone directory is full!");
			}
			System.out.print("Enter name to see phone number or " + EXIT + " >> ");
			entry = input.nextLine();
		}
	}

	public static int checkName(String[][] directory, int limit, String name)
	{
		for(int i = 0; i < limit; i++)
		{
			if(directory[i][0].equalsIgnoreCase(name))
				return i;
		}
		return -1;
	}
}
