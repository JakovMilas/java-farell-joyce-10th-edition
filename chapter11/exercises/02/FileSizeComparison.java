/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 2

Task:
Create a file that contains a line of your favorite song lyric. Use a text editor such as Notepad, and save
the file. Copy the file contents, and paste them into a word-processing program such as Word. Write an
application that prompts the user for the names of the files and displays the sizes of the two files as well as
the ratio of their sizes to each other. Save the file as FileSizeComparison.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;


public class FileSizeComparison
{
		public static void main(String[] args)
		{
				Path file1 = Paths.get("lirics.txt");
				Path fullPathFile1 = file1.toAbsolutePath();
				Path file2 = Paths.get("lirics.docx");
				Path fullPathFile2 = file2.toAbsolutePath();
				try
				{
						BasicFileAttributes attr1 = Files.readAttributes(fullPathFile1, BasicFileAttributes.class);
						BasicFileAttributes attr2 = Files.readAttributes(fullPathFile2, BasicFileAttributes.class);
						System.out.println("Lirics.txt size is " + attr1.size());
						System.out.println("Lirics.docx size is " + attr2.size());
						System.out.printf("Lirics.txt is %.2f percent of lirics.docx", (attr1.size() * 100.00 / attr2.size()));
				}
				catch(IOException e)
				{
						System.out.println(e);
				}
		}
}
