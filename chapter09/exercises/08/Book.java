/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 8a

Task:
Create an abstract class named Book. Include a String field for the Book?s title and a double field
for the book?s price. Within the class, include a constructor that requires the book title, and add two get
methods?one that returns the title and one that returns the price. Include an abstract method named
setPrice(). Save the file as Book.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public abstract class Book
{
	private String title;
	protected double price;

	public Book(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return title;
	}
	public double getPrice()
	{
		return price;
	}
	public abstract void setPrice();
}
