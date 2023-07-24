/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 01, exercise 10

Task:
Write, compile, and test a class that displays the following statement
about comments on two lines:
"Program comments are nonexecuting statements you add to a file for documentation."
Also include the same statement in three different comments in the class; each
comment should use one of the three different methods of including comments in
a Java class. Save the class as Comments.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



public class Comments {

	public static void main(String[] args) {

		// Program comments are nonexecuting statements you add to a file for documentation.

		/* Program comments are nonexecuting statements
		   you add to a file for documentation */

		/** Program comments are nonexecuting statements you add to a file for documentation */

		System.out.print("Program comments are nonexecuting statements");
		System.out.println("you add to a file for documentation");

	}

}
