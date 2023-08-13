/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 9b

Task:
Write a program that declares an array of five Purchase objects and prompt a user for their values. As
each Purchase object is created, continually prompt until the user enters an invoice number between
1000 and 8000 inclusive and a non-negative sale amount. Prompt the user for values for each object and
then display all the values. Save the file as PurchaseArray.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class PurchaseArray
{
	public static void main(String[] args)
	{
		final int LIMIT = 5;
		Purchase[] purchases = new Purchase[LIMIT];
		System.out.println("\nP u r c h a s e    a r r a y\n");
		for(int i = 0; i < LIMIT; i++)
			purchases[i] = enterData();
		System.out.println("\nPurchases details:");
		for(Purchase p : purchases)
			p.display();
	}
	public static Purchase enterData()
	{
		Scanner input = new Scanner(System.in);
		int number;
		double amount;
		System.out.print("Enter invoice number >> ");
		number = input.nextInt();
		while(number < 1000 || number > 8000)
		{
			System.out.print("Invoice # must be betweee 1000 and 8000\nTry again >> ");
			number = input.nextInt();
		}
		System.out.print("Enter amount of sales >> ");
		amount = input.nextDouble();
		while(amount < 0)
		{
			System.out.print("Amount must be positive value\nTry again >> ");
			amount = input.nextDouble();
		}
		Purchase purchase = new Purchase();
		purchase.setInvoiceNo(number);
		purchase.setAmountOfSale(amount);
		return purchase;

	}
}
