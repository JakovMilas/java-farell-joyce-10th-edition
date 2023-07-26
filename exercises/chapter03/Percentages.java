import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {

		double number1;
		double number2;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first double value >> ");
		number1 = input.nextDouble();

		System.out.print("Enter second double value >> ");
		number2 = input.nextDouble();

		computePercent(number1, number2);
		computePercent(number2, number1);

	}

	public static void computePercent(double firstNumber, double secondNumber) {

		double percentage = (firstNumber / secondNumber) * 100;
		System.out.println(firstNumber + " is " + percentage + "% of a secondNumber");

	}

}
