/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 2a

Task:
Create a class named Candle for a candle-making business. Include data fields for color, height, and
price. Create get methods for all three fields. Create set methods for color and height, but not for
price. Instead, when height is set, determine the price as $2 per inch. Save the file as Candle.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Candle
{
	private String color;
	protected int height;
	protected double price;

	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setHeight(int height)
	{
		this.height = height;
		price = height * 2.0;
	}
	public int getHeight()
	{
		return height;
	}
	public double getPrice()
	{
		return price;
	}
}
