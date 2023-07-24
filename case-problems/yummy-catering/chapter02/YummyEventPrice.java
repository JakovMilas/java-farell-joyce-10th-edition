import java.util.Scanner;

public class YummyEventPrice {

	public static void main(String[] args) {

		int numberOfGuests;
		final double PRICE_PER_GUEST = 35.0;
		final int LARGE_EVENT_LIMIT = 50;
		boolean isLargeEvent;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of guests >> ");
		numberOfGuests = input.nextInt();

		isLargeEvent = numberOfGuests >= LARGE_EVENT_LIMIT;

		System.out.println("***********************************************");
		System.out.println("* Yummy makes the food that makes it a party! *");
		System.out.println("***********************************************");

		System.out.println("Number of guests: " + numberOfGuests);
		System.out.println("Price per guest:  " + PRICE_PER_GUEST);
		System.out.println("Total price:      " + (numberOfGuests * PRICE_PER_GUEST));
		System.out.println("Large event is:   " + isLargeEvent);

	}

}
