/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 04

Task:
Create an application named Percentages whose main() method holds two double variables, and prompt
the user for values. Pass both variables to a method named computePercent() that displays the two values
and the value of the first number as a percentage of the second one. For example, if the numbers are 2.0 and 5.0,
the method should display a statement similar to 2.0 is 40 percent of 5.0. Then call the method a second time,
passing the values in reverse order. Save the application as Percentages.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {

		double number1;
		double number2;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first double value >> ");
		number1 = input.nextDouble();

		System.out.print("Enter second double value >> ");
		number2 = input.nextDouble();

		computePercent(number1, number2);
		computePercent(number2, number1);

	}

	public static void computePercent(double firstNumber, double secondNumber) {

		double percentage = (firstNumber / secondNumber) * 100;
		System.out.println(firstNumber + " is " + percentage + "% of a secondNumber");

	}

}
