/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 6a

Task:
Create a class named Pizza with a String array data field that can hold the names of up to 10 pizza
toppings. Also include a field for the price. Include a constructor that takes two parameters: the array of
toppings and the number of toppings stored in the list. The constructor creates a String description from the
list of toppings, adding a comma between each topping. It also sets the price at $14 plus $2 for each topping.
Include a toString() method to display the Pizza description and price. Save the file as Pizza.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Pizza
{
	private String[] toppings = new String[10];
	protected double price;
	private String description = "";

	public Pizza(String[] toppings, int numberOfToppings)
	{
		this.toppings = toppings;
		for(int i = 0; i < numberOfToppings; i++)
		{
			description += toppings[i];
			if(i < numberOfToppings - 1)
				description += ", ";
		}
		price = 14 + (numberOfToppings * 2);
	}
	@Override
	public String toString()
	{
		return ("Pizza toppings " + description + "\nPrice: $" + price);
	}
}
