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
