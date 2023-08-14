/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 2a

Task:
Create an application that randomly "throws" five dice for the computer and
five dice for the player, with the dice having values 1 through 6. The application displays the values and
determines the winner based on the following hierarchy of values. Any higher combination beats a lower
one?  For example, five of a kind beats four of a kind.
 - Five of a kind
 - Four of a kind
 - Three of a kind
 - A pair
For this game, the dice values do not count; for example, if both players have three of a kind, it?s a tie, no
matter what the values of the three dice are. Additionally, the game does not recognize other poker hand
combinations such as a full house (three of a kind plus two of a kind) or a straight (sequential values).
Figure 8-45 shows a sample execution. Save the application as FiveDice2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class FiveDice2
{
	public static void main(String[] args)
	{
		final int LIMIT = 5;
		Die[] player = new Die[LIMIT];
		Die[] computer = new Die[LIMIT];
		int[] playerValues = new int[6];
		int[] computerValues = new int[6];
		int playerMostValues = 0;
		int computerMostValues = 0;
		System.out.println("\n G A M E:   F i v e   d i c e\n");
		throwDice(player);
		countValues(player, playerValues);
		throwDice(computer);
		countValues(computer, computerValues);

		for(int i = 0; i < playerValues.length; i++)
		{
			if(playerValues[i] >= playerMostValues)
				playerMostValues = playerValues[i];
			if(computerValues[i] >= computerMostValues)
				computerMostValues = computerValues[i];
		}
		displayDice(player, "You     ");
		System.out.print("   " + playerMostValues + " of a kind");
		System.out.println();
		displayDice(computer, "Computer");
		System.out.print("   " + computerMostValues + " of a kind");
		System.out.println();
		if(playerMostValues > computerMostValues)
			System.out.println("You win!");
		else
			if(playerMostValues < computerMostValues)
				System.out.println("Computer won!");
			else
				System.out.println("It's a tie!");
		System.out.println();
	}
	public static void throwDice(Die[] dice)
	{
		for(int i = 0; i < dice.length; i++)
			dice[i] = new Die();
	}
	public static void displayDice(Die[] dice, String participant)
	{
		System.out.print(participant + ": ");
		for(Die die : dice)
			System.out.print(die.getValue() + " ");
	}
	public static void countValues(Die[] dice, int[] values)
	{
		for(int i = 0; i < dice.length; i++)
		{
			switch (dice[i].getValue())
			{
				case 1:
					values[0]++;
					break;
				case 2:
					values[1]++;
					break;
				case 3:
					values[2]++;
					break;
				case 4:
					values[3]++;
					break;
				case 5:
					values[4]++;
					break;
				case 6:
					values[5]++;
			}
		}
	}
	public static void displayValues(int[] values)
	{
		for(int i = 0; i < values.length; i++)
			System.out.println("Value of " + (i + 1) + ": " + values[i] + "x");
	}
}
