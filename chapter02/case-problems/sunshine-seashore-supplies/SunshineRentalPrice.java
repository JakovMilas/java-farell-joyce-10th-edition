/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, Case Problems 2

Task:
Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to
tourists. Write a program that prompts the user for the number of minutes the user rented a piece of sports
equipment. Compute the rental cost as $40 per hour plus $1 per additional minute. (You might have surmised
already that this rate has a logical flaw, but for now, calculate rates as described here. You can fix the problem
after you learn about decision making.) Display Sunshine’s motto with the border that you created in the
SunshineMotto2 class in Chapter 1. Then display the hours, minutes, and total price. Save the file as
SunshineRentalPrice.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class SunshineRentalPrice {

	public static void main(String[] args) {

		final double PRICE_PER_HOUR = 40.0;
		final double PRICE_PER_MINUTE = 1.0;
		final int MINUTES_IN_HOUR = 60;
		int minutesRented;
		int hours;
		int minutes;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter renting time in minutes >> ");
		minutesRented = input.nextInt();

		hours = minutesRented / MINUTES_IN_HOUR;
		minutes = minutesRented % MINUTES_IN_HOUR;

		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		System.out.println("S Sunshine Seashore makes it fun in the sun! S");
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

		System.out.println("Time rented:  " + hours + " hours and " + minutes + " mintutes");
		System.out.println("Total price: $" + ((hours * PRICE_PER_HOUR) + (minutes * PRICE_PER_MINUTE)));

	}

}
