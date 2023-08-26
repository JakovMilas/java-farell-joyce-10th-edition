public class PartyWithConstructor
{
	public PartyWithConstructor()
	{
		System.out.println("Creating a party");
	}
	private int guests;

	public int getGuests()
	{
		return guests;
	}
	public void setGuests(int guests)
	{
		this.guests = guests;
	}
	public void displayInvitation()
	{
		System.out.println("Please come to my party!");
	}
}
