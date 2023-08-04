/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 9

Task:
The Freemont Automobile Factory has set a goal that each worker will
eventually produce 10,000 parts per month. The company has discovered
that the longer a worker has been on the job, the more parts the worker can
produce. Write an application that prompts for the number of parts a worker
currently produces. Then compute and display a worker’s anticipated output
each month for 24 months, assuming the worker’s production increases by 6
percent each month. Also display a message that shows the month number in
which production exceeds 10,000 parts or a message indicating that the
worker will not reach the goal within 24 months.
Save the file as IncreasedProduction.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class IncreasedProduction {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int parts;
		double partsProduced;;
		int monthGoalIsReached = 0;
		boolean isGoalReached = false;
		final int MONTHS = 24;
		final double MONTHLY_INCREASE = 0.06;
		final int PARTS_GOAL = 10_000;

		System.out.print("Enter number of parts currently produced >> ");
		parts = input.nextInt();
		partsProduced = parts;

		for (int i = 1; i <= MONTHS; i++) {
			partsProduced += parts * MONTHLY_INCREASE;
			System.out.println("Month " + i + " production is " +
							(int)partsProduced + " parts");
			if (partsProduced >= PARTS_GOAL && !isGoalReached) {
				isGoalReached = true;
				monthGoalIsReached = i;
			}
		}

		if ((int) partsProduced >= PARTS_GOAL) {
			System.out.println("\nWorker  wil reach goal in "
							+ monthGoalIsReached + " months");
		} else
			System.out.println("\nWorker will not reach goal within " +
							MONTHS + " months");

	}

}
