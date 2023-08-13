/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 10b

Task:
When a series of random numbers is generated, it is quite common for the same number to be selected
consecutively multiple times. Although duplicates happen in randomized lists, humans tend to see
such repetition as ?unfair.? Modify the DrugTests2 class so that if an employee number is selected
immediately after it was already selected, a new number is selected for the week. Also display a message
explaining that a new number is being selected. Save the file as DrugTests3.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Random;

public class DrugTest3
{
	public static void main(String[] args)
	{
		Random random = new Random();
		final int NUM_WEEKS = 52;
		final int NUM_EMPS = 30;
		int[] weeks = new int[NUM_WEEKS];
		System.out.println("\nPickering Trucking Company: DRUG TEST\n");
		for(int i = 0; i < NUM_WEEKS; i++) {
			weeks[i] = random.nextInt(NUM_EMPS) + 1;
			if(i > 0 && weeks[i] == weeks[i - 1]) {
				weeks[i] = random.nextInt(NUM_EMPS) + 1;
				System.out.println("On week " + (i + 1) + " employee was reselected");
			}
		}
		for(int i = 0; i < NUM_WEEKS; i++)
		{
			System.out.print(weeks[i] + " ");
			if((i + 1) % 4 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
