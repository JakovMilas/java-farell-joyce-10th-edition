/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 3b

Task:
Add a prompt to the ShadyRestRoom application to ask the user to specify
a (1) lake view or a (2) park view, but ask that question only if the bed
size entry is valid. Add $15 to the price of any room with a lake view.
If the view value is invalid, display an appropriate message and assume
that the price is for a room with a lake view.
Save the file as ShadyRestRoom2.java.

https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class ShadyRestRoom2 {

	public static void main(String[] args) {

		final int QUEEN_CODE = 1;
		final int KING_CODE = 2;
		final int SUITE_CODE = 3;
		final int PARK_VIEW_CODE = 2;
		final int LAKE_VIEW_CODE = 1;
		final double QUEEN_PRICE = 125.0;
		final double KING_PRICE = 139.0;
		final double SUITE_PRICE = 165.0;
		final double LAKE_VIEW_ADDON_PRICE = 15;
		int roomCode = 0;
		int viewCode = 0;
		boolean isCodeValid = false;;
		double price;
		String roomMessage;
		String viewMessage = "";
		Scanner input = new Scanner(System.in);

		System.out.println("\nEnter code:");
		System.out.print("1 for Queen bed ($" + QUEEN_PRICE + ")" +
						 "\n2 for King bed ($" + KING_PRICE + ")" +
						 "\n3 for King bed with pullout couch ($" +
						 SUITE_PRICE + ")\n >> ");

		roomCode = input.nextInt();

		switch (roomCode) {
			case QUEEN_CODE: {
				price = QUEEN_PRICE;
				roomMessage = "Queen bed";
				isCodeValid = true;
				break;
			}
			case KING_CODE: {
				price = KING_PRICE;
				roomMessage = "King bed";
				isCodeValid = true;
				break;
			}
			case SUITE_CODE: {
				price = SUITE_PRICE;
				roomMessage = "King bed with pullout couch";
				isCodeValid = true;
				break;
			}
			default: {
				price = 0;
				roomMessage = "invalid code";
			}
		}

		if (isCodeValid) {
			System.out.println("Do you want:");
			System.out.print("1 lake view with additional $" + LAKE_VIEW_ADDON_PRICE +
							"\n2 park view with no additional price\n >> ");
			viewCode = input.nextInt();

			if (viewCode == PARK_VIEW_CODE)
				viewMessage = "park";
			else
				if (viewCode == LAKE_VIEW_CODE) {
					viewMessage = "lake";
					price = price + LAKE_VIEW_ADDON_PRICE;
			} else {
				System.out.println("Invalid code for view, lake view selected");
				viewMessage = "lake";
				price = price + LAKE_VIEW_ADDON_PRICE;
			}

			System.out.print("You selected " + roomMessage + " and " + viewMessage +
						" view, price is $" + price);
		} else
			System.out.println("invalid room code selected");
	}

}
