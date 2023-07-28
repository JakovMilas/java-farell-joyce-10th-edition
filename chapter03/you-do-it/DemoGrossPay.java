public class DemoGrossPay {

	public static void main(String[] args) {

		double hours = 25;
		double yourHoursWorked = 37.5;
		calculateGross(10);
		calculateGross(hours);
		calculateGross(yourHoursWorked);

	}

	public static void calculateGross(double hours) {

		final double STD_RATE = 22.75;
		double gross;
		gross = hours * STD_RATE;
		System.out.println(hours + " hours at $" + STD_RATE + " per hour is $" + gross);

	}

}
