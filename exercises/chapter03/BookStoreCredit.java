/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, exercise 05

Task:
To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is
10 times the student’s grade point average. In other words, a student with a 3.2 grade point average receives a
$32 credit. Create a class that prompts a student for a name and grade point average and then passes the values
to a method that displays a descriptive message. The message uses the student’s name, echoes the grade point
average, and computes and displays the credit. Save the application as BookstoreCredit.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class BookStoreCredit {

	public static void main(String[] args) {

		String name;
		double gpa;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter students name >> ");
		name = input.nextLine();

		System.out.print("Enter students GPA >> ");
		gpa = input.nextDouble();

		calculateCredit(name, gpa);

	}

	public static void calculateCredit(String name, double gpa) {

		System.out.println(name + "'s GPA is " + gpa + " and bookstore credit is $" + (gpa * 10));

	}

}
