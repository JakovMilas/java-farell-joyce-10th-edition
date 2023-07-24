import java.util.Scanner;

public class RandomGuessMatch {

	public static void main(String[] args) {

		int random = (int)(Math.random() * 5) + 1;
		int guess;
		Scanner input = new Scanner(System.in);

		System.out.print("Guess number from 1 to 5 >> ");
		guess = input.nextInt();

		System.out.println("Difference between random number and your number is " + (Math.abs(guess - random)));
		System.out.println("Your guess equals random number is " + (guess == random));

	}

}
