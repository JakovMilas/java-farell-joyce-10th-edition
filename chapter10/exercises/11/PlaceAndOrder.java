/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 11c

Task:
 Create an application that contains prompts for an item number and quantity. Allow for the possibility
of nonnumeric entries as well as out-of-range entries and entries that do not match any of the
currently available item numbers. The program should display an appropriate message stored in the
OrderMessages class if an error has occurred. If no errors exist in the entered data, compute the user?s
total amount due (quantity times price each) and display it. Save the program as PlaceAnOrder.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class PlaceAndOrder
{
	public static void main(String[] args)
	{
		int[] items = 	  {111, 222, 333, 4444};
		double[] prices = {0.89, 1.47, 2.43, 5.99};
		int item, quantity = 0;
		double price = 0;
		int index = -1;
		String entry;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter item number >> ");
		entry = input.nextLine();
		try
		{
			item = Integer.parseInt(entry);
			if(item < 0)
				throw new OrderException(OrderMessages.MESSAGES[1]);
			else
				if(item > 999)
					throw new OrderException(OrderMessages.MESSAGES[2]);
			index = itemIndex(items, item);
			if(index < 0)
				throw new OrderException(OrderMessages.MESSAGES[6]);
			price = prices[index];
		}
		catch(NumberFormatException e)
		{
			System.out.print(OrderMessages.MESSAGES[0]);
		}
		catch(OrderException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.print("Enter quantity >> ");
		try
		{
			entry = input.nextLine();
			quantity = Integer.parseInt(entry);
			if(quantity < 1)
				throw new OrderException(OrderMessages.MESSAGES[4]);
			else
				if(quantity > 12)
					throw new OrderException(OrderMessages.MESSAGES[5]);
		}
		catch(NumberFormatException e)
		{
			System.out.println(OrderMessages.MESSAGES[3]);
		}
		catch(OrderException e)
		{
			System.out.println(e.getMessage());
		}

		if(price > 0)
		{
			System.out.println("Item #" + items[index]);
			System.out.println("Price $" + prices[index]);
			System.out.println("Quantity: " + quantity);
			System.out.printf("Total price: $%.2f", (quantity * price));
		}
	}
	public static int itemIndex(int[] items, int item)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items[i] == item)
				return i;
		}
		return -1;
	}
}
