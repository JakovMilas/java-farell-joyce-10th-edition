/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 4d

Task:
Write an application that allows you to enter any last name and displays all the data for customers with
the given last name. Display an appropriate message if the name cannot be found in the input file. Save
the file as DisplaySelectedCustomersByName.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class DisplaySelectedCustomerByName
{
		public static void main(String[] args)
		{
				Path file = Paths.get("Customers.txt");
				Path fullPath = file.toAbsolutePath();
				String userInput;
				String s = "";
				String delimiter = ",";
				String[] array = new String[4];
				String lastName;
				boolean isFound = false;;
				Scanner keyboard = new Scanner(System.in);

				try
				{
						InputStream input = new BufferedInputStream(Files.newInputStream(fullPath));
						BufferedReader reader = new BufferedReader(new InputStreamReader(input));
						System.out.print("Enter customer last name >> ");
						userInput = keyboard.nextLine();
						s = reader.readLine();
						while(s != null)
						{
								array = s.split(delimiter);
								lastName = array[2];
								if(userInput.equals(lastName))
								{
										System.out.println(s);
										isFound = true;
								}
								s = reader.readLine();
						}
						if(!isFound)
								System.out.println("No customer with last name of " + userInput + " exist!");
						reader.close();
				}
				catch(Exception e)
				{
						System.out.println("Message: " + e);
				}
		}
}
