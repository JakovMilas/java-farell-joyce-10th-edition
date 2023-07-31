/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 5b

Task:
Use the Web to learn how to use the LocalDate Boolean methods isBefore(),
isAfter(), and equals(). Use your knowledge to write a program that prompts
a user for a month, day, and year, and then displays a message specifying
whether the entered day is in the past, the current date, or in the future.
Save the file as PastPresentFuture2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class PastPresentFuture2 {

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

		if (enteredDate.equals(currentDate))
			System.out.println("\nEntered date is today.");
		else
			if (enteredDate.isBefore(currentDate))
				System.out.println("\nEntered date is earlier than today.");
		else
			System.out.println("\nEntered date is later than today.");

	}

}
