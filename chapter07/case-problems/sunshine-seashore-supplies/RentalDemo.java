/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Case Problems 2b

Task:
Create a RentalDemo application that does the following:
 - Prompts the user for a contract number and number of minutes for three Rental objects.
 - Prompts the user for and retrieves a contact phone number for each of the Rental objects.
 = Displays the contract number and contact phone number for each Rental.
Save the file as RentalDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args) {
	
		Rental rental1 = getRentalData();
		Rental rental2 = getRentalData();
		Rental rental3 = getRentalData();

		displayDetails(rental1);
		displayDetails(rental2);
		displayDetails(rental3);

	}

	public static void displayDetails(Rental rental) {
		System.out.println("\nRental #" + rental.getContractNumber() + " details:");
		System.out.println("Contact phone number: " + rental.getPhoneNumber());
		System.out.println("Time rented: " + rental.getHoursRented() + "hrs " +
						rental.getMinutesOverHourRented() + "min");
		System.out.println("Rental price: " + rental.getPrice());
	}

	public static Rental getRentalData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rental contract number >> ");
		String contractNumber = input.nextLine();
		System.out.print("Enter number of minutes rented >> ");
		int minutesRented = input.nextInt();
		System.out.print("Enter phone number >> ");
		input.nextLine();
		String phone = input.nextLine();
		Rental rental = new Rental(contractNumber, minutesRented);
		rental.setPhoneNumber(phone);
		return rental;
	}

}
