/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 11

Task:
Assume that the population of Mexico is 128 million and the population of the 
United States is 323 million. Accept two values from a user: an assumption of 
an annual increase in the population of Mexico and an assumption for an annual
decrease in the U.S. population. Accept both figures as percentages; in other 
words, a 1.5 percent decrease is entered as 0.015. Write an application that
displays the populations of the two countries every year until the population
of Mexico exceeds that of the United States, and display the number of years
it took. Save the file as Population.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Population {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double annualIncreaseMexico;
		double annualDecreaseUsa;
		double mexicoPopulation = 128_000_000;
		double usaPopulation = 323_000_000;
		int count = 0;

		System.out.print("Enter assumption for annual increase in " +
						"the population of Mexico >> ");
		annualIncreaseMexico = input.nextDouble();
		System.out.print("Enter assumption for annual decrease in " +
						" the population of USA >> ");
		annualDecreaseUsa = input.nextDouble();

		while (mexicoPopulation < usaPopulation) {
			mexicoPopulation = mexicoPopulation +
					(mexicoPopulation * annualIncreaseMexico);
			usaPopulation = usaPopulation - 
					(usaPopulation * annualDecreaseUsa);
			count++;
			System.out.println("On year " + count + ", USA population:    "
							+ (int)usaPopulation +
							"\n            Mexico population: "
							+ (int)mexicoPopulation);
		}
	}

}
