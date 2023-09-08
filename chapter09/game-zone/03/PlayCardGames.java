public class PlayCardGames
{
	public static void main(String[] args)
	{
		CardGame poker = new Poker();
		System.out.println(poker.displayDescription() + "\n");
		Card[] player = poker.deal();
		display(player, "Player");
		Card[] computer = poker.deal();
		display(computer, "Computer");

		System.out.println();

		CardGame bridge = new Bridge();
		System.out.println(bridge.displayDescription() + "\n");
		player = bridge.deal();
		display(player, "Player");
		computer = bridge.deal();
		display(computer, "Computer");
	}
	public static void display(Card[] hand, String participant)
	{
		System.out.println(participant + "s hand:  ");
		for(int i = 0; i < hand.length; i++)
		{
			System.out.print(hand[i].getRepresentingValue() + " of " +
					hand[i].getSuit() + "  ");
			if((i + 1)  % 5 == 0)
				System.out.println();
		}
		System.out.println("\n");
	}
}
