/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 8

Task:
Write an application that declares two Automobile objects and prompts the
user for values. When you test the program, be sure to enter some invalid
data to demonstrate that all the methods work correctly.
Save the file as TestAutomobiles.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;

public class TestAutomobiles {

	public static void main(String[] args) {

		Automobile a1 = getAutomobileData();
		Automobile a2 = getAutomobileData();
		Automobile a3 = getAutomobileData();

		display(a1);
		display(a2);
		display(a3);

	}

	public static Automobile getAutomobileData() {
		Scanner input = new Scanner(System.in);
		int id, year, miles;
		String make, model, color;
		System.out.print("Enter automobile ID >> ");
		id = input.nextInt();
		System.out.print("Enter make >> ");
		input.nextLine();
		make = input.nextLine();
		System.out.print("Enter model >> ");
		model = input.nextLine();
		System.out.print("Enter color >> ");
		color = input.nextLine();
		System.out.print("Enter year >> ");
		year = input.nextInt();
		System.out.print("Enter miles per gallon >> ");
		miles = input.nextInt();
		Automobile a = new Automobile(id, make, model, color, year, miles);
		return a;
	}

	public static void display(Automobile a) {
		System.out.println("\nAutomobile data:");
		System.out.println("ID: " + a.getIdNumber());
		System.out.println("Make: " + a.getMake());
		System.out.println("Model: " + a.getModel());
		System.out.println("Color: " + a.getColor());
		System.out.println("Year: " + a.getYear());
		System.out.println("Miles per gallon: " + a.getMilesPerGallon());
	}

}
