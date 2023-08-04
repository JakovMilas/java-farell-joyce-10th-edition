/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 13

Task:
Next, create an application that declares a Purchase object and prompts
the user for purchase details. When you prompt for an invoice number,
do not let the user proceed until a number between 1,000 and 8,000 inclusive
has been entered. When you prompt for a sale amount, do not proceed until the
user has entered a nonnegative value. After a valid Purchase object has been
created, display the object’s invoice number, sale amount, and sales tax.
Save the file as CreatePurchase.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class CreatePurchase {

	public static void main(String[] args) {

		Purchase purchase = getPurchaseData();
		purchase.display();
		
	}

	public static Purchase getPurchaseData() {
		Scanner input = new Scanner(System.in);
		int number;
		double amount;
		System.out.print("Enter invoice number >> ");
		number = input.nextInt();
		System.out.print("Enter amount of sales >> ");
		amount = input.nextDouble();
		Purchase p = new Purchase();
		p.setInvoiceNumber(number);
		p.setSaleAmount(amount);
		return p;
	}

}
