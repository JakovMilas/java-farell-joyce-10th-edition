public class InchesToFeet {

	public static void main(String[] args) {

		int inches = 1234;
		final int INCHES_IN_FOOT = 12;
		int feet = inches / INCHES_IN_FOOT;
		int restInches = inches % INCHES_IN_FOOT;

		System.out.println(inches + " inches equals " + feet + " feet and " + restInches + " inches.");

	}

}
