/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 08a

Task:
The Huntington Boys and Girls Club is conducting a fundraiser by selling chili dinners to go. The price
is $7 for an adult’s meal and $4 for a child’s meal. Write a program that accepts the number of each type
of meal ordered, and display the total money collected for adults’ meals, children’s meals, and all meals.
Save the program as ChiliToGo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;


public class ChiliToGo {

	public static void main(String[] args) {

		final double ADULT_MEAL_PRICE = 7.0;
		final double CHILD_MEAL_PRICE = 4.0;
		int numberOfAdultMeals;
		int numberOfChildMeals;
		double totalPriceAdultMeals;
		double totalPriceChildMeals;
		double totalPrice;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of adult's meals ordered >> ");
		numberOfAdultMeals = input.nextInt();
		input.nextLine();
		System.out.print("Enter number of child's meals ordered >> ");
		numberOfChildMeals = input.nextInt();

		totalPriceAdultMeals = numberOfAdultMeals * ADULT_MEAL_PRICE;
		totalPriceChildMeals = numberOfChildMeals * CHILD_MEAL_PRICE;
		totalPrice = totalPriceAdultMeals + totalPriceChildMeals;

		System.out.println("Adult's meals price: $" + totalPriceAdultMeals);
		System.out.println("Children's meals price: $" + totalPriceChildMeals);
		System.out.println("Total price: $" + totalPrice);

	}

}
