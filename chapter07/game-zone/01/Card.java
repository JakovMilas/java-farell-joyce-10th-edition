/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Game Zone 1a

Task:
Design a Card class. The class holds fields that contain a Card's value and a suit that is one of the
four strings Spades, Hearts, Diamonds, or Clubs. Also, add a field to the class to hold the String
representation of a Card's rank based on its value. Within the Card class setValue() method, besides
setting the numeric value, also set the String rank value as follows:

NUMERIC VALUE    STRING VALUE FOR RANK
1                Ace
2 through 10     2 through 10
11               Jack
12               Queen
13               King

Save file as Card.java

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Card {

	private int value;
	private String suit;
	private String rank;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		if (value == 1)
			rank = "Ace";
		else
			if (value == 11)
				rank = "Jack";
		else
			if(value == 12)
				rank = "Queen";
		else
			if (value == 13)
				rank = "King";
		else
			rank = ("" + value);
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

}
