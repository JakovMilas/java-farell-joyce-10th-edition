/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 7

Task:
Write a program that declares two LocalDate objects and prompts the user
for values. Display output that demonstrates the dates displayed when one,
two, and three months are added to each of the objects. (When you test the
program, be sure to try some date late in the month so you can observe what
happens when a following month does not have as many days.)
Save the application as TestMonthHandling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class TestMonthHandling {

	public static void main(String[] args) {
	
		LocalDate date1 = getDateData();
		LocalDate date2 = getDateData();

		addMonths(date1, 1);
		addMonths(date1, 2);
		addMonths(date1, 3);

		addMonths(date2, 1);
		addMonths(date2, 2);
		addMonths(date2, 3);	
	
	}

	public static LocalDate getDateData() {
		Scanner input = new Scanner(System.in);
		int yy, mm, dd;
		LocalDate date;
		System.out.print("Enter year >> ");
		yy = input.nextInt();
		System.out.print("Enter month >> ");
		mm = input.nextInt();
		System.out.print("Enter day >> ");
		dd = input.nextInt();
		date = LocalDate.of(yy, mm, dd);
		return date;
	}

	public static void addMonths(LocalDate date, int months) {
		System.out.println(date + " plus " + months + " months is " +
						date.plusMonths(months));
	}

}
