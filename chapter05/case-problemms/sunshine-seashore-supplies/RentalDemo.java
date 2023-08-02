/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Case Problems 2b

Task:
Write a program that demonstrates using the Rental class as follows:
 ❯❯ Instantiate three Rental objects, and prompt the user for values
    for each object.
 ❯❯ Display the details for each object to verify that the new price
    calculation works correctly.
 ❯❯ Create a method that accepts two Rental objects and returns the one
    with the longer rental time. (If the Rentals have the same time, you
	can return either object.) Call this method three times—once with
	each pair of instantiated Rentals—and display the contract number and
	time in hours and minutes for each argument as well as the contract
	number of the longer Rental.
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

		System.out.println("\nLonger Rental\n");

		displayDetails(longerRental(rental1, rental2));
		displayDetails(longerRental(rental1, rental3));
		displayDetails(longerRental(rental2, rental3));
	
	}

	public static void displayDetails(Rental rental) {
		System.out.println("\nRental #" + rental.getContractNumber() + " details:");
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
		Rental rental = new Rental(contractNumber, minutesRented);
		return rental;
	}

	public static Rental longerRental(Rental r1, Rental r2) {
		int min1 = (r1.getHoursRented() * 60) + r1.getMinutesOverHourRented();
		int min2 = (r2.getHoursRented() * 60) + r2.getMinutesOverHourRented();
		if (min1 < min2)
			return r2;
		return r1;
		
	}

}
