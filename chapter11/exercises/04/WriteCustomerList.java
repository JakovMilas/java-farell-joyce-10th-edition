/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 4a

Task:
Create a program that allows a user to input customer records (ID number, first name, last name, and
balance owed) and save each record to a file. Save the program as WriteCustomerList.java. When you
execute the program, be sure to enter multiple records that have the same last name because you will
search for repeated names in part d of this exercise.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;

public class WriteCustomerList
{
		public static void main(String[] args)
		{
				int id = 0;
				String firstName, lastName;
				String s = "";
				double balance;
				String delimiter = ",";
				Scanner input = new Scanner(System.in);
				final int SENTINEL = 99999;
				Path file = Paths.get("Customers.txt");
				Path fullPath = file.toAbsolutePath(); 

				try
				{
					OutputStream output = new BufferedOutputStream(Files.newOutputStream(fullPath, CREATE));
					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
					System.out.print("Enter customer ID >> ");
					id = input.nextInt();
					while(id != 99999)
					{
						input.nextLine();
						System.out.print("Enter customer first name >> ");
						firstName = input.nextLine();
						System.out.print("Enter customer last name >> ");
						lastName = input.nextLine();
						System.out.print("Enter customer $ balance >> ");
						balance = input.nextDouble();

						s = id + delimiter + firstName + delimiter + lastName + delimiter + balance; 
						writer.write(s, 0, s.length());
						writer.newLine();
						System.out.print("Enter next customer ID number or " + SENTINEL + " to quit >> ");
						id = input.nextInt();

					}
					writer.close();
				}
				catch(Exception e)
				{
						System.out.println("Message: " + e);
				}
		}
}
