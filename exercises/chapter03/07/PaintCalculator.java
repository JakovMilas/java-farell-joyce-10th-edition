/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 07

Task:
Assume that a gallon of paint covers about 350 square feet of wall space. Create an application
with a main() method that prompts the user for the length, width, and height of a rectangular
room. Pass these three values to a method that does the following:
	❯❯Calculates the wall area for a room
	❯❯Passes the calculated wall area to another method that calculates and returns the number
	  of gallons of paint needed
	❯❯Displays the number of gallons needed
	❯❯Computes the price based on a paint price of $32 per gallon, assuming that the painter can
	  buy any fraction of a gallon of paint at the same price as a whole gallon
	❯❯Returns the price to the main() method
The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room
with 10-foot ceilings is $64. Save the application as PaintCalculator.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class PaintCalculator {

	public static void main(String[] args) {

		int length;
		int width;
		int height;
		double finalPrice;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of a room >> ");
		length = input.nextInt();
		System.out.print("Enter width of a room >> ");
		width = input.nextInt();
		System.out.print("Enter heigth of a room >> ");
		height = input.nextInt();

		finalPrice = calculatePrice(length, width, height);

		System.out.println("The costo to paint " + length + "-by-" + width + " room with " +
				height + "-foot ceiling is $" + finalPrice);

	}

	public static double calculatePrice(int length, int width, int height) {

		int area = (length * height * 2) + (width * height * 2) + (length * width);
		double numberOfGallonsNeeded = calculateGallonsNeeded(area);
		System.out.println("Gallons needed for the job: " + numberOfGallonsNeeded);
		double price =  numberOfGallonsNeeded * 32;
		return price;

	}

	public static double calculateGallonsNeeded(int area) {

		int gallonsNeeded = area / 350;
		return gallonsNeeded;

	}

}
