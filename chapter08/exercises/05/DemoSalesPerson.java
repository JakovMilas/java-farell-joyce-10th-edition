/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 5a

Task:
Write an application named DemoSalesperson that declares an array of 10 Salesperson objects
named salesPeople. Set each ID number to 9999 and each sales value to zero.
Display the 10 Salesperson objects. Save the file as DemoSalesPerson.java

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class DemoSalesPerson
{
	public static void main(String[] args)
	{
		final int LIMIT = 10;
		SalesPerson[] persons = new SalesPerson[LIMIT];

		for(int i = 0; i < LIMIT; i++)
		{
			persons[i] = new SalesPerson(9999, 0);
		}

		for(int i = 0; i < LIMIT; i++)
			System.out.println("Salesperson #" + persons[i].getId() +
					", annual sales amount: $" + persons[i].getSalesAmount());
	}
}

