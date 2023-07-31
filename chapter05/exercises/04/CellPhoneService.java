/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 4

Task:
Write a program for Horizon Phones, a provider of cellular phone service.
Prompt a user for maximum monthly values for talk minutes needed, text
messages needed, and gigabytes of data needed, and then display a
recommendation for the best plan for the customer’s needs. A customer who
needs fewer than 500 minutes of talk and no text or data should buy Plan A
at $49 per month. A customer who needs fewer than 500 minutes of talk and
any text messages should buy Plan B at $55 per month. A customer who needs
500 or more minutes of talk and no data should buy either Plan C for up to
100 text messages at $61 per month or Plan D for 100 text messages or more
at $70 per month. A customer who needs any data should buy Plan E for up to
3 gigabytes at $79 per monthor Plan F for 3 gigabytes or more at $87 per month.
Save the file as CellPhoneService.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int minutesNeeded;
		int smsNeeded;
		double gbNeeded;
		System.out.print("Enter maximum minuts for your plan >> ");
		minutesNeeded = input.nextInt();
		System.out.print("Enter SMS needed >> ");
		smsNeeded = input.nextInt();
		System.out.print("Enter GBs needed >> ");
		gbNeeded = input.nextInt();

		resolvePlan(minutesNeeded, smsNeeded, gbNeeded);

	}

	public static void resolvePlan(int min, int sms, double gb) {
		char plan = ' ';
		double price = 0;

		if (gb != 0) {

			if (gb < 3) {
				plan = 'E';
				price = 79.0;
			} else {
				plan = 'F';
				price = 87.0;
			}

		} else {

			if (min < 500) {
				if (sms == 0) {
					plan = 'A';
					price = 49.0;
				} else {
					plan = 'B';
					price = 55.0;
				}

			} else {
				if (sms < 100) {
					plan = 'C';
					price = 61.0;
				} else {
					plan = 'D';
					price = 70.0;
				}
			}
		}

	System.out.println("Best plan for you is plan " + plan +
					", price $" + price);

	}

}
