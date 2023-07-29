/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 5b

Task:
Write an application named TestTeam whose main() method declares three
Team objects. For each Team object, call a method named setTeamData()
that declares a temporary Team object, prompts the user for values for
the fields, and returns the temporary object to one of the Teams in the
main() method. Display all the data, including the motto, for each Team
object. Save the file as TestTeam.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TestTeam {

	public static void main(String[] args) {
	
		Team team1 = setTeamData();
		Team team2 = setTeamData();
		Team team3 = setTeamData();

		display(team1);
		display(team2);
		display(team3);
	
	}

	public static Team setTeamData() {
		Scanner input = new Scanner(System.in);
		String school, sport, teamName;
		System.out.print("Enter High School Name >> ");
		school = input.nextLine();
		System.out.print("Enter sport >> ");
		sport = input.nextLine();
		System.out.print("Enter team name >> ");
		teamName = input.nextLine();
		Team team = new Team(school, sport, teamName);
		return team;
	}

	public static void display(Team team) {
		System.out.println("\nHigh school name: " + team.getHighSchoolName());
		System.out.println("Sport: " + team.getSport());
		System.out.println("Team name: " + team.getTeamName());
		System.out.println(team.MOTTO);
	}

}
