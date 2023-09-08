/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 3b

Task:
Create an abstract CardGame class similar to the one described in this chapter. The class contains a
virtual deck of 52 playing cards that uses a Card class that holds a suit and value for each Card object.
It also contains an integer field that holds the number of cards dealt to a player in a particular game.
The class contains a constructor that initializes the deck of cards with appropriate values (for example,
King of Hearts), and a shuffle() method that randomly arranges the positions of the Cards in the
array. The class also contains two abstract methods: displayDescription(), which displays a brief
description of the game in each of the child classes, and deal(), which deals the appropriate number of
Card objects to one player of a game. Save the file as CardGame.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public abstract class CardGame
{
	protected Card[] deck = new Card[52];
	protected int cardsDealt;

	public CardGame()
	{
		for(int i = 0; i < deck.length; i++)
                {
                        deck[i] = new Card();
                        deck[i].setSuit(i / (deck.length / 4));
                        deck[i].setValue(i % (deck.length / 4));
                }
		shuffle(deck);
	}
	public void shuffle(Card[] cardDeck)
	{
		for(int i = 0; i < cardDeck.length; i++)
		{
			int random;
			Card temp;
			random = (int)(Math.random() * 52);
			temp = cardDeck[i];
			cardDeck[i] = cardDeck[random];
			cardDeck[random] = temp;
		}
	}
	public int getCardsDealt()
	{
		return cardsDealt;
	}
	public abstract String displayDescription();
	public abstract Card[] deal();
}
