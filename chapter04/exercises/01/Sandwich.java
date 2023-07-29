/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 01a

Task:
Create a class named Sandwich. Data fields include a String for the main
ingredient (such as tuna), a String for bread type (such as wheat), and a
double for price (such as 4.99). Include methods to get and set values for
each of these fields. Save the class as Sandwich.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



public class Sandwich {

	private String ingredient;
	private String breadType;
	double price;

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public String getBreadType() {
		return breadType;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

}
		
		
		
