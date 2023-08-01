/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Game Zone 2

Task:
Create a lottery game application. Generate three random numbers
(see Appendix D for help in doing so), each between 0 and 9. Allow
the user to guess three numbers. Compare each of the user’s guesses
to the three random numbers and display a message that includes the
user’s guess, the randomly determined three-digit number, and the
amount of money the user has won, as follows:
 ❯❯ No matching numbers; award is $0
 ❯❯ Any one matching number; award is $10
 ❯❯ Two matching numbers; award is $100
 ❯❯ Three matching numbers, not in order; award is $1,000
 ❯❯ Three matching numbers in exact order; award is $1,000,000
Make certain that your application accommodates repeating digits.
For example, if a user guesses 1, 2, and 3, and the randomly generated
digits are 1, 1, and 1, do not give the user credit for three correct
guesses—just one. Save the file as Lottery.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import javax.swing.JOptionPane;
import java.util.Random;

public class Lottery {

	public static void main(String[] args) {

		Random random = new Random();
		final int LIMIT = 900;
		String message = "";
		int randomNumbers = random.nextInt(LIMIT) + 100;
		int rand1, rand2, rand3;
		rand1 = randomNumbers / 100;
		rand2 = randomNumbers % 100 / 10;
		rand3 = randomNumbers % 100 % 10;
		String userInput;
		int guessNumbers;
		int guess1, guess2, guess3;

		userInput = JOptionPane.showInputDialog(null, "Enter three numbers");
		guessNumbers = Integer.parseInt(userInput);
		guess1 = guessNumbers / 100;
		guess2 = guessNumbers % 100 / 10;
		guess3 = guessNumbers % 100 % 10;

		if (randomNumbers == guessNumbers)
			message = "\nYour numbers:  " + guessNumbers +
					  "\nLotto numbers: " + randomNumbers +
					  "\nYou won $1,000,000";
		else {
			message = "\nYour numbers:  " + guessNumbers +
					  "\nLotto numbers: " + randomNumbers + "\n" +
					  checkNumbers(rand1, rand2, rand3, guess1, guess2, guess3);
		}

		JOptionPane.showMessageDialog(null, message);

	}

	public static String checkNumbers(int r1, int r2, int r3,
									  int g1, int g2, int g3) {
		int guessCount = 0;
		String message = "";
		if (g1 == r1 || g1 == r2 || g1 == r3)
			guessCount++;
		if (g2 == r1 || g2 == r2 || g2 == r3)
			guessCount++;
		if (g3 == r1 || g3 == r2 || g3 == r3)
			guessCount++;

		if (guessCount == 0)
			message = "You have no guessed numbers";
		else
			if (guessCount == 1)
				message = "Your guessed " + guessCount +
						  " number\nYou won $10";
		else
			if (guessCount == 2)
				message = "You guessed " + guessCount +
						  " numbers\nYou won $100";
		else
			if (guessCount == 3)
				message = "You guessed " + guessCount +
						  " numbers\nYou won $1000";
		return message;

	}

}
