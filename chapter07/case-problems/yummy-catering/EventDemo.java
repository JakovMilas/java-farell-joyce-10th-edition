/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Case Problems 1b

Task:
 Create an EventDemo application that does the following:
 - Prompts the user for event numbers and numbers of guests and constructs three Event objects.
 - Prompts the user for and retrieves a contact phone number for each of the Event objects.
 - Displays the event number and contact phone number for each Event.
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

	
	}

	public static void displayDetails(Event event) {
		System.out.println("\nEvent " + event.getEventNumber() + " details:");
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
		return event;
	}

}
