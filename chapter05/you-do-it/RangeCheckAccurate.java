import java.util.Scanner;

public class RangeCheckAccurate {

	public static void main(String[] args) {
	
		final double HIGH_LIMIT = 1000.0;
		final double HIGH_RATE = 0.08;
		final double MEDIUM_LIMIT = 500.0;
		final double MEDIUM_RATE = 0.06;
		final double LOW_RATE = 0.05;
		double amount;
		double rate;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your sales amount >> ");
		amount = input.nextDouble();

		if (amount >= HIGH_LIMIT)
			rate = HIGH_RATE;
		else
			if (amount >= MEDIUM_LIMIT)
				rate = MEDIUM_RATE;
			else
				rate = LOW_RATE;
		
		System.out.println("For sales amount of $" + amount + " rate is " + rate + "%.");



	
	}

}
