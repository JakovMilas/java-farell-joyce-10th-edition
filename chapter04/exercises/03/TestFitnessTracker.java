/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 3b

Task:
Create an application that instantiates two FitnessTracker objects.
Prompt the user fovalues for one object, and pass those values to the
three constructor parameters. Retain the default constructor values for
the other object. Display the values for each object.
Save the program as TestFitnessTracker.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class TestFitnessTracker {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String activity;
		int minutes;
		LocalDate date;
		int yy, mm, dd;

		System.out.print("Enter fitness acitvity >> ");
		activity = input.nextLine();
		System.out.print("Enter number of minutes participating >> ");
		minutes = input.nextInt();
		System.out.print("Enter year in format YYYY>> ");
		yy = input.nextInt();
		System.out.print("Enter month in format MM >> ");
		mm = input.nextInt();
		System.out.print("Enter day in format DD >> ");
		dd = input.nextInt();

		date = LocalDate.of(yy, mm, dd);

		FitnessTracker tracker1 = new FitnessTracker(activity, minutes, date);
		FitnessTracker tracker2 = new FitnessTracker();

		display(tracker1);
		display(tracker2);
	
	}

	public static void display(FitnessTracker tracker) {
		System.out.println("\nFitness tracker details: ");
		System.out.println("Fitness activity: " + tracker.getFitnessActivity());
		System.out.println("Minutes participating: " + tracker.getNumberOfMinutes());
		System.out.println("Date: " + tracker.getDate());
	}

}
