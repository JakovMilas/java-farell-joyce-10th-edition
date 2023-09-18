/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 9b

Task:
Write an application that displays a series of at least eight student ID numbers that you have stored
in an array and asks the user to enter a letter grade for the student. Throw a GradeException if
the user does not enter a valid letter grade as defined in the GradeException class. Catch the
GradeException, and then display an appropriate message. In addition, store an I (for Incomplete) for
any student for whom an Exception is caught. At the end of the application, display all the student IDs
and grades. Save the file as TestGrade.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class TestGrade
{
	public static void main(String[] args)
	{
		int[] students = {101, 102, 103, 104, 105, 106, 107, 108};
		char[] studentGrades = new char[students.length];
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < students.length; i++)
		{
			try
			{
				System.out.print("Enter grade for student #" + students[i] + " >> ");
				studentGrades[i] = input.nextLine().toUpperCase().charAt(0);
				if(!isValid(studentGrades[i]))
					throw (new GradeException("Not a valid grade, set to (I)ncomplete"));
			}
			catch(GradeException e)
			{
				System.out.println(e.getMessage());
				studentGrades[i] = GradeException.gradeLetters[5];
			}
		}
		for(int i = 0; i < students.length; i++)
			System.out.println("Student ID " + students[i] + " grade: " + studentGrades[i]);
	}
	public static boolean isValid(char c)
	{
		for(char grade : GradeException.gradeLetters)
			if(grade == c)
				return true;
		return false;
	}
}
