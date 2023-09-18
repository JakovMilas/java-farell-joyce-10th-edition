/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 6b

Task:
Create a Course class with the same fields as those included in the CourseException class and
whose constructor requires values for each field. Upon construction, throw a CourseException
if the department does not consist of three letters, if the course number does not consist of
three digits between 100 and 499 inclusive, or if the credits are less than 0.5 or more than 6. Each
CourseException object should include an appropriate message that explains the reason the
construction failed. Include a toString() method that returns a String that consists of an object?s
department, course number, and credits. Save the class as Course.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Course
{
	String department;
	int courseNumber;
	double credit;

	public Course(String department, int courseNumber, double credit) throws CourseException
	{
		if(!(department.length() == 3))
			throw new CourseException(department, courseNumber, credit,
					" - Department must consist of three letters");
		else
			this.department = department;
		if(courseNumber < 100 || courseNumber > 499)
			throw new CourseException(department, courseNumber, credit,
					" - Course number must be between 100 and 499 inclusive");
		else
			this.courseNumber = courseNumber;
		if(credit < 0.5 || credit > 6)
			throw new CourseException(department, courseNumber, credit,
					" - Credits must be between 0.5 and 6 inclusive");
		else
			this.credit = credit;
	}
	public Course()
	{
		department = "ZZZ";
		courseNumber = 999;
		credit = 0;
	}
	public String toString()
	{
		return (department + " " + courseNumber + ", credit hours: " + credit);
	}
}
