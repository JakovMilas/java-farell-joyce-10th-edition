/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 8c

Task:
 Write an application demonstrating that you can create both a Fiction and NonFiction Book,
prompt the user for values, and display their fields. Save the file as UseBook.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class UseBook
{
	public static void main(String[] args)
	{
		Book fictionBook = new Fiction("Blade runner");
		Book nonFictionBook = new NonFiction("Gone with the wind");
		display(fictionBook);
		display(nonFictionBook);
	}

	public static void display(Book book)
	{
		System.out.println("\nBook title: " + book.getTitle());
		System.out.println("Price: $" + book.getPrice());
		System.out.println();
	}
}
