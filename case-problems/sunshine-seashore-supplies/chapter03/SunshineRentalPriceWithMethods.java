/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, Case Problems 2

Task:
Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs,
and umbrellas to tourists. In Chapter 2, you wrote an application that prompts the user
for the number of minutes a piece of sports equipment was rented, displays the company
motto with a border, and displays the price for the rental. Now modify the program so
that the main() method contains only three executable statements that each call a
method as follows:
 ❯❯ The first executable statement calls a method that prompts the user for the rental
    time in minutes and returns the value to the main() method.
 ❯❯ The second executable statement calls a method that displays the company motto with the border.
 ❯❯ The last executable statement passes the number of minutes to a method that computes the
    hours, extraminutes, and price for the rental and then displays all the details.
Save the file as SunshineRentalPriceWithMethods.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class SunshineRentalPriceWithMethods {

	public static void main(String[] args) {

		int minutesRented;

		minutesRented = enterNumberOfMinutesRented();
		displayMotto();
		displayRental(minutesRented);


	}

	public static void displayMotto() {

		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sunshine Seashore makes it fun in the sun! S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

	}

	public static void displayRental(int minutesRented) {

		final int PRICE_PER_HOUR = 40;
		final int PRICE_PER_MINUTE = 1;
		final int MINUTES_IN_HOUR = 60;
		int hours = minutesRented / MINUTES_IN_HOUR;
		int minutes = minutesRented % MINUTES_IN_HOUR;
		System.out.println("Time rented:  " + hours + " hours and " + minutes + " mintutes");
		System.out.println("Total price: $" + ((hours * PRICE_PER_HOUR) + (minutes * PRICE_PER_MINUTE)));

	}

	public static int enterNumberOfMinutesRented() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of minutes rented >> ");
		int minutes = input.nextInt();
		return minutes;

	}

}
