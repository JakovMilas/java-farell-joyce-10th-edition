/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 8a

Task:
Create a ScoreException class that extends Exception and whose constructor accepts a String
parameter and passes it to the Exception class constructor. Save the file as ScoreException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class ScoreException extends Exception
{
	public ScoreException(String message)
	{
		super(message);
	}
}
