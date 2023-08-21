/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, Case Problems 1b

Task:
Create an EventDemo class that uses an array of eight Event objects. Get data for each of the objects,
including an integer for the event type. Prompt the user to choose an option to sort Events in ascending
order by event number, number of guests, or event type. Display the sorted list of Events, including
Event number, number of guests, price per guest, total price, phone number, Event type number, and
Event type String. Continue to prompt the user for sorting options and display the requested lists
until the user enters a sentinel value. Save the file as EventDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {

		Event[] events = new Event[8];
		final int SENTINEL = 99;
		int entry = 0;
		Scanner input = new Scanner(System.in);

		for(int x = 0; x < events.length; x++)
		{
			events[x] = new Event();
			events[x] = getEventData();
		}
		while(entry != SENTINEL)
		{
			System.out.print("\nHow do you want events to be sorted:\n" +
					"1 by event number\n2 by number of guests\n3 by event type\n" +
					SENTINEL + " to EXIT\n >> ");
			entry = input.nextInt();
			if(entry != SENTINEL)
			{
				sort(events, entry);
				for(Event e : events)
					displayDetails(e);
			}
		}
	}

	public static void displayDetails(Event event) {
		System.out.println("\nEvent " + event.getEventNumber() + " details:");
		System.out.println("Event type: " + event.getEventType());
		System.out.println("Contact phone number: " + event.getPhoneNumber());
		System.out.println("Number of guests: " + event.getNumberOfGuests());
		System.out.println("Price: $" + event.getPrice());
	}

	public static Event getEventData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter event number >> ");
		String evNum = input.nextLine();
		System.out.print("Enter number of guests >> ");
		int numGuests = input.nextInt();
		while (numGuests < 5 || numGuests > 100) {
			System.out.print("Minimum guests is 5 and maximum 100 >> ");
			numGuests = input.nextInt();
		}
		System.out.print("Enter phone number >> ");
		input.nextLine();
		String phone = (input.nextLine());
		Event event = new Event(evNum, numGuests);
		event.setPhoneNumber(phone);
		System.out.println("Enter event type:\n" +
				"1 for wedding\n2 for baptism\n3 birthday\n" +
				"4 for corporate\n5 for other\n >> ");
		int eventType = input.nextInt();
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

}
