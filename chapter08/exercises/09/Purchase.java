/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 9a

Task:
Create a class named Purchase. Each Purchase contains an invoice number, amount of sale, and
amount of sales tax. Include set methods for the invoice number and sale amount. Within the set method
for the sale amount, calculate the sales tax as 5 percent of the sale amount. Also include a display
method that displays a purchase?s details. Save the file as Purchase.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class Purchase
{
	private int invoiceNo;
	private double amountOfSale;
	private double amountOfTax;

	public void setInvoiceNo(int no)
	{
		invoiceNo = no;
	}
	public void setAmountOfSale(double amount)
	{
		amountOfSale = amount;
		amountOfTax = amount * 0.05;
	}
	public void display()
	{
		System.out.println("\nInvoice number: #" + invoiceNo);
		System.out.println("Amount of sale: $" + amountOfSale);
		System.out.println("Sales tax:      $" + amountOfTax);
		System.out.println("Total:          $" + (amountOfSale + amountOfTax));
	}
}

