/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Case Problems 1b

Task:
Write a program that demonstrates using the Event class as follows:
 ❯❯ Instantiate three Event objects, and prompt the user for values
    for each object.
 ❯❯ Display the details for all three objects.
 ❯❯ Create a method that accepts two Event objects and returns the
    larger one based on the number of guests. (If the Events have
	the same number of guests, you can return either object.)
 ❯❯ Call this method three times—once with each pair of instantiated
    Events—and display the event number and number of guests for each
	argument as well as the event number and number of guests for the
	larger Event.
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

		displayDetails(event1);
		displayDetails(event2);
		displayDetails(event3);

		System.out.println("\nLarger events\n");
		
		displayDetails(largerEvent(event1, event2));
		displayDetails(largerEvent(event1, event3));
		displayDetails(largerEvent(event2, event3));
	
	}

	public static void displayDetails(Event event) {
		System.out.println("\nEvent " + event.getEventNumber() + " details:");
		System.out.println("Number of guests: " + event.getNumberOfGuests());
		System.out.println("Price: $" + event.getPrice());
	}

	public static Event getEventData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter event number >> ");
		String evNum = input.nextLine();
		System.out.print("Enter number of guests >> ");
		int numGuests = input.nextInt();
		Event event = new Event(evNum, numGuests);
		return event;
	}

	public static Event largerEvent(Event e1, Event e2) {
		if (e1.getNumberOfGuests() < e2.getNumberOfGuests())
			return e2;
		return e1;
	}

}
