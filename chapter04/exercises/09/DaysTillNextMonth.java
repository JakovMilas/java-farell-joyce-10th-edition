/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 09

Task:
The LocalDate class includes an instance method named lengthOfMonth()
that returns the number of days in the month. Write an application that
allows the user to enter a month, day, and year and uses methods in the
LocalDate class to calculate how many days are left until the first day
of next month. For example, if the user enters 6 and 28 for the month
and the day, the output should be There are 3 days until JULY starts.
Save the file as DaysTilNextMonth.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class DaysTillNextMonth {

	public static void main(String[] args) {

		int yy, mm, dd, remainingDays;
		LocalDate date;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year >> ");
		yy = input.nextInt();
		System.out.print("Enter month >> ");
		mm = input.nextInt();
		System.out.print("Enter day >> ");
		dd = input.nextInt();
		date = LocalDate.of(yy, mm, dd);

		remainingDays = date.lengthOfMonth() - date.getDayOfMonth();

		System.out.println("\nThere are " + remainingDays + " days until " +
					date.plusMonths(1).getMonth() + " starts.");

	}

}
