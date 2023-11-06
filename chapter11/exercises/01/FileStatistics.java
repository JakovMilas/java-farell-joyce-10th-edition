/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 1

Task:
Create a file using any word-processing program or text editor. Write an application that prompts the user
for the filename and displays the file’s path, name, folder, size, and time of last modification.
Save the file as FileStatistics.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import java.util.Scanner;

public class FileStatistics
{
		public static void main(String[] args)
		{
				String fileName;
				Scanner input = new Scanner(System.in);
				System.out.print("Enter file name >> ");
				fileName = input.nextLine();
				try
				{
					Path filePath = Paths.get("file.txt");
					Path fullPath = filePath.toAbsolutePath();
					BasicFileAttributes attr = Files.readAttributes(fullPath, BasicFileAttributes.class);
					if(fileName.equals(fullPath.getFileName().toString()))
					{
						System.out.println("\nFile path: " + fullPath.toString());
						System.out.println("File name: " + fullPath.getFileName());
						System.out.println("File directory: " + fullPath.getName(fullPath.getNameCount() - 2));
						System.out.println("File size: " + attr.size());
						System.out.println("Last modified time: " + attr.lastModifiedTime().toString());
					}
					else
					{
						System.out.println("File >> " + fileName + " << does not exists");
					}
				}
				catch(IOException e)
				{
						System.out.println(e);
						System.out.println("ERROR");
				}
		}
}
