/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 1b

Task:
Create a LoadedDie class that can be used to give a player a slight advantage over the computer.
A LoadedDie never rolls a 1; it rolls only values 2 through 6. Save the file as LoadedDie.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class LoadedDie extends Die
{
	public LoadedDie()
	{
		value = (int)(Math.random() * 5) + 2;
	}
}
