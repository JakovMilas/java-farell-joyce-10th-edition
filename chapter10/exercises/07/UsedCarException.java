/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 7a

Task:
Create a UsedCarException class that extends Exception; its constructor receives a value for
a vehicle identification number (VIN) that is passed to the parent constructor so it can be used in a
getMessage() call. Save the class as UsedCarException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class UsedCarException extends Exception
{
	public UsedCarException(String vin)
	{
		super(vin);
	}
}
