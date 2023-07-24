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
