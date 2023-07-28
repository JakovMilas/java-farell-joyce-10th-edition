/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, Case Problems 1

Task:
Yummy Catering provides meals for parties and special events. Write a program that prompts the user for the
number of guests attending an event and then computes the total price, which is $35 per person. Display the
company motto with the border that you created in the YummyMotto2 class in Chapter 1, and then display
the number of guests, price per guest, and total price. Also display a message that indicates true or false
depending on whether the job is classified as a large event—an event with 50 or more guests. Save the file as
YummyEventPrice.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class YummyEventPrice {

	public static void main(String[] args) {

		int numberOfGuests;
		final double PRICE_PER_GUEST = 35.0;
		final int LARGE_EVENT_LIMIT = 50;
		boolean isLargeEvent;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of guests >> ");
		numberOfGuests = input.nextInt();

		isLargeEvent = numberOfGuests >= LARGE_EVENT_LIMIT;

		System.out.println("***********************************************");
		System.out.println("* Yummy makes the food that makes it a party! *");
		System.out.println("***********************************************");

		System.out.println("Number of guests: " + numberOfGuests);
		System.out.println("Price per guest:  " + PRICE_PER_GUEST);
		System.out.println("Total price:      " + (numberOfGuests * PRICE_PER_GUEST));
		System.out.println("Large event is:   " + isLargeEvent);

	}

}
