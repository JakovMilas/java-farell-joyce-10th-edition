/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 9a

Task:
Create an Exception class named GradeException that contains a static public array of valid
grade letters (A, B, C, D, F, and I) that you can use to determine whether a grade is valid.
Save the file as GradeException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class GradeException extends Exception
{
	public static char[] gradeLetters = {'A', 'B', 'C', 'D', 'F', 'I'};
	public GradeException(String message)
	{
		super(message);
	}

}
