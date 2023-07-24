/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 08b

Task:
In the ChiliToGo program, the costs to produce an adult’s meal and a child’s meal are $4.35 and $3.10,
respectively. Modify the ChiliToGo program to display the total profit for each type of meal as well as
the grand total profit. Save the program as ChiliToGoProfit.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class ChiliToGoProfit {

	public static void main(String[] args) {

		final double ADULT_MEAL_PRICE = 7.0;
		final double CHILD_MEAL_PRICE = 4.0;
		final double ADULT_MEAL_PRODUCTION_COST = 4.35;
		final double CHILD_MEAL_PRODUCTION_COST = 3.10;
		int numberOfAdultMeals;
		int numberOfChildMeals;
		double totalPriceAdultMeals;
		double totalPriceChildMeals;
		double totalProductionCostAdultMeals;
		double totalProductionCostChildMeals;
		double totalPrice;
		double totalProductionCost;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of adult's meals ordered >> ");
		numberOfAdultMeals = input.nextInt();
		input.nextLine();
		System.out.print("Enter number of child's meals ordered >> ");
		numberOfChildMeals = input.nextInt();

		totalPriceAdultMeals = numberOfAdultMeals * ADULT_MEAL_PRICE;
		totalPriceChildMeals = numberOfChildMeals * CHILD_MEAL_PRICE;
		totalPrice = totalPriceAdultMeals + totalPriceChildMeals;

		totalProductionCostAdultMeals = numberOfAdultMeals * ADULT_MEAL_PRODUCTION_COST;
		totalProductionCostChildMeals = numberOfChildMeals * CHILD_MEAL_PRODUCTION_COST;
		totalProductionCost = totalProductionCostAdultMeals + totalProductionCostChildMeals;

		System.out.println("Adult's meals profit: $" + (totalPriceAdultMeals - totalProductionCostAdultMeals));
		System.out.println("Children's meals profit: $" + (totalPriceChildMeals - totalProductionCostChildMeals));
		System.out.println("Total profit: $" + (totalPrice - totalProductionCost));

	}

}
