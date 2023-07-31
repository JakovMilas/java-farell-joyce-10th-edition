import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {

		int number1;
		int number2;
		int value;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number >> ");
		number1 = input.nextInt();
		System.out.print("Enter second number >> ");
		number2 = input.nextInt();

		value = (number1 < number2) ? number1 : number2;

		System.out.println("Value is: " + value);

	}

}
