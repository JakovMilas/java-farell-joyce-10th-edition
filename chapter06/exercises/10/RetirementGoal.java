/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 10a

Task:
Write an application that prompts a user for the number of years the user
has until retirement and the amount of money the user can save annually.
If the user enters 0 or a negative number for either value, reprompt the
user until valid entries are made. Assume that no interest is earned on the
money. Display the amount of money the user will have at retirement.
Save the file as RetirementGoal.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class RetirementGoal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int yearsUntilRetirement;
		double moneyCanSaveAnnually;


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

		System.out.println("\nAt retirement $" +
			(moneyCanSaveAnnually * yearsUntilRetirement) + 
			" is saved");

	}

}
