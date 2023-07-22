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
