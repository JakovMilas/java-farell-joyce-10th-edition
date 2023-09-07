/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 9c

Task:
Write an application in which you declare a PhoneCall reference. Then continually prompt the user
for a type of call until a sentinel value is entered. Create either an IncomingPhoneCall object or an
OutgoingPhoneCall object and assign it to the PhoneCall reference. Then display the data for the
object. Save the file as DemoPhoneCalls.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;

public class DemoPhoneCalls
{
	public static void main(String[] args)
	{
		PhoneCall call = new IncomingPhoneCall("");
		String entry;
		char c;
		char SENTINEL = 'Q';
		Scanner input = new Scanner(System.in);

		System.out.print("Select:\nI for incoming call\n" +
				"O for outgoing call\n" + SENTINEL + " for QUIT\n >> ");
		entry = input.nextLine().toUpperCase();
		c = entry.charAt(0);

		while(c != SENTINEL && c != 'I' && c != 'O')
		{
			System.out.print("Try again:\nI - incoming call\n" +
					"O - outgoing call\n" + SENTINEL + " for QUIT\n >> ");
			entry = input.nextLine().toUpperCase();
			c = entry.charAt(0);
		}
		if(c == 'I')
		{
			System.out.print("Enter phone number >> ");
			entry = input.nextLine();
			call = new IncomingPhoneCall(entry);
		}
		else
			if(c == 'O')
			{
				System.out.print("Enter phone number >> ");
				entry = input.nextLine();
				System.out.print("Enter call duration >> ");
				int duration = input.nextInt();
				call = new OutgoingPhoneCall(entry, duration);
			}
			else
				System.out.println("Goodbye, have a nice day!");
				
		if (c != SENTINEL)
		{
			call.display();
		}

	}
}
