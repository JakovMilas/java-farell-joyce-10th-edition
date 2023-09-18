/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 11b

Task:
Create an OrderException class that accepts one of the messages as its parameter.
Save the file as OrderException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class OrderException extends Exception
{
	public OrderException(String message)
	{
		super(message);
	}
}
