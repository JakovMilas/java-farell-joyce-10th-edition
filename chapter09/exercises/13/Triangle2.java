/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 13f

Task:
Modify Square and Triangle to include implementations of the displaySides() method.
Save the files as Square2.java and Triangle2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Triangle2 extends GeometricFigure2
{
	private double area;

	public Triangle2(int height, int width, String type)
	{
		super(height, width, type);
		calculateArea();
	}
	@Override
	public double calculateArea()
	{
		area = 1.0 / 2 * getWidth() * getHeight();
		return area;
	}
	public double getArea()
	{
		return area;
	}
	@Override
	public String displaySides()
	{
		return "Triangle have three sides.";
	}
}
