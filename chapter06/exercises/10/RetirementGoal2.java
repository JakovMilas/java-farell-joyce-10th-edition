/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 10b

Task:
Modify the RetirementGoal application to display the amount of money the user
will have if the user earns 4 percent interest on the balance every year.
Save the file as RetirementGoal2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class RetirementGoal2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int yearsUntilRetirement;
		double moneyCanSaveAnnually;
		double totalMoneySaved = 0;
		double INTEREST_RATE = 0.04;


		System.out.print("Enter number of years until retirement >> ");
		yearsUntilRetirement = input.nextInt();
		while (yearsUntilRetirement < 1) {
			System.out.print("Number must be higher than 0, try again >> ");
			yearsUntilRetirement = input.nextInt();
		}

		System.out.print("Enter $ saved annually >> ");
		 moneyCanSaveAnnually = input.nextDouble();
		 while (moneyCanSaveAnnually < 1) {
			System.out.print("Amount must be higher than 0, try again >> ");
			moneyCanSaveAnnually = input.nextDouble();
		 }

		 for (int i = 0; i < yearsUntilRetirement; i++) {
			totalMoneySaved += moneyCanSaveAnnually;
			totalMoneySaved += totalMoneySaved * INTEREST_RATE;
		 }

		System.out.printf("\nFor %d years with 4%% interest rate on the " +
			"balance, $%.2f is saved", yearsUntilRetirement, totalMoneySaved);

	}

}
