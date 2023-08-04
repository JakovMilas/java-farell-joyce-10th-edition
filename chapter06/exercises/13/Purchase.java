/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 13

Task:
Create a class named Purchase. Each Purchase contains an
invoice number, amount of sale, and amount of sales tax. Include
set methods for the invoice number and sale amount. Within the
set method for the sale amount, calculate the sales tax as 5 percent
of the sale amount. Also include a display method that displays a
purchase’s details. Save the file as Purchase.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Purchase {

	private int invoiceNumber;
	private double saleAmount;
	private double saleAmountTax;
	private final double TAX = 0.05;

	public void setInvoiceNumber(int number) {
		invoiceNumber = number;
	}
	public void setSaleAmount(double amount) {
		saleAmount = amount;
		saleAmountTax = saleAmount * TAX;
	}

	public void display() {
		System.out.println("\nInvoice #" + invoiceNumber);
		System.out.println("Amount of sales: $" + saleAmount);
		System.out.println("Sales tax: $" + saleAmountTax);
		System.out.println("Total: $" + (saleAmount + saleAmountTax));
	}


}
