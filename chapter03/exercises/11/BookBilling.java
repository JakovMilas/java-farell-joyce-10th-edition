/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 11

Task:
Create a class named BookBilling that includes three overloaded computeBill() methods
for the Happy Memories Company, which sells photo books.
❯❯ When computeBill() receives no parameters, the method computes the price of one photo book at
   $14.99, adds 8 percent tax, and returns the total due.
❯❯ When computeBill() receives one parameter, it represents the quantity ordered. Multiply
   the value by $14.99, add 8 percent tax, and return the total due.
❯❯ When computeBill() receives two parameters, they represent the quantity ordered and a
   coupon value. Multiply the quantity by $14.99, reduce the result by the coupon value, add
   8 percent tax, and then return the total due.
Write a main() method that prompts the user for the number of books ordered, prompts for a
coupon value, and tests all three overloaded methods. Save the application as BookBilling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class BookBilling {

	public static void main(String[] args) {

		int quantity;
		double couponValue;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of books ordered >> ");
		quantity = input.nextInt();
		System.out.print("Enter coupon value in $ >> ");
		couponValue = input.nextDouble();

		System.out.println("\nTotal due for one book is " + computeBill());
		System.out.println("Total due for " + quantity + " books is " + computeBill(quantity));
		System.out.println("Total due for " + quantity + " books with coupon value of $" +
						   couponValue + " is $" + computeBill(quantity, couponValue));

	}

	public static double computeBill() {
		double due = 14.99 + (14.99 * 0.08);
		return due;
	}

	public static double computeBill(int quantity) {
		double due = (14.99 * quantity) + ((14.99 * quantity) * 0.08);
		return due;
	}

	public static double computeBill(int quantity, double couponValue) {
		double amount = ((14.99 * quantity) - couponValue);
		double due = amount + (amount * 0.08);
		return due;
	}

}
