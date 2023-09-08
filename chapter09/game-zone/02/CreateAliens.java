/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 2c

Task:
Create an application that instantiates one Martian and one Jupiterian. Call the toString()
method with each object and display the results. Save the application as CreateAliens.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class CreateAliens
{
	public static void main(String[] args)
	{
		Alien alien1 = new Martian();
		Alien alien2 = new Jupiterian();
		System.out.println(alien1.toString());
		System.out.println(alien2.toString());
	}
}
