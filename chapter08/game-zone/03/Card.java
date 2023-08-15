/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 3a

Task:
Create a Card class so that each Card holds the name of a suit (Spades, Hearts, Diamonds, or Clubs) as
well as a value (Ace, King, Queen, Jack, or a number value). Save the file as Card.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Card
{
	private int value;
	private String representingValue;
	private String suit;

	public void setValue(int value)
	{
		this.value = value;
		switch (value)
		{
			case 0:
				representingValue = "Ace";
				break;
			case 10:
				representingValue = "Jack";
				break;
			case 11:
				representingValue = "Queen";
				break;
			case 12:
				representingValue = "King";
				break;
			default:
				representingValue = (value + 1) + "";
		}
	}
	public int getValue()
	{
		return value;
	}
	public String getRepresentingValue()
	{
		return representingValue;
	}
	public String getSuit()
	{
		return suit;
	}
	public void setSuit(int s)
	{
		switch (s)
		{
			case 0:
				suit = "Spades";
				break;
			case 1:
				suit = "Hearts";
				break;
			case 2:
				suit = "Diamonds";
				break;
			case 3:
				suit = "Clubs";
				break;
		}
	}	
}
