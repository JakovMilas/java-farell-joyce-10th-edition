/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 13b

Task:
 Create two subclasses of GeometricFigure called Square and Triangle. Include a field in each to
hold the area. Provide methods as necessary. Save the files as Square.java and Triangle.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Triangle extends GeometricFigure
{
	private double area;

	public Triangle(int height, int width, String type)
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
}
