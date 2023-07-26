/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 03

Task:
Create an application named NumbersDemo whose main() method holds two integer variables. Prompt the
user for values for the variables. In turn, pass each value to methods named displayTwiceTheNumber(),
displayNumberPlusFive(), and displayNumberSquared(). Create each method to perform the task
its name implies. Save the application as NumbersDemo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/




import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {

		int number;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an number >> ");
		number = input.nextInt();

		displayTwiceTheNumber(number);
		displayNumberPlusFive(number);
		displayNumberSquared(number);

	}

	public static void displayTwiceTheNumber(int number) {

		System.out.println(number + " times two is " + (number * 2));

	}

	public static void displayNumberPlusFive(int number) {

		System.out.println(number + " plus five is " + (number + 5));

	}

	public static void displayNumberSquared(int number) {

		System.out.println(number + " squared is " + (number * number));

	}

}
