/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 8b

Task:
Write an application in which you store at least five student ID numbers in an array. One at a time,
display the ID number and prompt the user to enter a test score for the student. Catch any Exception
thrown if the user does not enter an integer for the score, display an error message, and set the score to
0. Throw a ScoreException if the user enters a score greater than 100. Catch the ScoreException,
display an appropriate message, and then store a 0 for the student?s score. At the end of the application,
display all the student IDs and scores. Save the file as TestScore.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class TestScore
{
	public static void main(String[] args)
	{
		int[] students = {101, 102, 103, 104, 105};
		int[] testScores = new int[students.length];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < students.length; i++)
		{
			System.out.print("Enter score for student ID " + students[i] + " >> ");
			try
			{
				testScores[i] = input.nextInt();
				if(testScores[i] > 100)
				{
					throw(new ScoreException("Score can not be greater than 100, " +
								" score is set to 0"));
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Wrond input data, score set to 0");
				testScores[i] = 0;
			}
			catch(ScoreException e)
			{
				System.out.println(e.getMessage());
				testScores[i] = 0;
			}
			input.nextLine();

		}
		for(int i = 0; i < students.length; i++)
			System.out.println("Student ID " + students[i] + " score: " + testScores[i]);
	}
}
