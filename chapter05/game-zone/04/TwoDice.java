/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 4

Task:
Write an application that randomly “throws” two dice and displays
their values. Determine whether the two dice are the same, the
first has a higher value, or the second has a higher value.
Save the application as TwoDice2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class TwoDice {

	public static void main(String[] args) {

		Die die1 = new Die();
		Die die2 = new Die();

		System.out.println("\n" + die1.getValue() + " " + die2.getValue());
		
		if (die1.getValue() > die2.getValue())
			System.out.println("First die has higher value.");
		else
			if (die1.getValue() < die2.getValue())
				System.out.println("Second die has higher value.");
			else
				System.out.println("Dice has same value.");

	}

}
