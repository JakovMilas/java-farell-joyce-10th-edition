/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 7c

Task:
Write an application that establishes an array of at least seven UsedCar objects and prompts the user
for values. Include two catch blocks. One catches any data entry Exceptions and displays a message.
The other catches UsedCarExceptions that are thrown from the UsedCar constructor. When data
entry is complete, display a list of only the UsedCar objects that were constructed successfully.
Save the file as ThrowUsedCarException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class ThrowUsedCarException
{
	public static void main(String[] args)
	{
		UsedCar[] cars = new UsedCar[2];
		Scanner input = new Scanner(System.in);
		String vin = "", make;
		int year, mileage;
		double price;

		for(int i = 0; i < cars.length; i++)
		{
			try 
			{ 
				System.out.print("Enter car #" + (i + 1) + " VIN >> ");
				vin = input.nextLine();
				System.out.print("Enter car #" + (i + 1) + " make >> ");
				make = input.nextLine();
				System.out.print("Enter car #" + (i + 1) + " year >> ");
				year = input.nextInt();
				input.nextLine();
				System.out.print("Enter car #" + (i + 1) + " mileage >> ");
				mileage = input.nextInt();
				input.nextLine();
				System.out.print("Enter car #" + (i + 1) + " price >> ");
				price = input.nextDouble();
				input.nextLine();
				cars[i] = new UsedCar(vin, make, year, mileage, price);
			}
			catch(UsedCarException e)
			{
				System.out.println("Can not create object UsecCar " + vin);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrong input data");
			}
		}

		for(int i = 0; i < cars.length; i++)
		{
			if(cars[i] != null)
			{
				System.out.println(cars[i].toString());
			}
		}
	}
}
