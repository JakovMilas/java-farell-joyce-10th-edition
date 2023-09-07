/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 10a

Task:
Create an abstract Division class with fields for a company?s division name and account number, and
an abstract display() method. Use a constructor in the superclass that requires values for both fields.
Save the file as Division.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public abstract class Division
{
	protected String divisionName;
	protected int accountNumber;

	public Division(String name, int number)
	{
		divisionName = name;
		accountNumber = number;
	}

	public abstract void display();
}
