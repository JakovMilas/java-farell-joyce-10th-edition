/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 09

Task:
The Renew Your Home Company estimates each job cost as the cost of materials plus $35
per hour while onthe job, plus $12 per hour for travel time to the job site.
Create a class that contains a main() method that prompts the user for the name of a
job (for example, Patel bathroom remodel), the cost of materials, the number of hours
of work required, and the number of hours of travel time. Pass the numeric data to a method
that computes an estimate for the job and returns the computed value to the main() method,
where the job name and estimated price are displayed. Save the program as JobPricing.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class JobPricing {

	public static void main(String[] args) {

		final double COST_WORKING_PER_HOUR = 35.0;
		final double COST_TRAVELING_PER_HOUR = 12;
		String jobName;
		int workHours;
		int travelHours;
		double materialsCost;
		double estimatedPrice;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter job name >> ");
		jobName = input.nextLine();
		System.out.print("Enter estimated working hours >> ");
		workHours = input.nextInt();
		System.out.print("Enter estimated traveling hours >> ");
		travelHours = input.nextInt();
		System.out.print("Enter estimated cost of materials >> ");
		materialsCost = input.nextDouble();

		estimatedPrice = calculatePrice(workHours, travelHours, materialsCost);

		System.out.println("\nJob name:        " + jobName);
		System.out.println("Estimated price: $" + estimatedPrice);

	}

	public static double calculatePrice(int workingHours, int travelHours, double materialsCost) {

		double price = (workingHours * 35.0) + (travelHours * 12.0) + materialsCost;
		return price;

	}

}
