/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Game Zone 1

Task:
Write an application that randomly selects two playing cards and displays
their values. Simply assign a suit to each of the cards, but generate a random
number for each card’s value. The following statements generate a random number
between 1 and 13 and assign it to a variable:
final int CARDS_IN_SUIT = 13;
myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
Later in this course, you will be able to have the game determine the higher card.
For now, just observe how the card values change as you execute the program
multiple times. Save the application as PickTwoCards.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class PickTwoCards {

	public static void main(String[] args) {
	
		final int CARDS_IN_SUIT = 13;

		Card card1 = new Card();
		Card card2 = new Card();
		card1.setSuit('H');
		card1.setValue((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		card2.setSuit('D');
		card2.setValue((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);


		System.out.println(card1.getValue() + " of " + card1.getSuit());
		System.out.println(card2.getValue() + " of " + card2.getSuit());
	
	}

}
