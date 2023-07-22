import java.util.Scanner;

public class MinutesConversion {

	public static void main(String[] args) {

		final double MINUTES_IN_HOUR = 60;
		final double HOURS_IN_DAY = 24;
		int minutes;
		double hours;
		double days;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of minutes >> ");
		minutes = input.nextInt();

		hours = minutes / MINUTES_IN_HOUR;
		days = minutes / MINUTES_IN_HOUR / HOURS_IN_DAY;

		System.out.println(minutes + " minutes equals " + hours + " hours and equals " + days + " days.");

	}

}
