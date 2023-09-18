/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, exercise 6c

Task:
Write an application that establishes an array of six Course objects. Create an array of six Strings to
hold department names, six ints to hold course numbers, and six doubles to hold credits. In a loop,
prompt the user for values for each field. Accept any value for the department name. If the user does not
enter an int for the course number, continually reprompt until an int is entered. If the user does not
enter a numeric value for the credits, reprompt until a number is entered. In a new loop, try to construct
six Course objects, each with values taken from the three arrays of field values. If a CourseException
is thrown when constructing any of the objects, create the object using the default constructor. Then, in
a third loop, display all the stored Course values using the Course toString() method. Save the file
as ThrowCourseException.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class ThrowCourseException
{
	public static void main(String[] args)
	{
		final int LIMIT = 6;
		Course[] courses = new Course[LIMIT];
		String[] departments = new String[LIMIT];
		int[] courseNumbers = new int[LIMIT];
		double[] credits = new double[LIMIT];
		boolean isValidInput = false;
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < LIMIT; i++)
		{
			System.out.print("Enter course department >> ");
			departments[i] = input.nextLine().toUpperCase();

			while(!isValidInput)
			{
				try
				{
					System.out.print("Enter course number >> ");
					courseNumbers[i] = input.nextInt();
					isValidInput = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Wrong input, try again:");
				}
				input.nextLine();
			}
			isValidInput = false;

			while(!isValidInput)
			{
				try
				{
					System.out.print("Enter credit hours >> ");
					credits[i] = input.nextDouble();
					isValidInput = true;
				}
				catch(InputMismatchException e)
				{
					System.out.println("Wrong input, try again:");
				}
				input.nextLine();
			}
			isValidInput = false;
		}
		for(int i = 0; i < LIMIT; i++)
		{
			try
			{
				courses[i] = new Course(departments[i], courseNumbers[i], credits[i]);
			}
			catch(CourseException e)
			{
				System.out.println(e.getMessage());
				courses[i] = new Course();
			}
		}
		System.out.println();
		for(Course c : courses)
			System.out.println(c.toString());
	}
}
