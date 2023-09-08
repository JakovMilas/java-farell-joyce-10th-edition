/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 12b

Task:
Create a class named Leaf that implements turn() to display Changing colors. Create a class
named Page that implements turn() to display Going to the next page. Create a class named
Pancake that implements turn() to display Flipping. Save the files as Leaf.java, Page.java, and
Pancake.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Page implements Turner
{
	@Override
	public void turn()
	{
		System.out.println("Going to the next page.");
	}
}
