/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 1a

Task:
Write an application that includes final constants named START and STOP
that are set to 5 and 500, respectively. The application counts by five
from 5 through 500 inclusive, and it starts a new line after every
multiple of 50 (50, 100, 150, and so on). Save the file as CountByFives.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class CountByFive {

	public static void main(String[] args) {

		final int START = 5;
		final int STOP = 500;

		for (int x = START; x <= STOP; x += 5) {
			System.out.print(x + " ");
			if (x % 50 == 0)
				System.out.println();
		}

	}

}
