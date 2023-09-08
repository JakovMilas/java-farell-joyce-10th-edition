/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 2b

Task:
Create two classes?Martian and Jupiterian?that descend from Alien. Supply each with a
constructor that sets the Alien data fields with values you choose. For example, you can decide that a
Martian has four eyes but a Jupiterian has only two. Save the files as Martian.java and Jupiterian. java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Martian extends Alien
{
	public Martian()
	{
		numberOfEyes = 4;
		skinType = "fur";
		skinColor = "red";
		origin = "Mars";
	}
}
