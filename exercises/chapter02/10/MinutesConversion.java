/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 10

Task:
Write a program that accepts an integer number of minutes from a user and converts it both to hours
and days. For example, 6,000 minutes equals 100 hours and equals 4.167 days. Save the program as
MinutesConversion.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class MinutesConversion {

	public static void main(String[] args) {

		final double MINUTES_IN_HOUR = 60;
		final double HOURS_IN_DAY = 24;
		int minutes;
		double hours;
		double days;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of minutes >> ");
		minutes = input.nextInt();

		hours = minutes / MINUTES_IN_HOUR;
		days = minutes / MINUTES_IN_HOUR / HOURS_IN_DAY;

		System.out.println(minutes + " minutes equals " + hours + " hours and equals " + days + " days.");

	}

}
