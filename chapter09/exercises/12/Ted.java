/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 12c

Task:
Think of two more objects that use turn(), create classes for them, and then add objects to the
DemoTurners application, renaming it DemoTurners2.java. Save the files, using the names of new
objects that use turn().

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Ted implements Turner
{
	@Override
	public void turn()
	{
		System.out.println("Hi, Ted!");
	}
}
