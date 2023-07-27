/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, Case Problems 1

Task:
Yummy Catering provides meals for parties and special events. In Chapter 2, you wrote an
application that prompts the user for the number of guests attending an event, displays
the company motto with a border, and then displays the price of the event and whether the
event is a large one. Now modify the program so that the main() method contains only three
executable statements that each call a method as follows:
 ❯❯ The first executable statement calls a public static int method that prompts the user for the
    number of guests and returns the value to the main() method.
 ❯❯ The second executable statement calls a public static void method that displays the company
    motto with the border.
 ❯❯ The last executable statement passes the number of guests to a public static void method
    that computes the price of the event, displays the price, and displays whether the event
    is a large event.
Save the file as YummyEventPriceWithMethods.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class YummyEventPriceWithMethods {

	public static void main(String[] args) {

		int numberOfGuests;

		numberOfGuests = enterNumberOfGuests();
		displayMotto();
		displayEvent(numberOfGuests);

	}

	public static void displayMotto() {

		System.out.println("***********************************************");
		System.out.println("* Yummy makes the food that makes it a party! *");
		System.out.println("***********************************************");

	}

	public static void displayEvent(int numberOfGuests) {

		final double PRICE_PER_GUEST = 35.0;
		final int LARGE_EVENT_LIMIT = 50;
		boolean isLargeEvent = (numberOfGuests >= LARGE_EVENT_LIMIT);

		System.out.println("Number of guests: " + numberOfGuests);
		System.out.println("Price per guest:  " + PRICE_PER_GUEST);
		System.out.println("Total price:      " + (numberOfGuests * PRICE_PER_GUEST));
		System.out.println("Large event is:   " + isLargeEvent);

	}

	public static int enterNumberOfGuests() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of guests >> ");
		int numberOfGuests = input.nextInt();
		return numberOfGuests;

	}

}
