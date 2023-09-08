/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 15c

Task:
Write an InventionDemo application that prompts the user for all the data needed to create
an Invention and then uses the toString() method to display the data. Save the file as
InventionDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;
import java.time.*;

public class InventionDemo
{
	public static void main(String[] args)
	{
		String name;
		String country;
		String description;
		LocalDate date;
		Inventor inventor;
		Invention invention;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter inventor name >> ");
		name = input.nextLine();
		System.out.print("Enter inventors origin country >> ");
		country = input.nextLine();
		System.out.print("Enter description of the invention >> ");
		description = input.nextLine();
		System.out.print("Enter year of invention (yyyy-MM-dd) >> ");
		String dateString = input.nextLine();
		date = LocalDate.parse(dateString);
		inventor = new Inventor(name, country);
		invention = new Invention(description, inventor, date);
		System.out.println(invention.toString());
	}
}
