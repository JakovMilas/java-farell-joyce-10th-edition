/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 4b

Task:
Create three subclasses: Couplet, Limerick, and Haiku. The constructor for each subclass requires
only a title; the lines field is set using a constant value. A couplet has two lines, a limerick
has five lines, and a haiku has three lines.
Save the files as Couplet.java, Limerick.java, and Haiku.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Limerick extends Poem
{
	public Limerick(String name)
	{
		super(name, 5);
	}
}
