/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 4a

Task:
Create a class named Poem that contains fields for the name of the Poem and the number of lines in
it. Include a constructor that requires values for both fields. Also include get methods to
retrieve field values. Save the file as Poem.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Poem
{
	private String name;
	private int numberOfLines;

	public Poem(String name, int numLines)
	{
		this.name = name;
		numberOfLines = numLines;
	}
	public String getName()
	{
		return name;
	}
	public int getNumberOfLines()
	{
		return numberOfLines;
	}
}
