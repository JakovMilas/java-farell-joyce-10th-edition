/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 1b

Task:
Modify the CountByFives application so that the user enters the value
to count by. Start each new line after 10 values have been displayed.
Save the file as CountByAnything.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class CountByAnything {

	public static void main(String[] args) {

		final int START = 5;
		final int STOP = 500;
		int y;
		int count = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter value to count by >> ");
		y = input.nextInt();

		for (int x = START; x <= STOP; x += y) {
			System.out.print(x + " ");
			count++;
			if (count % 10 == 0)
				System.out.println();
		}

	}

}
