/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 01b

Task:
Create an application named TestSandwich that prompts the user for data,
instantiates one Sandwich object, and displays its values.
Save the application as TestSandwich.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TestSandwich {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Sandwich sandwich = new Sandwich();

		System.out.print("Enter ingredients for the sandwich >> ");
		sandwich.setIngredient(input.nextLine());
		System.out.print("Enter bread type >> ");
		sandwich.setBreadType(input.nextLine());
		System.out.print("Enter price >> ");
		sandwich.setPrice(input.nextDouble());

		System.out.println("\nSandwich:");
		System.out.println("Ingredients: " + sandwich.getIngredient());
		System.out.println("Bread type:  " + sandwich.getBreadType());
		System.out.println("Price:      $" + sandwich.getPrice());


	
	}

}
