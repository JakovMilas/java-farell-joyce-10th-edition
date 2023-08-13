/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 5a

Task:
Create a class named Salesperson. Data fields for Salesperson include an integer ID number and a
double annual sales amount. Methods include a constructor that requires values for both data fields, as
well as get and set methods for each of the data fields. Save the file as SalesPerson.java

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class SalesPerson
{
	private int id;
	private double salesAmount;

	public SalesPerson(int id, double salesAmount)
	{
		this.id = id;
		this.salesAmount = salesAmount;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setSalesAmount(double salesAmount)
	{
		this.salesAmount = salesAmount;
	}
	public double getSalesAmount()
	{
		return salesAmount;
	}
}
