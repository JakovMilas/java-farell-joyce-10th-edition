public class QuartsToGallons {

	public static void main(String[] args) {

		final int QUARTS_IN_GALLON = 4;
		int quartsNeeded = 18;

		int gallons = quartsNeeded / QUARTS_IN_GALLON;
		int quarts = quartsNeeded % QUARTS_IN_GALLON;

		System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
						gallons + " gallons plus " + quarts + " quarts.");

	}

}
