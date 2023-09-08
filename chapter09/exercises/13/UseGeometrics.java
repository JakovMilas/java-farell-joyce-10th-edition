/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 13c

Task:
Create an application that prompts the user for values for at least five objects that can each be a Square
or a Triangle, and store them in an array of GeometricFigures. Then display the figure type, height,
width, and area of each GeometricFigure. Save the file as UseGeometric.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class UseGeometrics
{
	public static void main(String[] args)
	{
		GeometricFigure[] figures = new GeometricFigure[5];
		String type;
		int height;
		int width;
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < figures.length; i++)
		{
			System.out.print("Enter geometric type (square or triangle) >> ");
			type = input.nextLine().toLowerCase();
			while (!type.startsWith("sq") && !type.startsWith("tr"))
			{
				System.out.print("Try again, square of triangle >> ");
				type = input.nextLine();
			}
			if(type.startsWith("sq"))
				type = "square";
			else
				type = "triangle";
			System.out.print("Enter " + type + " height >> ");
			height = input.nextInt();
			System.out.print("Enter " + type + " width >> ");
			width = input.nextInt();
			input.nextLine();
			if(type.startsWith("sq"))
				figures[i] = new Square(height, width, type);
			else
				figures[i] = new Triangle(height, width, type);
		}
		for(GeometricFigure f : figures)
		{
			System.out.println("\nGeometric figure:");
			System.out.println("Type: " + f.getType());
			System.out.println("Height: " + f.getHeight() + " cm");
			System.out.println("Width: " + f.getWidth() + " cm");
			System.out.println("Area: " + f.calculateArea() + " cm2");
		}
	}
}
