/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 10d

Task:
Write a program that prompts the user for data, creates a Wedding object,
and displays all the details. Save the file as TestWedding.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class TestWedding {

	public static void main(String[] args) {
	
		Person bride = getPersonData("bride");
		Person groom = getPersonData("groom");
		Couple couple = new Couple(bride, groom);
		Wedding wedding = new Wedding(couple, getDateData(), getLocationData());
		
		display(wedding);

	
	}

	public static Person getPersonData(String title) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + title + "'s name >> ");
		String firstName = input.nextLine();
		System.out.print("Enter " + title + "'s last name >> ");
		String lastName = input.nextLine();
		Person person = new Person(firstName, lastName);
		return person;
	}

	public static LocalDate getDateData() {
		Scanner input = new Scanner(System.in);
		int yy, mm, dd;
		LocalDate date;
		System.out.print("Enter year of wedding>> ");
		yy = input.nextInt();
		System.out.print("Enter month of wedding >> ");
		mm = input.nextInt();
		System.out.print("Enter day of wedding >> ");
		dd = input.nextInt();
		date = LocalDate.of(yy, mm, dd);
		return date;
	}

	public static void display(Wedding wedding) {
		System.out.println("\n      WEDDING     \n");
		System.out.println(wedding.getCouple().getBride().getFirstName() + " " +
						wedding.getCouple().getBride().getLastName() + " and " +
						wedding.getCouple().getGroom().getFirstName() + " " +
						wedding.getCouple().getGroom().getLastName());
		System.out.println("Locaton: " + wedding.getLocation());
		System.out.println("Date: " + wedding.getDate());
	}

	public static String getLocationData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter location fot the wedding >> ");
		String location = input.nextLine();
		return location;
	}

}
