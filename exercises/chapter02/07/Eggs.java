import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {

		final int EGGS_IN_DOZEN = 12;
		final double DOZEN_PRICE = 3.25;
		final double LOOSE_EGG_PRICE = 0.45;
		int eggsOrdered;
		int numberOfDozen;
		int looseEggs;
		double totalPrice;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of eggs >> ");
		eggsOrdered = input.nextInt();

		numberOfDozen = eggsOrdered / EGGS_IN_DOZEN;
		looseEggs = eggsOrdered % EGGS_IN_DOZEN;
		totalPrice = (numberOfDozen * DOZEN_PRICE) + (LOOSE_EGG_PRICE * looseEggs);

		System.out.println("You ordered " + eggsOrdered + "eggs.");
		System.out.println("That's " + numberOfDozen + " dozen at $" + DOZEN_PRICE + " per dozen");
		System.out.println("and " + looseEggs + " lose eggs at $" + LOOSE_EGG_PRICE + " each ");
		System.out.println("for a total of $" + totalPrice);

	}

}
