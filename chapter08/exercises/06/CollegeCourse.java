/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 6a

Task:
Create a CollegeCourse class. The class contains fields for the course ID (for example, CIS 210 ), credit
hours (for example, 3), and a letter grade (for example, A). Include get and set methods for each field.
Save the file as CollegeCourse.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class CollegeCourse
{
	private String courseId;
	private int creditHours;
	private char letterGrade;

	public String getId()
	{
		return courseId;
	}
	public void setId(String id)
	{
		courseId = id;
	}
	public int getCreditHours()
	{
		return creditHours;
	}
	public void setCreditHours(int hours)
	{
		creditHours = hours;
	}
	public char getLetterGrade()
	{
		return letterGrade;
	}
	public void setLetterGrade(char grade)
	{
		letterGrade = grade;
	}
}
