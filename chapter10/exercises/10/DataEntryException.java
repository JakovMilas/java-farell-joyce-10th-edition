/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 10a

Task:
Create a DataEntryException class whose getMessage() method returns information about
invalid integer data. Save the file as DataEntryException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class DataEntryException extends Exception
{
	public DataEntryException(String message)
	{
		super(message);
	}
}
