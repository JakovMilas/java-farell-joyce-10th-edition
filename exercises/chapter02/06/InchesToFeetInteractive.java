import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {

		int inches;
		final int INCHES_IN_FOOT = 12;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of inches >> ");
		inches = input.nextInt();

		int feet = inches / INCHES_IN_FOOT;
		int restInches = inches % INCHES_IN_FOOT;

		System.out.println(inches + " inches equals " + feet + " feet and " + restInches + " inches.");

	}

}
