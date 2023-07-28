/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 08

Task:
The Harrison Group Life Insurance company computes annual policy premiums based on the
age the customer turns in the current calendar year. The premium is computed by taking
the decade of the customer’s age, adding 15 to it, and multiplying by 20. For example,
a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15 and
then multiplying by 20. Write an application that prompts a user for the current year
and a birth year. Pass both to a method that calculates and returns the premium amount,
and then display the returned amount. Save the application as Insurance.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {

		int birthYear;
		int currentYear;
		double premiumAmount;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your birth year >> ");
		birthYear = input.nextInt();
		System.out.print("Enter current year >> ");
		currentYear = input.nextInt();

		premiumAmount = calculatePremiumAmount(birthYear, currentYear);

		System.out.println("Premium amount is " + premiumAmount);

	}

	public static double calculatePremiumAmount(int birthYear, int currentYear) {

		double amount = (((currentYear - birthYear) / 10) + 15) * 20.0;
		return amount;

	}

}
