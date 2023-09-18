/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 6a

Task:
Create a CourseException class that extends the Java Exception class and whose constructor
receives a String that holds a college course?s department (for example, CIS), a course number (for
example, 101), and a number of credits (for example, 3). Save the file as CourseException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class CourseException extends Exception
{
	String department;
	int courseNumber;
	double credit;
	public CourseException(String department, int courseNumber, double credit, String message)
	{
		super("Invalid course: " + department + " " + courseNumber + ", credits " + credit + message);
		this.department = department;
		this.courseNumber = courseNumber;
		this.credit = credit;
	}
}
