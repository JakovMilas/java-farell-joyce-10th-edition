/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 1a

Task:
Create a class named Horse that contains data fields for the name, color, and birth year.
Include get and set methods for these fields. Save the file as Horse.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Horse
{
	String name;
	String color;
	int birthYear;

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setBirthYear(int year)
	{
		birthYear = year;
	}
	public int getBirthYear()
	{
		return birthYear;
	}
}
