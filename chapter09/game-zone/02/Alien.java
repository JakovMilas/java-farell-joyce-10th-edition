/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 2a

Task:
Create an abstract Alien class. Include at least three protected data members of your choice, such as
the number of eyes the Alien has. Include a constructor that requires a value for each data field and a
toString() method that returns a String containing a complete description of the Alien. Save the
file as Alien.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public abstract class Alien
{
	protected int numberOfEyes;
	protected String skinType;
	protected String skinColor;
	protected String origin;

	public String toString()
	{
		return "\nAlien details:\nNumber of eyes: " + numberOfEyes +
			"\nSkin type: " + skinType + "\nSkin color: " + skinColor +
			"\nOrigin: " + origin;
	}
}
