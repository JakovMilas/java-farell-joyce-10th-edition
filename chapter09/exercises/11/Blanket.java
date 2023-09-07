/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 11a

Task:
Create a class named Blanket with fields for a Blanket?s size, color, material, and price. Include
a constructor that sets default values for the fields as Twin, white, cotton, and $30.00. Include a set
method for each of the first three fields. The method that sets size adds $10 to the base price for a
double blanket, $25 for a queen blanket, and $40 for a king. The method that sets the material adds
$20 to the price for wool and $45 to the price for cashmere. In other words, the price for a king-sized
cashmere blanket is $115. Whenever the size or material is invalid, reset the blanket to the default
values. Include a toString() method that returns a description of the blanket. Save the file as
Blanket.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class Blanket
{
	private String size;
	private String color;
	private String material;
	protected double price;

	public Blanket()
	{
		size = "Twin";
		color = "white";
		material = "cotton";
		price = 30.00;
	}
	public void setSize(String size)
	{
		this.size = size;
		if(size.equalsIgnoreCase("double"))
			price += 10;
		else
			if(size.equalsIgnoreCase("queen"))
				price += 25;
			else
				if(size.equalsIgnoreCase("king"))
					price += 40;
				else
					price = price;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setMaterial(String material)
	{
		this.material = material;
		if(material.equals("wool"))
			price += 20;
		else
			if(material.equals("cashmere"))
				price += 45;
			else
				price = 30.00;
	}

	public String toString()
	{
		return ("\nBlanket details:\nSize: " + size + "\nMaterial: " + material +
				"\nColor: " + color + "\nPrice: $" + price);
	}
}
