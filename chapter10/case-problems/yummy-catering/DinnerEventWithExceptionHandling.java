/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Case Problems 1b

Task:
In Chapter 9, you created a DinnerEventDemo class that obtains user data for an array of dinner events for
Yummy Catering and allows the user to sort the events using various criteria. Now, modify the application
so that it becomes immune to user data entry errors by handling exceptions for each numeric entry.
Each time the program requires numeric data?for example, for the number of guests or selected menu
options?continually prompt the user until the data entered is the correct type. Save the revised program as
DinnerEventWithExceptionHandling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class DinnerEventWithExceptionHandling {

	public static void main(String[] args) {

		DinnerEvent[] events = new DinnerEvent[4];
		final int SENTINEL = 99;
		int entry = 0;
		boolean isValid = false;
		Scanner input = new Scanner(System.in);

		for(int x = 0; x < events.length; x++)
		{
			events[x] = getEventData();
		}
		while(entry != SENTINEL)
		{
			while(!isValid)
			{
				try
				{
					System.out.print("\nHow do you want events to be sorted:\n" +
							"1 by event number\n2 by number of guests\n3 by event type\n" +
							SENTINEL + " to EXIT\n >> ");
					entry = input.nextInt();
					isValid = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println(e.getMessage() + ", try again.");
				}
				input.nextLine();
			}
			isValid = false;
			if(entry != SENTINEL)
			{
				sort(events, entry);
				for(DinnerEvent e : events)
					displayDetails(e);
			}
		}
	}

	public static void displayDetails(DinnerEvent event) {
		System.out.println("\nEvent " + event.getEventNumber() + " details:");
		System.out.println("Event type: " + event.getEventType());
		System.out.println("Contact phone number: " + event.getPhoneNumber());
		System.out.println("Number of guests: " + event.getNumberOfGuests());
		System.out.println("Menu >> " + event.getMenu());
		System.out.println("Price: $" + event.getPrice());
	}

	public static DinnerEvent getEventData() {
		String eventNumber, phoneNumber;
		int numberOfGuests = -1, eventType = -1;
		int entree = -1, side1 = -1, side2 = -1, dessert = -1;
		boolean isValid = false;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter event number >> ");
		eventNumber = input.nextLine();
		while(!isValid)
		{
			try
			{
				System.out.print("Enter number of guests >> ");
				numberOfGuests = input.nextInt();
				while (numberOfGuests < 5 || numberOfGuests > 100) {
					System.out.print("Minimum guests is 5 and maximum 100 >> ");
					numberOfGuests = input.nextInt();
				}
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		isValid = false;
		System.out.print("Enter phone number >> ");
		phoneNumber = (input.nextLine());
		while(!isValid)
		{
			try
			{
				System.out.println("Select entree:");
				listMenu(DinnerEvent.entrees);
				entree = input.nextInt() - 1;
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		isValid = false;
		while(!isValid)
		{
			try
			{
				System.out.println("Select side dish 1:");
				listMenu(DinnerEvent.sideDishes);
				side1 = input.nextInt() - 1;
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		isValid = false;
		while(!isValid)
		{
			try
			{
				System.out.println("Select side dish 2:");
				listMenu(DinnerEvent.sideDishes);
				side2 = input.nextInt() - 1;
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		isValid = false;
		while(!isValid)
		{
			try
			{
				System.out.println("Select dessert:");
				listMenu(DinnerEvent.desserts);
				dessert = input.nextInt() - 1;
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		isValid = false;
		while(!isValid)
		{
			try
			{
				System.out.print("Enter event type:\n" +
					"1 for wedding\n2 for baptism\n3 birthday\n" +
					"4 for corporate\n5 for other\n >> ");
				eventType = input.nextInt();
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		DinnerEvent event = new DinnerEvent(eventNumber, numberOfGuests, entree, side1, side2, dessert);
		event.setPhoneNumber(phoneNumber);
		event.setEventType(eventType - 1);
		return event;
	}
	// insertion sort by event number(1), number of guests (2), or event type (3)
	public static void sort(Event[] events, int sortBy)
	{
		int a, b;
		Event temp;
		a = 1;
		while(a < events.length)
		{
			temp = events[a];
			b = a - 1;
			if(sortBy == 1)
			{
				while(b >= 0 && events[b].getEventNumber().compareTo(temp.getEventNumber()) > 0)
				{
					events[b + 1] = events[b];
					b--;
				}
			}
			else
				if(sortBy == 2)
				{
					while(b >= 0 && events[b].getNumberOfGuests() > temp.getNumberOfGuests())
                                	{
                                        	events[b + 1] = events[b];
                                        	b--;
                                	}
				}
				else
				{
					while(b >= 0 && events[b].getEventType().compareTo(temp.getEventType()) > 0)
                               		{
 		               		 	events[b + 1] = events[b];
                                        	b--;
                               		}
				}
			events[b + 1] = temp;
			a++;
		}
	}
	public static void listMenu(String[] menu)
	{
		for(int i = 0; i < menu.length; i++)
			System.out.println((i + 1) + " " + menu[i]);
		System.out.print(" >> ");
	}

}
