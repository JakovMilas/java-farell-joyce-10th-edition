import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {

		final int QUARTS_IN_GALLON = 4;
		int quartsNeeded;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of quarts needed >> ");
		quartsNeeded = input.nextInt();

		int gallons = quartsNeeded / QUARTS_IN_GALLON;
		int quarts = quartsNeeded % QUARTS_IN_GALLON;

		System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
						gallons + " gallons plus " + quarts + " quarts.");

	}

}
