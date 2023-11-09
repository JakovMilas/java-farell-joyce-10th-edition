/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 5

Task:
Using a text editor, create a file that contains a list of at least 15 six-digit account numbers. Write a program
that reads in each account number in the file, and display whether the account number is valid. An account
number is valid only if the last digit is equal to the remainder when the sum of the first five digits is divided
by 10. For example, the number 223355 is valid because the sum of the first five digits is 15, the remainder
when 15 is divided by 10 is 5, and the last digit is 5. Write only valid account numbers to an output file, each
on its own line. Save the application as ValidateCheckDigits.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.io.*;

public class ValidateCheckDigits
{
		public static void main(String[] args)
		{
				Path file = Paths.get("AccountNumbers.txt");
				Path fullPath = file.toAbsolutePath();
				String s = "";
				int sum = 0;
				int i;
				int lastDigit;
				boolean isValid = false;
				int[] numbers = new int[6];

				try
				{
						InputStream input = new BufferedInputStream(Files.newInputStream(fullPath));
						BufferedReader reader = new BufferedReader(new InputStreamReader(input));
						s = reader.readLine();

						while(s != null)
						{
								for(i = 0; i < s.length(); i++)
								{
										numbers[i] = Character.getNumericValue(s.charAt(i));
								}
								for(i = 0; i < numbers.length - 1; i++)
										sum += numbers[i];
								if(sum % 10 == numbers[numbers.length - 1])
								{
										System.out.println(s);
										isValid = true;
								}
								sum = 0;
								s = reader.readLine();

						}
						reader.close();
						if(!isValid)
								System.out.println("There is no valid numbers.");
				}
				catch(Exception e)
				{
						System.out.println("Message: " + e);
				}
		}
}
