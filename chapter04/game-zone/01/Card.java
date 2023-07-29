/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Game Zone 1

Task:
Playing cards are used in many computer games, including versions of such
classics as solitaire, hearts, and poker. Design a Card class that contains
a character data field to hold a suit (s for spades, h for hearts, d for
diamonds, or c for clubs) and an integer data field for a value from 1 to 13.
Include get and set methods for each field. Save the class as Card.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Card {

	private char suit;
	private int value;

	public void setSuit(char suit) {
		this.suit = suit;
	}
	public char getSuit() {
		return suit;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}

}
