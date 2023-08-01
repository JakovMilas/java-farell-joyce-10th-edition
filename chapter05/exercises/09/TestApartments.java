/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 9

Task:
Write an application that creates at least five Apartment objects. Then
prompt a user to enter a minimum number of bedrooms required, a minimum
number of baths required, and a maximum rent the user is willing to pay.
Display data for all the Apartment objects that meet the user’s criteria
or an appropriate message if no such apartments are available.
Save the file as TestApartments.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TestApartments {

	public static void main(String[] args) {
		
		int bedrooms, bathrooms;
		double rent;
		boolean isAvailable = false;
		Scanner input = new Scanner(System.in);
		Apartment a1 = new Apartment(1001, 1, 1, 800);
		Apartment a2 = new Apartment(1002, 2, 1, 1000);
		Apartment a3 = new Apartment(1003, 3, 2, 1400);
		Apartment a4 = new Apartment(1004, 4, 2, 1600);
		Apartment a5 = new Apartment(1005, 4, 3, 2100);

		System.out.print("Enter minimum of bedrooms >> ");
		bedrooms = input.nextInt();
		System.out.print("Enter minimum of bathrooms >> ");
		bathrooms = input.nextInt();
		System.out.print("Enter desired rent >> ");
		rent = input.nextDouble();

		if (checkApartment(a1, bedrooms, bathrooms, rent)) {
			display(a1);
			isAvailable = true;
		}
		if (checkApartment(a2, bedrooms, bathrooms, rent)) {
			display(a2);
			isAvailable = true;
		}
		if (checkApartment(a3, bedrooms, bathrooms, rent)) {
			display(a3);
			isAvailable = true;
		}
		if (checkApartment(a4, bedrooms, bathrooms, rent)) {
			display(a4);
			isAvailable = true;
		}
		if (checkApartment(a5, bedrooms, bathrooms, rent)) {
			display(a5);
			isAvailable = true;
		}
		if (!isAvailable)
			System.out.println("There is no available apartments" +
							" for your criteria");
	}

	public static boolean checkApartment(Apartment a,
					int bed, int bath, double rent) {
		boolean b = false;		
		if (a.getNumberOfBedrooms() >= bed &&
			a.getNumberOfBaths() >= bath &&
			a.getRentAmount() <= rent)
			b = true;
		return b;
	}

	public static void display(Apartment a) {
		System.out.println("\nAvailable apartment:");
		System.out.println("Apartment number: " + a.getApartmentNumber());
		System.out.println("Number of bedrooms: " + a.getNumberOfBedrooms());
		System.out.println("Number of bathrooms: " + a.getNumberOfBaths());	
		System.out.println("Monthly rent amount: $" + a.getRentAmount()); 
	}

}
