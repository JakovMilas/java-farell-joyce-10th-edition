import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an number >> ");
		number = input.nextInt();

		displayTwiceTheNumber(number);
		displayNumberPlusFive(number);
		displayNumberSquared(number);

	}

	public static void displayTwiceTheNumber(int number) {

		System.out.println(number + " times two is " + (number * 2));

	}

	public static void displayNumberPlusFive(int number) {

		System.out.println(number + " plus five is " + (number + 5));

	}

	public static void displayNumberSquared(int number) {

		System.out.println(number + " squared is " + (number * number));

	}

}
