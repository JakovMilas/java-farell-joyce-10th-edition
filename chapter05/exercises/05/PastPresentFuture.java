/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 5a

Task:
Write an application that uses the LocalDate class to access the current date.
Prompt a user for a month, day, and year. Display a message that specifies
whether the entered date is;
 (1) not this year
 (2) in an earlier month this year
 (3) in a later month this year, or (4) this month.
Save the file as PastPresentFuture.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class PastPresentFuture {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int yy, mm, dd;
		LocalDate enteredDate;
		LocalDate currentDate = LocalDate.now();

		System.out.print("Enter year >> ");
		yy = input.nextInt();
		System.out.print("Enter month >> ");
		mm = input.nextInt();
		System.out.print("Enter day >> ");
		dd = input.nextInt();

		enteredDate = LocalDate.of(yy, mm, dd);

		if (enteredDate.getYear() != currentDate.getYear())
			System.out.println("\nEntered year is not current year.");
		else
			if (enteredDate.getMonthValue() < currentDate.getMonthValue())
				System.out.println("\nEntered date is earlier than today.");
		else
			System.out.println("\nEntered date is later than today.");

	}

}
