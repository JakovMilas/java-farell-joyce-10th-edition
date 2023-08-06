/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Case Problems a

Task:
Yummy Catering provides meals for parties and special events. In previous
chapters, you developed a class named Event that holds catering event
information. Now create an EventDemo application to do the following:
 ❯❯ Create three Event objects.
 ❯❯ Continually prompt the user for the number of guests for each Event until
    the value falls between 5 and 100 inclusive.
 ❯❯ Display the details for each Event object.
 ❯❯ For the Event object with the fewest number of guests, create a loop
    that displays Please come to my event! as many times as there are guests
    for the Event.
Save the file as EventDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
	
		Event event1 = getEventData();
		Event event2 = getEventData();
		Event event3 = getEventData();

		int guests = getSmallestEvent(event1, event2, event3);

		displayDetails(event1, guests);
		displayDetails(event2, guests);
		displayDetails(event3, guests);

	
	}

	public static void displayDetails(Event event, int guests) {
		System.out.println("\nEvent " + event.getEventNumber() + " details:");
		System.out.println("Number of guests: " + event.getNumberOfGuests());
		System.out.println("Price: $" + event.getPrice());
		if (event.getNumberOfGuests() == guests) {
			for (int i = 0; i < guests; i++)
				System.out.println("Please come to my event!");
		}
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
		Event event = new Event(evNum, numGuests);
		return event;
	}

	public static int getSmallestEvent(Event e1, Event e2, Event e3) {
		int guests;
		int g1 = e1.getNumberOfGuests();
		int g2 = e2.getNumberOfGuests();
		int g3 = e3.getNumberOfGuests();
		if (g1 < g2 && g1 < g3)
			guests = g1;
		else
			if (g2 < g1 && g2 < g3)
				guests = g2;
		else
			guests = g3;
		return guests;
	}

}
