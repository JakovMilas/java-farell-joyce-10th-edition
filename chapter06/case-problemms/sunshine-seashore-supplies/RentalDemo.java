/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Case Problems 2

Task:
Sunshine Seashore Supplies rents beach equipment to tourists. In previous chapters,
you developed a Rental class that holds equipment rental information and an
application that tests the methods using three objects of the class. Now create
a RentalDemo class to do the following:
 ❯❯ Construct three Rental objects.
 ❯❯ Continually prompt the user for the number of minutes of each Rental until the
 value falls between 60 and 7,200 inclusive.
 ❯❯ Display the details for each Rental object.
 ❯❯ Display Have fun and be safe in Hour 1, Have fun and be safe in Hour 2, and so
 on for the number of hours in the shortest Rental.
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

		int shortestRental = getShortestRental(rental1, rental2, rental3);

		displayDetails(rental1, shortestRental);
		displayDetails(rental2, shortestRental);
		displayDetails(rental3, shortestRental);

	}

	public static void displayDetails(Rental rental, int shortestRental) {
		System.out.println("\nRental #" + rental.getContractNumber() + " details:");
		System.out.println("Time rented: " + rental.getHoursRented() + "hrs " +
						rental.getMinutesOverHourRented() + "min");
		System.out.println("Rental price: " + rental.getPrice());
		if (rental.getHoursRented() == shortestRental)
			for (int i = 1; i <= shortestRental; i ++)
				System.out.println("Have fun and be safe in Hour " + i);
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

	public static int getShortestRental(Rental r1, Rental r2, Rental r3) {
		int hours;
		int h1 = r1.getHoursRented();
		int h2 = r2.getHoursRented();
		int h3 = r3.getHoursRented();
		if (h1 < h2 && h1 < h3)
			hours = h1;
		else
			if (h2 < h1 && h2 < h3)
				hours = h2;
		else
			hours = h3;
		return hours;
	}

}
