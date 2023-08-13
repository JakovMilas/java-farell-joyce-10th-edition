/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 6c

Task:
Write an application that prompts a professor to enter grades for five different courses each for
10 students. Prompt the professor to enter data for one student at a time, including student ID and
course data for five courses. Use prompts containing the number of the student whose data is being
entered and the course number?for example, Enter ID for student #1, and Enter course ID #5. Verify
that the professor enters only A, B, C, D, or F for the grade value for each course.
Save the file as InputGrades.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;
import java.util.Arrays;

public class InputGrades
{
	public static void main(String[] args)
	{
		Student[] students = new Student[10];
		enterData(students);
		display(students);
	}
	public static void enterData(Student[] students)
	{
		String entry;
		int creditHours;
		Scanner input = new Scanner(System.in);
		for(int x = 0; x < students.length; x++)
		{
			students[x] = new Student();
			System.out.print("Enter student #" + (x + 1) + " ID >> ");
			entry = input.nextLine();
			students[x].setId(entry);
			for(int y = 0; y < 5; y++)
			{
				CollegeCourse course = new CollegeCourse();
				System.out.println("Student #" + (x + 1) + ", course #" + (y + 1));
				System.out.print("Enter course ID >> ");
				course.setId(input.nextLine());
				System.out.print("Enter course credit hours >> ");
				course.setCreditHours(input.nextInt());
				System.out.print("Enter course letter grade >> ");
				input.nextLine();
				entry = input.nextLine().toUpperCase();
				while(!validLetter(entry))
				{
					System.out.print("Wrong input, try again >> ");
					entry = input.nextLine().toUpperCase();
				}
				course.setLetterGrade(entry.charAt(0));
				students[x].setCollegeCourse(course, y);
			}
		}
	}
	public static boolean validLetter(String str)
	{
		char letter = str.charAt(0);
		boolean isValid = false;
		switch (letter)
		{
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'F':
				isValid = true;
		}
		return isValid;
	}
	public static void display(Student[] students)
	{
		for(int x = 0; x < students.length; x ++)
		{
			System.out.println("\nStudent #" + students[x].getId() + " college course data:");
			for (int y = 0; y < 5; y++)
			{
				System.out.print("    Course ID: " + students[x].getCollegeCourse(y).getId());
				System.out.print("    Credit hours: " + students[x].getCollegeCourse(y).getCreditHours());
				System.out.print("    Grade: " + students[x].getCollegeCourse(y).getLetterGrade());
				System.out.println();
			}
		}
	}
}
