/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 3c

Task:
Create a game that uses the Card class to play 26 rounds of War, dealing a full deck with no repeated
cards. Some hints:
 - Start by creating an array of all 52 playing cards.
 - Select a random number for the deck position of the player?s first card, and assign the card at that array
   position to the player.
 - Move every higher-positioned card in the deck ?down? one to fill in the gap. In other words, if the
   player?s first random number is 49, select the card at position 49, move the card that was in position
   50 to position 49, and move the card that was in position 51 to position 50. Only 51 cards remain in the
   deck after the player?s first card is dealt, so the available-card array is smaller by one.
 - In the same way, randomly select a card for the computer and ?remove? the card from the deck.
 - Display the values of the player?s and computer?s cards, compare their values, and determine whether
   the result is a tie or there is a winner.
 - When all the cards in the deck are exhausted, display a count of the number of times the player wins,
   the number of times the computer wins, and the number of ties.
Save the game as War3.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class War3
{
	public static void main(String[] args)
	{
		Card[] deck = new Card[52];
		Scanner input = new Scanner(System.in);
		Card player;
		Card computer;
		int roundCount = 0;
		int playerWinCount = 0;
		int computerWinCount = 0;
		int tieCount = 0;
		int roundResult;
		int cardsRemaining = deck.length;
		FullDeck.populate(deck);
		System.out.println("\n     C A R D  G A M E:     W a r 3\n");

		while(roundCount < 26)
		{
			System.out.print("Press ENTER for round #" + (roundCount + 1) + " >> ");
			input.nextLine();
			System.out.print(" You:      ");
			player = drawCard(deck, cardsRemaining);
			cardsRemaining--;
			System.out.print(" Computer: ");
			computer = drawCard(deck, cardsRemaining);
			cardsRemaining--;
			roundResult = resolveRoundWinner(player.getValue(), computer.getValue());
			if(roundResult == 1)
				playerWinCount++;
			else
				if(roundResult == 2)
					computerWinCount++;
			else
				tieCount++;
			roundCount++;
			System.out.println("You: " + playerWinCount + "   Comp: " +
					computerWinCount + "   Ties: " + tieCount);
			System.out.println("----------------------------");
		}
		resolveGameWinner(playerWinCount, computerWinCount, tieCount);
	}
	public static Card drawCard(Card[] deck, int remainingCards)
	{
		Random random = new Random();
		int cardIndex = random.nextInt(remainingCards);
		Card card = deck[cardIndex];
		System.out.println(card.getRepresentingValue() + " of " + card.getSuit());
		removeCard(deck, remainingCards, cardIndex);
		return card;
	}
	public static void removeCard(Card[] deck, int remainingCards, int cardIndex)
	{
		for(int i = cardIndex; i < remainingCards - 1; i++)
			deck[i] = deck[i + 1];	
	}
	public static int resolveRoundWinner(int playerCardValue, int computerCardValue)
	{
		int roundResult;
		if(playerCardValue > computerCardValue)
		{
			System.out.println(" > YOU WIN!");
			roundResult = 1;
		}
		else
			if(playerCardValue < computerCardValue)
			{
				System.out.println(" > COMPUTER WON!");
				roundResult = 2;
			}
			else
			{
				System.out.println(" > IT'S A TIE!");
				roundResult = 0;
			}
		return roundResult;
	}
	public static void resolveGameWinner(int playerWinCount, int computerWinCount, int tieCount)
	{
		System.out.println("----------------------------");
		System.out.println(" You won " + playerWinCount + " rounds");
		System.out.println(" Computer won " + computerWinCount + " rounds");
		System.out.println(" Ties " + tieCount);
		if(playerWinCount < computerWinCount)
			System.out.println("\nCOPMUTER WON!");
		else
			if(playerWinCount > computerWinCount)
				System.out.println("\nYOU ARE THE WINNER!");
			else
				System.out.println("\nIT'S A TIE!");
		System.out.println();
	}
}
