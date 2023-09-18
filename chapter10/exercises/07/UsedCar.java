/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 7b

Task:
Create a UsedCar class with fields for a VIN, make, year, mileage, and price. The UsedCar constructor
throws a UsedCarException when the VIN is not four digits; when the make is not Ford, Honda, Toyota,
Chrysler, or Other; when the year is not between 1997 and 2024 inclusive; or either the mileage or price is
negative. Save the class as UsedCar.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class UsedCar
{
	String vin;
	String make;
	int year;
	int mileage;
	double price;

	public UsedCar(String vin, String make, int year, int mileage, double price)
		throws UsedCarException
	{
		if(!(vin.length() == 4))
			throw(new UsedCarException(vin));
		else
			this.vin = vin;
		if(year < 1997 || year > 2024)
			throw(new UsedCarException(vin));
		else
			this.year = year;
		if(mileage < 0)
			throw(new UsedCarException(vin));
		else
			this.mileage = mileage;
		if(price < 0)
			throw(new UsedCarException(vin));
		else
			this.price = price;
		switch (make)
		{
			case "Ford":
			case "Honda":
			case "Toyota":
			case "Chrysler":
			case "Other":
				this.make = make;
				break;
			default:
				throw(new UsedCarException(vin));
		}
	}
	public String toString()
	{
		return ("\nVIN: " + vin + "\nMake: " + make + "\nYear: " + year +
				"\nMileage: " + mileage + "\nPrice: $" + price);
	}
}
