/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 1a

Task:
Create a Die class that you can use to instantiate objects that each hold a value from 1 through 6. The
field that holds the value of the Die should be protected, which will allow a child class to access the
value. Save the file as Die.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class Die
{
	protected int value;

	public Die()
	{
		value = (int)(Math.random() * 6) + 1;
	}
	public int getValue()
	{
		return value;
	}
}
