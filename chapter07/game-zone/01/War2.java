/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Game Zone 1b

Task:
Create a War Card game that randomly selects two cards (one for the player and one for the computer)
and declares a winner (or a tie). Figure 7-18 shows a typical execution. Recall that in this version of War,
you assume that the Ace is the lowest-valued card. Save the game as War2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Random;

public class War2 {

	public static void main(String[] args) {

		Card player = new Card();
		Card computer = new Card();

		player.setValue(generateValue());
		player.setSuit(generateSuit("")); // dummy argument
		computer.setValue(generateValue());
		computer.setSuit(generateSuit("")); // dummy argument

		// if both player and computer have the same values for card
		// value and card suit, generateSuit() method is called again
		// for computer's suit with player's suit as argument
		if (player.getValue() == computer.getValue() &&
			player.getSuit() == computer.getSuit())
				computer.setSuit(generateSuit(player.getSuit()));

		System.out.println("\nPlayer  : " + player.getRank() +
						" of " + player.getSuit());
	
		System.out.println("Computer: " + computer.getRank() +
						" of " + computer.getSuit());
		
		if (player.getValue() > computer.getValue())
			System.out.println("You win!\n");
		else
			if (player.getValue() < computer.getValue())
				System.out.println("Computer won!\n");
			else
				System.out.println("It's a tie!\n");

	}

	public static String generateSuit(String playerSuit) {
		String suit = "";
		Random random = new Random();
		int intSuit = random.nextInt(4);
		switch (intSuit) {
			case 0:
				suit = "Spades";
				break;
			case 1:
				suit = "Hears";
				break;
			case 2:
				suit = "Diamonds";
				break;
			default:
				suit = "Clubs";
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
