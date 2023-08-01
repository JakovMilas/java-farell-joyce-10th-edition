/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 8

Task:
Create an Automobile class for a dealership. Include fields for an ID number,
make, model, color, year, and miles per gallon. Include get and set methods
for each field. Do not allow the ID to be negative or more than 9999; if it
is, set the ID to 0. Do not allow the year to be earlier than 2005 or later
than 2024; if it is, set the year to 0. Do not allow the miles per gallon to
be less than 10 or more than 60; if it is, set the miles per gallon to 0.
Include a constructor that accepts arguments for each field value and uses
the set methods to assign the values. Save file as Automobile.java

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Automobile {

	private int idNumber;
	private String make;
	private String model;
	private String color;
	private int year;
	private int milesPerGallon;

	public Automobile(int id, String make, String model,
					String color, int year, int miles) {
		setIdNumber(id);
		setMake(make);
		setModel(model);
		setColor(color);
		setYear(year);
		setMilesPerGallon(miles);
	}

	public void setIdNumber(int id) {
		if (id < 0 || id > 9999)
			idNumber = 0;
		else
			idNumber = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		if (year < 2005 || year > 2024)
			this.year = 0;
		else
			this.year = year;
	}
	public void setMilesPerGallon(int miles) {
		if (miles < 10 || miles > 60)
			milesPerGallon = 0;
		else
			milesPerGallon = miles;
	}

	public int getIdNumber() {
		return idNumber;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getYear() {
		return year;
	}
	public int getMilesPerGallon() {
		return milesPerGallon;
	}

}
