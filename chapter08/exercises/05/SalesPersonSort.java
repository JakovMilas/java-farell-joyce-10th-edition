/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 5c

Task:
 Create an application that allows a user to enter values for an array of seven Salesperson objects.
Offer the user the choice of displaying the objects in order by either ID number or sales value.
Save the application as SalespersonSort.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class SalesPersonSort
{
	public static void main(String[] args)
	{
		SalesPerson[] persons = new SalesPerson[7];
		String entry = "";
		int count = 0;
		int id;
		double amount;

		while(count < persons.length)
		{
			entry = JOptionPane.showInputDialog(null, "Enter salesperson ID");
			id = Integer.parseInt(entry);
			entry = JOptionPane.showInputDialog(null, "Enter sales amount");
			amount = Double.parseDouble(entry);
			persons[count] = new SalesPerson(id, amount);
			count++;
			
		}
		entry = JOptionPane.showInputDialog(null, "How do you want to sort salespersons:\n" +
				"by id\nby sales");
		sort(persons, count, entry);
		display(persons);
	}

	public static void display(SalesPerson[] persons)
	{
		String salespersonsList = "";
		for(SalesPerson p : persons)
			salespersonsList += "Salesperson #" + p.getId() + ", annuall sales amount: $" +
						p.getSalesAmount() + "\n";
		JOptionPane.showMessageDialog(null, "Salespersons: \n" + salespersonsList);

	}
	
	public static void sort(SalesPerson[] persons, int count, String by)
	{
		int comparisonsToMake = count - 1;
		for(int x = 0; x < count - 1; x++)
		{
			for(int y = 0; y < comparisonsToMake; y++)
			{
				if(by.equals("id"))
				{
					if(persons[y].getId() > persons[y + 1].getId())
					{
						SalesPerson temp = persons[y];
						persons[y] = persons[y + 1];
						persons[y + 1] = temp;
					}
				}
				else
				{
					if(persons[y].getSalesAmount() > persons[y + 1].getSalesAmount())
					{
						SalesPerson temp = persons[y];
						persons[y] = persons[y + 1];
						persons[y + 1] = temp;

					}
				}
			}
			comparisonsToMake--;
		}
	}
}
