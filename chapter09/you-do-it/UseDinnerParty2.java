import java.util.*;

public class UseDinnerParty2
{
	public static void main(String[] args)
	{
		int guests;
		int choice;
		DinnerParty2 aDinnerParty = new DinnerParty2();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number of guests for the party >> ");
		guests = keyboard.nextInt();
		aDinnerParty.setGuests(guests);
		System.out.print("Enter the menu option:\n1 for chicken\n2 for beef\n >> ");
		choice = keyboard.nextInt();
		aDinnerParty.setDinnerChoice(choice);
		System.out.println("The party has " + aDinnerParty.getGuests() + " guests");
		System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + 
				" will be served.");
		aDinnerParty.displayInvitation();
	}
}
