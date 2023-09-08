/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 3c

Task:
Create two child classes that extend CardGame. You can choose any games you prefer. For example,
you might create a Poker class and a Bridge class. Create a constructor for each child class
that initializes the field that holds the number of cards dealt to the correct value. (For example, in
standard poker, a player receives 5 cards, but in bridge, a player receives 13.) Create an appropriate
displayDescription() and deal() method for each child class. Save each file using an appropriate
name?for example, Poker.java or Bridge.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



public class Poker extends CardGame
{
	public Poker()
	{
		cardsDealt = 5;
	}
	@Override
	public String displayDescription()
	{
		return "Poker game";
	}
	@Override
	public Card[] deal()
	{
		int newLength = deck.length - cardsDealt;
		Card[] hand = new Card[cardsDealt];
		
		for(int i = 0; i < cardsDealt; i++)
		{
			hand[i] = deck[i];
		}

		for(int i = 0; i < newLength; i++)
		{
			deck[i] = deck[i + cardsDealt];
		}
		newLength -= cardsDealt;
		
		return hand;
	}
}
