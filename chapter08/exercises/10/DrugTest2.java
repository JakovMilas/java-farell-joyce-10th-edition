/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 10a

Task:
 Each week, the Pickering Trucking Company randomly selects one of its 30 employees to take a drug test.
Write an application that determines which employee will be selected each week for the next 52 weeks.
Use the Math.random() function explained in Appendix D to generate an employee number between 1
and 30; you use a statement similar to:
testedEmployee = 1 + (int)(Math.random() * 30);
After each selection, display the number of the employee to test. Display four employee numbers on
each line. It is important to note that if testing is random, some employees will be tested multiple times,
and others might never be tested. Include a count and display of the number of times each employee is
selected. Also display a list of employee numbers that never were selected for testing. Save the program
as DrugTests2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Random;

public class DrugTest2
{
	public static void main(String[] args)
	{
		Random random = new Random();
		final int NUM_WEEKS = 52;
		final int NUM_EMPS = 30;
		int[] weeks = new int[NUM_WEEKS];
		System.out.println("\nPickering Trucking Company: DRUG TEST\n");
		for(int i = 0; i < NUM_WEEKS; i++)
			weeks[i] = random.nextInt(NUM_EMPS) + 1;
		for(int i = 0; i < NUM_WEEKS; i++)
		{
			System.out.print(weeks[i] + " ");
			if((i + 1) % 4 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
