/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 13a

Task:
Create an abstract class called GeometricFigure. Each figure includes a height, a width, and a
String figure type. Include an abstract method to determine the area of the figure. Save the file as
GeometricFigure.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public abstract class GeometricFigure
{
	private int height;
	private int width;
	private String type;

	public GeometricFigure(int height, int width, String type)
	{
		this.height = height;
		this.width = width;
		this.type = type;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	public String getType()
	{
		return type;
	}

	public abstract double calculateArea();
}
