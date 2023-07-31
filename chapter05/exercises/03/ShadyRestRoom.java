/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 3a

Task:
Write an application for the Shady Rest Hotel; the program determines
the price of a room. Ask the user to choose 1 for a queen bed, 2 for
a king, or 3 for a king and a pullout couch. The output echoes the
input and displays the price of the room: $125 for queen, $139 for king,
and $165 for a suite with a king bed and a pullout couch. If the user
enters an invalid code, display an appropriate message and set the price to 0.
Save the file as ShadyRestRoom.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class ShadyRestRoom {

	public static void main(String[] args) {
	
		final int QUEEN_CODE = 1;
		final int KING_CODE = 2;
		final int SUITE_CODE = 3;
		final double QUEEN_PRICE = 125.0;
		final double KING_PRICE = 139.0;
		final double SUITE_PRICE = 165.0;
		int userCode = 0;
		double price;
		String message;
		Scanner input = new Scanner(System.in);

		System.out.println("\nEnter code:");
		System.out.print("1 for Queen bed\n2 for King bed" +
					"\n3 for King bed with pullout couch\n >> ");
		userCode = input.nextInt();

		switch (userCode) {
			case QUEEN_CODE: {
				price = QUEEN_PRICE;
				message = "Queen bed";
				break;
			}
			case KING_CODE: {
				price = KING_PRICE;
				message = "King bed";
				break;
			}
			case SUITE_CODE: {
				price = SUITE_PRICE;
				message = "King bed with pullout couch";
				break;
			}
			default: {
				price = 0;
				message = "invalid code";
			}
		}

		System.out.println("You selected " + message + ", price is: $" + price);
	
	}

}
