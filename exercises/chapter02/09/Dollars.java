/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, exercise 09

Task:
Write a program that allows the user to enter an integer number of dollars and calculates and displays the
conversion into currency denominations—20s, 10s, 5s, and 1s. Save the program as Dollars.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {

		int dollars;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter amount of dollars >> ");
		dollars = input.nextInt();

		System.out.println("$" + dollars + " denominatiions:");
		System.out.println((dollars / 20) + " of 20 dollars denominations");
		System.out.println((dollars % 20 / 10) + " of 10 dollars denominations");
		System.out.println((dollars % 20 % 10 / 5) + " of 5 dollars denominations");
		System.out.println((dollars % 20 % 10 % 5) + " of 1 dollar denominations");

	}

}
