/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Case Problems 2b

Task:
Create an application that declares two Rental objects.
 ❯❯ One Rental object uses the default constructor.
 ❯❯ The other Rental object is constructed from values input by a user.
Display the details of each object by passing them, in turn, to a method
named displayDetails(). Save the program as RentalDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args) {
	
		String contractNumber;
		int minutesRented;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter rental contract number >> ");
		contractNumber = input.nextLine();
		System.out.print("Enter number of minutes rented >> ");
		minutesRented = input.nextInt();

		Rental rental1 = new Rental();
		Rental rental2 = new Rental(contractNumber, minutesRented);

		displayDetails(rental1);
		displayDetails(rental2);
	
	}

	public static void displayDetails(Rental rental) {
		System.out.println("\nRental $" + rental.getContractNumber() + " details:");
		System.out.println("Time rented: " + rental.getHoursRented() + "hrs " +
						rental.getMinutesOverHourRented() + "min");
		System.out.println("Rental price: " + rental.getPrice());
	}

}
