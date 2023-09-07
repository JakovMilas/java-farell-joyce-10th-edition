/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 8d

Task:
Write an application named BookArray in which you create an array that holds 10 Books, some
Fiction and some NonFiction. Using a for loop, prompt the user for a title and whether the Book is
fiction or nonfiction (F or N ). Create the appropriate book type and store it in the array. If the user does
not select F or N, reprompt the user. In another for loop, display details about all 10 Books. Save the file
as BookArray.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;

public class BookArray
{
	public static void main(String[] args)
	{
		Book[] books = new Book[10];
		String title;
		String choice;
		int count = 0;
		Scanner input = new Scanner(System.in);

		while(count < books.length)
		{
			System.out.print("Enter book title >> ");
			title = input.nextLine();
			System.out.print("Is this book fiction or nonfiction? (F / N) >> ");
			choice = input.nextLine().toUpperCase();
			while (choice.charAt(0) != 'F' && choice.charAt(0) != 'N')
			{
				System.out.print("Try again, fiction of nonfiction (F / N) >> ");
				choice = input.nextLine().toUpperCase();
			}
			if(choice.charAt(0) == 'F')
				books[count] = new Fiction(title);
			else
				books[count] = new NonFiction(title);
			count++;
		}

		for(Book b : books)
		{
			System.out.println("\nBook title: " + b.getTitle());
			System.out.println("Price: $" + b.getPrice());
		}

	}
}
