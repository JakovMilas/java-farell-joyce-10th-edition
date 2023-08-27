/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 3a

Task:
Create a TeeShirt class for Tamjeed's Tee Shirt Company. Fields include an order number, size, color,
and price. Create set methods for the order number, size, and color, and create get methods for all four
fields. The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes.
Save the file as TeeShirt.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class TeeShirt
{
	private int orderNumber;
	private String size;
	private String color;
	private double price;

	public void setOrderNumber(int num)
	{
		orderNumber = num;
	}
	public int getOrderNumber()
	{
		return orderNumber;
	}
	public void setSize(String size)
	{
		this.size = size;
		if(size.equals("XXL") || size.equals("XXXL"))
			price = 22.99;
		else
			price = 19.99;
	}
	public String getSize()
	{
		return size;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public double getPrice()
	{
		return price;
	}


}
