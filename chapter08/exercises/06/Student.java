/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 6b

Task:
Create a Student class containing an ID number and an array of five CollegeCourse objects. Create
a get and set method for the Student ID number. Also create a get method that returns one of the
Student?s CollegeCourses; the method takes an integer argument and returns the CollegeCourse
in that position (0 through 4). Next, create a set method that sets the value of one of the Student?s
CollegeCourse objects; the method takes two arguments?a CollegeCourse and an integer
representing the CollegeCourse?s position (0 through 4). Save the file as Student.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Student
{
	private String studentId;
	private CollegeCourse[] courses = new CollegeCourse[5];

	public String getId()
	{
		return studentId;
	}
	public void setId(String id)
	{
		studentId = id;
	}

	public CollegeCourse getCollegeCourse(int id)
	{
		return courses[id];
	}
	public void setCollegeCourse(CollegeCourse course, int id)
	{
		courses[id] = course;
	}
}
