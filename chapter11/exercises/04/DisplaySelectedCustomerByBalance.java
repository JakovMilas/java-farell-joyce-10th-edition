/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 4e

Task:
Write an application that allows you to enter any purchase amount and displays all the data for
customers with balances greater than the entered value. Display an appropriate message if no customers
meet the criteria. Save the file as DisplaySelectedCustomersByBalance.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class DisplaySelectedCustomerByBalance
{
		public static void main(String[] args)
		{
				Path file = Paths.get("Customers.txt");
				Path fullPath = file.toAbsolutePath();
				double userInput;
				String s = "";
				String delimiter = ",";
				String[] array = new String[4];
				double balance;;
				boolean isFound = false;;
				Scanner keyboard = new Scanner(System.in);

				try
				{
						InputStream input = new BufferedInputStream(Files.newInputStream(fullPath));
						BufferedReader reader = new BufferedReader(new InputStreamReader(input));
						System.out.print("Enter balance >> ");
						userInput = keyboard.nextDouble();
						s = reader.readLine();
						while(s != null)
						{
								array = s.split(delimiter);
								balance = Double.parseDouble(array[3]);
								if(balance > userInput)
								{
										System.out.println(s);
										isFound = true;
								}
								s = reader.readLine();
						}
						if(!isFound)
								System.out.println("No customer with balance greater than $" + userInput + " exist!");
						reader.close();
				}
				catch(Exception e)
				{
						System.out.println("Message: " + e);
				}
		}
}
