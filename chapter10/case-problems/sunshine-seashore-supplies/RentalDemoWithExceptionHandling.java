/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, Case Problems 2

Task:
In Chapter 9, you created an interactive LessonWithRentalDemo class that obtains data for four rentals from
Sunshine Seashore Supplies, including details about the contract number, length of the rental, and equipment
type. After data entry, the application offers the user options for sorting order and displays the results.
Now, modify the application so that it becomes immune to user data entry errors by handling exceptions
for each numeric entry. Each time the program requires numeric data?for example, for the rental period in
minutes?continually prompt the user until the data entered is the correct type. Save the revised program as
RentalDemoWithExceptionHandling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class RentalDemoWithExceptionHandling {

	public static void main(String[] args)
	{
		final int NUMBER_OF_RENTALS = 4;
		final String SENTINEL = "QUIT";
		String entry = "";
		boolean isValid = false;
		Scanner input = new Scanner(System.in);
		LessonWithRental[] rentals = new LessonWithRental[NUMBER_OF_RENTALS];
		for(int i = 0; i < rentals.length; i++)
			rentals[i] = getRentalData(i);

		while(!entry.equalsIgnoreCase(SENTINEL))
		{
			while(!isValid)
			{
				try
				{
					System.out.println("\nHow to sort rentals?");
					System.out.print(" 1 - by contract number\n 2 - by price\n" +
							" 3 - by equipment type\nor " + SENTINEL + " to exit\n  >> ");
					entry = input.nextLine();
					if(!entry.equalsIgnoreCase(SENTINEL))
					{
						sort(rentals, Integer.parseInt(entry));
						for(int i = 0; i < rentals.length; i++)
							displayDetails(rentals[i]);
					}
					isValid = true;
				}
				catch(NumberFormatException e)
				{
					System.out.println("Wrong input, try again!");
				}
			}
			isValid = false;
		}
	}

	public static void displayDetails(LessonWithRental rental)
	{
		System.out.println("\nRental #" + rental.getContractNumber() + " details:");
		System.out.println("Contact phone number: " + rental.getPhoneNumber());
		System.out.println(rental.getInstructor());
		System.out.println("Time rented: " + rental.getHoursRented() + "hrs " +
						rental.getMinutesOverHourRented() + "min");
		System.out.println("Rental price: $" + rental.getPrice());
	}

	public static LessonWithRental getRentalData(int num)
	{
		String contractNumber, phoneNumber;
		int minutesRented = -1, equipmentType = -1;
		boolean isValid = false;;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rental #" + (num + 1) + " contract number >> ");
		contractNumber = input.nextLine();
		while(!isValid)
		{
			try
			{
				System.out.println("Enter equipment type:");
				for(int i = 0; i < Rental.equipment.length; i++)
					System.out.println((i + 1) + " " + Rental.equipment[i]);
				System.out.print(" >> ");
				equipmentType = input.nextInt() - 1;
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		isValid = false;
		while(!isValid)
		{
			try
			{
				System.out.print("Enter number of minutes rented >> ");
				minutesRented = input.nextInt();
				isValid = true;
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input, try again!");
			}
			input.nextLine();
		}
		System.out.print("Enter phone number >> ");
		phoneNumber = input.nextLine();
		LessonWithRental rental = new LessonWithRental(contractNumber, minutesRented, equipmentType);
		rental.setPhoneNumber(phoneNumber);
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
