/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 2a

Task:
Create a Die class whose constructor sets a value from 1 to 6. Include a method to return the value.
Save the file as Die.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Random;

public class Die
{
	private int value;
	private Random random = new Random();

	public Die()
	{
		value = random.nextInt(6) + 1;
	}
	public int getValue()
	{
		return value;
	}
}
