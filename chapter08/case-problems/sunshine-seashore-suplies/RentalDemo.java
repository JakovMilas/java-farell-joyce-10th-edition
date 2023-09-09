/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Case Problems 2b

Task:
Write a program that uses an array of eight Rental objects. Prompt the user for values for the Rental
objects, including an integer for the equipment type. Prompt the user to choose an option to sort
Rentals in ascending order by contract number, price, or equipment type. Display the sorted list, and
continue to prompt the user for sorting options and display the requested lists until the user enters a
sentinel value. Save the file as RentalDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class RentalDemo {

	public static void main(String[] args)
	{
		final int NUMBER_OF_RENTALS = 8;
		final String SENTINEL = "QUIT";
		String entry = "";
		Scanner input = new Scanner(System.in);
		Rental[] rentals = new Rental[NUMBER_OF_RENTALS];
		for(int i = 0; i < rentals.length; i++)
			rentals[i] = getRentalData(i);

		while(!entry.equalsIgnoreCase(SENTINEL))
		{
			System.out.println("How to sort rentals?");
			System.out.print(" 1 - by contract number\n 2 - by price\n" +
					" 3 - by equipment type\nor " + SENTINEL + " to exit\n  >> ");
			entry = input.nextLine();
			if(!entry.equalsIgnoreCase(SENTINEL))
			{
				sort(rentals, Integer.parseInt(entry));
				for(int i = 0; i < rentals.length; i++)
					displayDetails(rentals[i]);
			}
		}
	}

	public static void displayDetails(Rental rental)
	{
		System.out.println("\nRental #" + rental.getContractNumber() + " details:");
		System.out.println("Contact phone number: " + rental.getPhoneNumber());
		System.out.println("Equipment type: " + rental.getEquipmentType());
		System.out.println("Time rented: " + rental.getHoursRented() + "hrs " +
						rental.getMinutesOverHourRented() + "min");
		System.out.println("Rental price: $" + rental.getPrice());
	}

	public static Rental getRentalData(int num)
	{
		String contractNumber, phoneNumber;
		int minutesRented, equipmentType;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rental #" + (num + 1) + " contract number >> ");
		contractNumber = input.nextLine();
		System.out.println("Enter equipment type:");
		for(int i = 0; i < Rental.equipment.length; i++)
			System.out.println((i + 1) + " " + Rental.equipment[i]);
		System.out.print(" >> ");
		equipmentType = input.nextInt() - 1;
		input.nextLine();
		System.out.print("Enter number of minutes rented >> ");
		minutesRented = input.nextInt();
		System.out.print("Enter phone number >> ");
		input.nextLine();
		phoneNumber = input.nextLine();
		Rental rental = new Rental(contractNumber, minutesRented);
		rental.setPhoneNumber(phoneNumber);
		rental.setEquipmentType(equipmentType);
		return rental;
	}
	public static void sort(Rental[] rentals, int sortBy)
	{
		int a, b;
		Rental temp;
		a = 1;
		while(a < rentals.length)
		{
			temp = rentals[a];
			b = a - 1;
			if(sortBy == 1)
			{
				while(b >= 0 && rentals[b].getContractNumber().compareTo(temp.getContractNumber()) > 0)
				{
					rentals[b + 1] = rentals[b];
					b--;
				}
			}
			else
				if(sortBy == 2)
				{
					while(b >= 0 && rentals[b].getPrice() > temp.getPrice())
					{
						rentals[b + 1] = rentals[b];
						b--;
					}
				}
				else
				{
					while(b >= 0 && rentals[b].getEquipmentType().compareTo(temp.getEquipmentType()) > 0)
					{
						rentals[b + 1] = rentals[b];
						b--;
					}
				}
			rentals[b + 1] = temp;
			a++;
		}
	}
}
