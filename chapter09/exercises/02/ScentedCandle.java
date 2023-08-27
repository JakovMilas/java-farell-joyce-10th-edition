/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 2b

Task:
Create a child class named ScentedCandle that contains an additional data field named scent and
methods to get and set it. In the child class, override the parent?s method that sets the height
to set the price of a ScentedCandle object at $3 per inch. Save the file as ScentedCandle.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class ScentedCandle extends Candle
{
	private String scent;

	public void setScent(String scent)
	{
		this.scent = scent;
	}
	public String getScent()
	{
		return scent;
	}
	@Override
	public void setHeight(int height)
	{
		this.height = height;
		price = height * 3;
	}
}
