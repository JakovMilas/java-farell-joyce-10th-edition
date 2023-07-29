/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 8

Task:
Write an application that prompts a user for the user’s month, day, and
year of birth and uses the LocalDate class to compute the day on which
the user will become (or became) 10,000 days old.
Save the application as TenThousandDaysOld.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class TenThousandDaysOld {

	public static void main(String[] args) {
	
		int yy, mm, dd;
		LocalDate birthday;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year of birth >> ");
		yy = input.nextInt();
		System.out.print("Enter month of birth >> ");
		mm = input.nextInt();
		System.out.print("Enter day of birth >> ");
		dd = input.nextInt();
		
		birthday = LocalDate.of(yy, mm, dd);

		System.out.println("\nYour will become (or became) 10,000 days old on " +
						birthday.plusDays(10_000));
	
	}

}
