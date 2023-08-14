/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 16

Task:
Create a program with an enumeration that contains the names of the eight planets in our solar system. Prompt
the user for a planet name and use the ordinal() method to display the planet?s position.
Save the file as Planets.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Planets
{
	enum Planet {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE};
	
	public static void main(String[] args)
	{
		String entry;
		Planet planet;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter planet name to see its position >> ");
		entry = input.nextLine().toUpperCase();
		planet = Planet.valueOf(entry);
		for(Planet p : Planet.values())
		{
			if(p.equals(planet))
				System.out.println(planet + " position is " + (planet.ordinal() + 1));
		}
	}


}
