import java.util.Scanner;

public class MileConversionInteractive {

	public static void main(String[] args) {

		final int INCHES_IN_MILE = 63360;
		final int FEET_IN_MILE = 5280;
		final int YARDS_IN_MILE = 1760;
		int miles;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of miles >> ");
		miles = input.nextInt();

		int inches = miles * INCHES_IN_MILE;
		int feet = miles * FEET_IN_MILE;
		int yards = miles * YARDS_IN_MILE;

		System.out.println("In " + miles + " miles there is " +
			inches + " inches, " +
			feet + " feet, " +
			inches + " inches");

	}

}
