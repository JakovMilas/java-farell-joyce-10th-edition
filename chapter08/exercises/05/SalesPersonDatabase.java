/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 5d

Task:
Create an application that allows you to store an array that acts as a database of any number of
Salesperson objects up to 20. While the user decides to continue, offer three options: to add a record
to the database, to delete a record from the database, or to change a record in the database. Then
proceed as follows:
 - If the user selects the add option, issue an error message if the database is full. Otherwise, prompt
   the user for an ID number. If the ID number already exists in the database, issue an error message.
   Otherwise, prompt the user for a sales value and add the new record to the database.
 - If the user selects the delete option, issue an error message if the database is empty. Otherwise, prompt
   the user for an ID number. If the ID number does not exist, issue an error message. Otherwise, do not
   access the record for any future processing.
 - If the user selects the change option, issue an error message if the database is empty. Otherwise,
   prompt the user for an ID number. If the requested record does not exist, issue an error message.
   Otherwise, prompt the user for a new sales value and change the sales value for the record.
 - After each option executes, display the updated database in ascending order by Salesperson ID
   number and prompt the user to select the next action.
Save the application as SalespersonDatabase.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class SalesPersonDatabase
{
	public static void main(String[] args)
	{
		SalesPerson[] persons = new SalesPerson[20];
		String entry;
		int count = 0;
		int id;
		double amount;
		final String EXIT = "q";
		Scanner input = new Scanner(System.in);
		System.out.print("Select option:\na - add record\nd - delete record\n" +
						"c - change record\nq - quit\n >> ");
		entry = input.nextLine();
		while(!entry.startsWith(EXIT))
		{
			if(entry.startsWith("a"))
			{
				if(count < persons.length)
				{
					persons[count] = newSalesPerson();
					count++;
				}
				else
				{
					System.out.println("ERROR >>> Database is full!");
					System.out.print("PRESS ENTER to continue...");
					input.nextLine();
				}
			}
			else
				if(entry.startsWith("c"))
				{
					if(count == 0)
					{
						System.out.println("ERROR >>> Database is empty!");
						System.out.print("PRESS ENTER to continue...");
						input.nextLine();
					}
					else
					{
						System.out.print("Enter salesperson ID to change sales amount >> ");
						id = input.nextInt();
						input.nextLine();
						id = search(persons, id, count);
						if(id < 0)
						{
							System.out.println("ERROR >>> Invalid ID!");
							System.out.print("PRESS ENTER to continue...");
							input.nextLine();
						}
						else
						{
							System.out.print("Enter new sales value >> ");
							amount = input.nextDouble();
							input.nextLine();
							persons[id].setSalesAmount(amount);
						}
					}
			}
			else
				if(entry.startsWith("d"))
				{
					if(count == 0)
					{
						System.out.println("ERROR >>> Database is emtpy!");
						System.out.print("PRESS ENTER to continue...");
						input.nextLine();
					}
					else
					{
						System.out.print("Enter salesperson ID to delete record >> ");
						id = input.nextInt();
						input.nextLine();
						id = search(persons, id, count);
						if(id < 0)
						{
							System.out.println("ERROR >>> Invalid ID!");
							System.out.print("PRESS ENTER to continue...");
							input.nextLine();
						}
						else
						{
							System.out.println("No further processing available!");
							System.out.print("PRESS ENTER to continue...");
							input.nextLine();
						}
					}
			}
			else
				System.out.println("ERROR >>> Wrong input, try again!");
			if(count > 0)
			{
				SalesPersonSort.sort(persons, count, "id");
				display(persons, count);
			}
			
			System.out.print("Select option:\na - add record\nd - delete record\n" +
							"c - change record\nq - quit\n >> ");
			entry = input.nextLine();
		}
		System.out.println("Goodbye, have a nice day!");
	}
	public static SalesPerson newSalesPerson()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter salesperson ID >> ");
		int id = input.nextInt();
		System.out.print("Enter salesperson sales amount >> ");
		double amount = input.nextDouble();
		SalesPerson p = new SalesPerson(id, amount);
		return p;
	}
	public static void display(SalesPerson[] persons, int limit)
	{
		System.out.println("-------------------------------------");
		for(int i = 0; i < limit; i++)
			System.out.println("Salesperson #" + persons[i].getId() +
					", sales amount: $" + persons[i].getSalesAmount());
		System.out.println();
	}
	public static int search(SalesPerson[] persons, int id, int limit)
	{
		int sub;
		boolean isFound = false;
		for(int i = 0; i < limit && !isFound; i++)
			if(persons[i].getId() == id)
			{
				isFound = true;
				return i;
			}
		return -1;
	}
}
