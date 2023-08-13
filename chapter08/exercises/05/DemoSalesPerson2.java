/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 5b

Task:
Modify the DemoSalesperson application so each Salesperson has a successive ID number from
111 through 120 and a sales value that ranges from $25,000 to $70,000, increasing by $5,000 for each
successive Salesperson. Save the file as DemoSalesperson2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class DemoSalesPerson2
{
	public static void main(String[] args)
	{
		final int LIMIT = 10;
		int startingId = 111;
		double startingAmount = 25_000.0;
		double salesIncrease = 5000.0;
		SalesPerson[] persons = new SalesPerson[LIMIT];

		for(int i = 0; i < LIMIT; i++)
		{
			persons[i] = new SalesPerson(startingId, startingAmount);
			startingId++;
			startingAmount += salesIncrease;
		}

		for(int i = 0; i < LIMIT; i++)
			System.out.println("Salesperson #" + persons[i].getId() +
					", annual sales amount: $" + persons[i].getSalesAmount());
	}
}

