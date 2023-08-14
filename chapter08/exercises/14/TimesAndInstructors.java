/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 14

Task:
Write an application that stores at least five different college courses (such as CIS101), the time it first meets
in the week (such as Mon 9 am), and the instructor (such as Khan) in a two-dimensional array. Allow the
user to enter a course name and display the corresponding time and instructor. If the course exists twice,
display details for both sessions. If the course does not exist, display an error message.
Save the file as TimesAndInstructors.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class TimesAndInstructors
{
	public static void main(String[] args)
	{
		String[][] courses = {
				      {"CIS101", "Mon 9 am", "Khan"},
				      {"CIS102", "Tue 10 am", "Smith"},
				      {"CIS103", "Fri 9:30 am", "Marco"},
				      {"CIS104", "Thu 8 am", "Johnson"},
				      {"CIS105", "Wed 11 am", "Cruise"}
				     };
		String entry;
		boolean isCourseFound = false;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter course to see details >> ");
		entry = input.nextLine();

		for(String[] course : courses)
		{
			if(course[0].equalsIgnoreCase(entry))
			{
				System.out.println(course[0] + ", " + course[1] + ", " + course[2]);
				isCourseFound = true;
			}
		}
		if(!isCourseFound)
			System.out.println("Course not found!");
	}
}
