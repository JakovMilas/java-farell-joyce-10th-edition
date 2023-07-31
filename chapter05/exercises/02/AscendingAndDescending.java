/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 2

Task:
Write an application that asks a user to enter three integers. Display them
in ascending and descending order. Save the file as AscendingAndDescending.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int firstNumber, secondNumber, thirdNumber;
		int lowest = 0, middle = 0, highest = 0;

		System.out.print("Enter first number >> ");
		firstNumber = input.nextInt();
		System.out.print("Enter second number >> ");
		secondNumber = input.nextInt();
		System.out.print("Enter third number >> ");
		thirdNumber = input.nextInt();

		if (firstNumber < secondNumber && firstNumber < thirdNumber) {
			lowest = firstNumber;
			if (secondNumber < thirdNumber) {
				middle = secondNumber;
				highest = thirdNumber;
			} else {
				middle = thirdNumber;
				highest = secondNumber;
			}
		} else
			if (secondNumber < firstNumber && secondNumber < thirdNumber) {
				lowest = secondNumber;
				if (firstNumber < thirdNumber) {
					middle = firstNumber;
					highest = thirdNumber;
				} else {
					middle = thirdNumber;
					highest = firstNumber;
			}
		} else
			if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
				lowest = thirdNumber;
				if (firstNumber < secondNumber) {
					middle = firstNumber;
					highest = secondNumber;
				} else {
					middle = secondNumber;
					highest = firstNumber;
			}
		}

		System.out.println(lowest + "   " + middle + "   " + highest);
		System.out.println(highest + "   " + middle + "   " + lowest);

	}

}
