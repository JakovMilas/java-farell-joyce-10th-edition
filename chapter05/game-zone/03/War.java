/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Game Zone 3

Task:
Play a very simple version of the card game War. Deal two Cards—one for
the computer and one for the player—and set their suits and values
randomly. Determine the higher card, then display a message indicating
whether the cards are equal, the computer won, or the player won. 
(Playing cards are considered equal when they have the same value,
no matter what their suit is.) For this game, assume the Ace (value 1)
is low. Make sure that the two Cards dealt are not the same Card.
For example, a deck cannot contain more than one Card representing the
2 of Spades. If two Cards are created to have the same values, change
the suit for one of them. Save the application as War.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Random;

public class War {

	public static void main(String[] args) {

		Card player = new Card();
		Card computer = new Card();

		player.setValue(generateValue());
		player.setSuit(generateSuit(' ')); // dummy argument
		computer.setValue(generateValue());
		computer.setSuit(generateSuit(' ')); // dummy argument

		// if both player and computer have the same values for card
		// value and card suit, generateSuit() method is called again
		// for computer's suit with player's suit as argument
		if (player.getValue() == computer.getValue() &&
			player.getSuit() == computer.getSuit())
				computer.setSuit(generateSuit(player.getSuit()));

		System.out.println("Player  : " + player.getValue() +
						" of " + player.getSuit());
	
		System.out.println("Computer: " + computer.getValue() +
						" of " + computer.getSuit());
		
		if (player.getValue() > computer.getValue())
			System.out.println("You win!");
		else
			if (player.getValue() < computer.getValue())
				System.out.println("Computer won!");
			else
				System.out.println("It's a tie!");

	}

	public static char generateSuit(char playerSuit) {
		char suit = ' ';
		Random random = new Random();
		int intSuit = random.nextInt(4) + 1;
		switch (intSuit) {
			case 1:
				suit = 'H';
				break;
			case 2:
				suit = 'D';
				break;
			case 3:
				suit = 'C';
				break;
			case 4:
				suit = 'S';
				break;
		}
		// if computer's suit is same again, method generateSuit()
		// is recursively called until suits are different
		if (suit == playerSuit)
			generateSuit(playerSuit);
		return suit;

	}

	public static int generateValue() {
		Random random = new Random();
		int value = random.nextInt(13) + 1;
		return value;
	}

}
