/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 5c

Task:
Create a class named Game. Include two Team fields that hold data about
the teams participating in the game. Also include a field for game time 
(for example, 7 PM). Include a constructor that takes parameters
for two Team objects and a time. Save the file as Game.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.time.*;

public class Game {

	private Team team1;
	private Team team2;
	private LocalTime time;

	public Game(Team team1, Team team2, LocalTime time) {
		this.team1 = team1;
		this.team2 = team2;
		this.time = time;
	}

	public Team getTeam1() {
		return team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public LocalTime getTime() {
		return time;
	}


}
