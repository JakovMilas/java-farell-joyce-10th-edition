/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 1b

Task:
Create a subclass of Horse named RaceHorse, which contains an additional field that holds the
number of races in which the Horse has competed and additional methods to get and set the new field.
Save the file as RaceHorse.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class RaceHorse extends Horse
{
	int numberOfRaces;

	public void setNumberOfRaces(int races)
	{
		numberOfRaces = races;
	}
	public int getNumberOfRaces()
	{
		return numberOfRaces;
	}
}
