/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 1c

Task:
Write an application that prompts the user for appropriate field values and demonstrates using objects of
each class, Horse and RaceHorse. Save the file as DemoHorses.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class DemoHorses
{
	public static void main(String[] args)
	{
		Horse horse = new Horse();
		RaceHorse raceHorse = new RaceHorse();

		horse.setName("Zelenko");
		horse.setColor("Dark green");
		horse.setBirthYear(2019);

		raceHorse.setName("Sharac");
		raceHorse.setColor("Black and white");
		raceHorse.setBirthYear(2020);
		raceHorse.setNumberOfRaces(38);

		System.out.println("\nHorse:\nName: " + horse.getName() + "\nColor: " +
				horse.getColor() + "\nBirth year: " + horse.getBirthYear());
		System.out.println("\nRace horse:" + "\nName: " + raceHorse.getName() +
				"\nColor: " + raceHorse.getColor() + "\nBirth year: " +
				raceHorse.getBirthYear() + "\nNumber of races: " +
				raceHorse.getNumberOfRaces());
	}
}
