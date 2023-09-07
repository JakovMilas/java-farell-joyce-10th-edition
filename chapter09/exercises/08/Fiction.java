/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 8b

Task:
Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice()
method that sets the price for all Fiction Books to $24.99 and for all NonFiction Books to $37.99.
Write a constructor for each subclass, and include a call to setPrice() within each. Save the files as
Fiction.java and NonFiction.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Fiction extends Book
{
	public Fiction(String title)
	{
		super(title);
		setPrice();
	}
	@Override
	public void setPrice()
	{
		price =  24.99;	
	}
}
