import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	
		int number;
		boolean isEven;
		String message = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an number >> ");
		number = input.nextInt();

		isEven(number);

		if (isEven(number))
			message = "even";
		else
			message = "odd";

		System.out.println("\nThe number " + number + " is an " + message + " number");
	
	}

	public static boolean isEven(int number) {
		boolean result;
		if (number % 2 == 0)
			result = true;
		else
			result = false;
		return result;
	}

}
