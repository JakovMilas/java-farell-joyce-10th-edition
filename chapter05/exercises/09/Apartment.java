/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 9

Task:
Create a class named Apartment that holds an apartment number, number
of bedrooms, number of baths, and rent amount. Create a constructor
that accepts values for each data field. Also create a get method for
each field. Save the file as Apartment.java

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Apartment {

	private int apartmentNumber;
	private int numberOfBedrooms;
	private int numberOfBaths;
	double rentAmount;

	public Apartment(int apn, int nobr, int nob, double ra) {
		apartmentNumber = apn;
		numberOfBedrooms = nobr;
		numberOfBaths = nob;
		rentAmount = ra;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	public int getNumberOfBaths() {
		return numberOfBaths;
	}
	public double getRentAmount() {
		return rentAmount;
	}

}
