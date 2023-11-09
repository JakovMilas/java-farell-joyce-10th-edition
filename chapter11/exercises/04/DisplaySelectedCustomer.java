/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 4c

Task:
Write an application that allows you to enter any ID number, reads the customer data file created in
Exercise 4a, and displays the data for the customer. Display an appropriate message if the ID number
cannot be found in the input file. Save the file as DisplaySelectedCustomer.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class DisplaySelectedCustomer
{
		public static void main(String[] args)
		{
				Path file = Paths.get("Customers.txt");
				Path fullPath = file.toAbsolutePath();
				int userInput;
				String s = "";
				String[] array = new String[4];
				int id = 0;
				String firstName, lastName;
				double balance;
				String delimiter = ",";
				boolean isFound = false;;
				Scanner keyboard = new Scanner(System.in);

				try
				{
						InputStream input = new BufferedInputStream(Files.newInputStream(fullPath));
						BufferedReader reader = new BufferedReader(new InputStreamReader(input));
						System.out.print("Enter customer ID >> ");
						userInput = keyboard.nextInt();
						s = reader.readLine();
						while(s != null && !isFound)
						{
								array = s.split(delimiter);
								id = Integer.parseInt(array[0]);
								firstName = array[1];
								lastName = array[2];
								balance = Double.parseDouble(array[3]);
								if(userInput == id)
								{
										for(int i = 0; i < array.length; i++)
												System.out.print(array[i] + " ");
										System.out.println();
										isFound = true;
								}
								s = reader.readLine();
						}
						if(!isFound)
								System.out.println("Customer with ID $" + userInput + " does not exist!");
						reader.close();
				}
				catch(Exception e)
				{
						System.out.println("Message: " + e);
				}
		}
}
