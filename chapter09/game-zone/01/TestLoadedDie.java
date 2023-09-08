/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Game Zone 1c

Task:
Create a program that rolls two Die objects against each other 1,000 times and counts the number of
times the first Die has a higher value than the other Die. Then roll a Die object against a LoadedDie
object 1,000 times, and count the number of times the Die wins. Display the results. Save the application
as TestLoadedDie.java. 

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class TestLoadedDie
{
	public static void main(String[] args)
	{
		Die computer;
		Die player;
		int computerCount = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			computer = new Die();
			player = new Die();
			if(computer.getValue() > player.getValue())
				computerCount++;
		}
		System.out.println("\nWith two regular dice, the computer won " + computerCount +
				" times out of 1000");
		computerCount = 0;
		for(int i = 0; i < 1000; i++)
		{
			computer = new Die();
			player = new LoadedDie();
			if(computer.getValue() > player.getValue())
				computerCount++;
		}
		System.out.println("With one die and one loaded die for player, the computer won " +
				computerCount + " times out of 1000 times");
	}
}
