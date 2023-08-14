/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 15

Task:
Create an application that contains an enumeration that represents the days of the week. Display a list of the
days, and then prompt the user for a day. Display business hours for the chosen day. Assume that the business
is open from 11 to 5 on Sunday, 9 to 9 on weekdays, and 10 to 6 on Saturday. Save the file as DayOfWeek.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DayOfWeek
{
	enum Day {MONDAY, TUESDAY, WENDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String entry;
		Day day = null;
		for(Day d : Day.values())
			System.out.print(d + " ");
		System.out.println();

		System.out.print("Enter day to see working hours >> ");
		entry = input.nextLine().toUpperCase();
		day = Day.valueOf(entry);
		for(Day d : Day.values())
		{
			if(day.equals(d))
				System.out.println(day + ": working hous from " + findWorkingHours(day));
		}
	}
	public static String findWorkingHours(Day day)
	{
		String hours;
		switch (day)
		{
			case SATURDAY:
				hours = "10 to 6";
				break;
			case SUNDAY:
				hours = "11 to 5";
				break;
			default:
				hours = "9 to 9";
		}
		return hours;
	}
}
