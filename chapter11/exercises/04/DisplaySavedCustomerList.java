/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 4c

Task:
Write an application that reads the file created by the WriteCustomerList application and displays
the records. Save the file as DisplaySavedCustomerList.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.io.*;

public class DisplaySavedCustomerList
{
		public static void main(String[] args)
		{
				Path file = Paths.get("Customers.txt");
				Path fullPath = file.toAbsolutePath();
				String s = "";

				try
				{
						InputStream input = new BufferedInputStream(Files.newInputStream(fullPath));
						BufferedReader reader = new BufferedReader(new InputStreamReader(input));
						s = reader.readLine();
						while(s != null)
						{
								System.out.println(s);
								s = reader.readLine();
						}
						reader.close();
				}
				catch(Exception e)
				{
						System.out.println("Message: " + e);
				}
		}
}
