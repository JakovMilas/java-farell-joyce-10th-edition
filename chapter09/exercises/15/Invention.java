/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 15b

Task:
Create an Invention class with three fields: a String description of the invention, an Inventor
object, and a LocalDate object that holds the date of the Invention. Create a constructor that
requires values for all three fields and a toString() method that constructs a String that
displays all the data about the Invention. Save the file as Invention.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.time.*;

public class Invention
{
	private String description;
	private Inventor inventor;
	LocalDate date;

	public Invention(String description, Inventor inventor, LocalDate date)
	{
		this.inventor = inventor;
		this.description = description;
		this.date = date;
	}
	@Override
	public String toString()
	{
		return "Inventors name: " + inventor.name() + "\nCountry of origin: " + inventor.country() +
			"\nDescription: " +description + "\nDate of invention: " + date;
	}
}
