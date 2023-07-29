/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 5a

Task:
Create a class to hold data about a high school sports team. The Team
class holds data fields for high school name (such as Roosevelt High),
sport (such as Basketball), and team name (such as Dolphins). Include
a constructor that takes parameters for each field, and include get
methods that return the values of the fields. Also include a public
final static String named MOTTO and initialize it to Sportsmanship!.
Save the class as Team.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Team {

	private String highSchoolName;
	private String sport;
	private String teamName;
	public final static String MOTTO = "Sportsmanship!";

	public Team(String school, String sport, String team) {
		highSchoolName = school;
		this.sport = sport;
		teamName = team;
	}

	public String getHighSchoolName() {
		return highSchoolName;
	}
	public String getSport() {
		return sport;
	}
	public String getTeamName() {
		return teamName;
	}

}
