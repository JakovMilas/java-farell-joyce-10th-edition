/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 3b

Task:
Create an array of 52 Card objects, assigning a different value to each Card, and display each Card.
Save the application as FullDeck.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class FullDeck
{
	public static void main(String[] args)
	{
		Card[] deck = new Card[52];
		populate(deck);
		display(deck);
	}	
	public static void display(Card[] deck)
	{
		for(int i = 0; i < deck.length; i++)
			System.out.println(deck[i].getRepresentingValue() + " of " + deck[i].getSuit());

	}
	public static void populate(Card[] deck)
	{
		for(int i = 0; i < deck.length; i++)
		{
			deck[i] = new Card();
			deck[i].setSuit(i / (deck.length / 4));
			deck[i].setValue(i % (deck.length / 4));
		}
	}
}
