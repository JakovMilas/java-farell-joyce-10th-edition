/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Game Zone 3

Task:
Design a Card class that contains a character data field to hold a suit
(s for spades, h for hearts, d for diamonds, or c for clubs) and an
integer data field for a value from 1 to 13. Include a setValue() method
that does not allow a Card’s value to be less than 1 or higher than 13.
If the argument to setValue() is out of range, assign 1 to the Card’s
value. Save the file as Card.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Card {

	private char suit;
	private int value;

	public void setValue(int value) {
		if (value > 1 && value <= 13)
			this.value = value;
		else
			this.value = 1;
	}

	public void setSuit(char suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}
	public char getSuit() {
		return suit;
	}

}
