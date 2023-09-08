/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 13e

Task:
Modify the GeometricFigure class to implement SidedObject. Make the displaySides()
method abstract. Save the class as GeometricFigure2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public abstract class GeometricFigure2 implements SidedObject
{
	private int height;
	private int width;
	private String type;

	public GeometricFigure2(int height, int width, String type)
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
	public abstract String displaySides();
}
