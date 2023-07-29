/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 5d

Task:
Write an application named TestGame to instantiate a Game object, prompt the
user for the Game details, and then pass the Game to a method that displays
the details about the Game. (Note that in this program, depending on what the
user enters, the two teams are not necessarily playing the same sport!
You will be able to fix this logical flaw after you learn about decision
making.) Save the file as TestGame.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.time.*;

public class TestGame {

	public static void main(String[] args) {
		
		int hours;
		LocalTime time;
		Game game;
		Scanner input = new Scanner(System.in);
		Team team1 = TestTeam.setTeamData();
		Team team2 = TestTeam.setTeamData();

		System.out.print("Enter game time >> ");
		hours = input.nextInt();
		time = LocalTime.of(hours,0);

		game = new Game(team1, team2, time);

		display(game);

	}

	public static void display(Game game) {
		System.out.println("\nG A M E   D E T A I L S");
		TestTeam.display(game.getTeam1());
		System.out.println("\n           VS          ");
		TestTeam.display(game.getTeam2());
		System.out.println("\nGame starts at " + game.getTime());
	}

}
