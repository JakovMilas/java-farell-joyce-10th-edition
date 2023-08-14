/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 2b

Task:
Improve the FiveDice2 game so that when both players have the same combination of dice, the higher
value wins. For example, two 6s beats two 5s. Save the application as FiveDice3.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class FiveDice3
{
	public static void main(String[] args)
	{
		final int LIMIT = 5;
		Die[] player = new Die[LIMIT];
		Die[] computer = new Die[LIMIT];
		int[] playerValues = new int[6];
		int[] computerValues = new int[6];
		int playerMostValues = 0;
		int playerHighestValue = 0;
		int computerMostValues = 0;
		int computerHighestValue = 0;
		System.out.println("\n G A M E:   F i v e   d i c e\n");
		throwDice(player);
		countValues(player, playerValues);
		throwDice(computer);
		countValues(computer, computerValues);

		for(int i = 0; i < playerValues.length; i++)
		{
			if(playerValues[i] >= playerMostValues)
			{
				playerMostValues = playerValues[i];
				if(playerHighestValue < i + 1);
					playerHighestValue = i + 1;
			}
			if(computerValues[i] >= computerMostValues)
			{
				computerMostValues = computerValues[i];
				if(computerHighestValue < i + 1)
					computerHighestValue = i + 1;
			}
		}
		displayDice(player, "You     ");
		System.out.print("   " + playerMostValues + " of " + playerHighestValue + "'s");
		System.out.println();
		displayDice(computer, "Computer");
		System.out.print("   " + computerMostValues + " of " + computerHighestValue + "'s");
		System.out.println();
		if(playerMostValues > computerMostValues)
			System.out.println("You win!");
		else
			if(playerMostValues == computerMostValues)
				if(playerHighestValue > computerHighestValue)
					System.out.println("You win!");
				else
					if (playerHighestValue < computerHighestValue)
						System.out.println("Computer won!");
					else
						System.out.println("It's a tie!");
			else
				System.out.println("Computer won!");
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
