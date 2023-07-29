/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Case Problems 1b

Task:
Create an application that declares two Event objects.
 ❯❯ One Event object uses the default constructor.
 ❯❯ The other Event object is constructed from values input by a user.
Display the details of each object by passing them, in turn, to a
method named displayDetails(). Save the file as EventDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class EventDemo {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String evNum;
		int numGuests;
		
		System.out.print("Enter event number >> ");
		evNum = input.nextLine();
		System.out.print("Enter number of guests >> ");
		numGuests = input.nextInt();

		Event event1 = new Event();
		Event event2 = new Event(evNum, numGuests);

		displayDetails(event1);
		displayDetails(event2);
	
	}

	public static void displayDetails(Event event) {
		System.out.println("\nEvent " + event.getEventNumber() + " details:");
		System.out.println("Number of guests: " + event.getNumberOfGuests());
		System.out.println("Price:            $" + event.getPrice());
	}

}
