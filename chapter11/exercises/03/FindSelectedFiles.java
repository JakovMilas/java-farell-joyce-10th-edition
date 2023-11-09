/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 11, exercise 3

Task:
Write an application that determines which, if any, of the following files are stored in the folder where you
have saved the exercises created in this chapter: autoexec.bat, CompareFolders.java, FileStatistics.class, and
Hello.doc. Save the file as FindSelectedFiles.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.nio.file.*;

public class FindSelectedFiles
{
		public static void main(String[] args)
		{
				Path batPath = Paths.get("autoexec.bat");
				Path javaPath = Paths.get("CompareFolders.java");
				Path classPath = Paths.get("FileStatistics.class");
				Path docPath = Paths.get("Hello.doc");

				Path fullBatPath = batPath.toAbsolutePath();
				Path fullJavaPath = javaPath.toAbsolutePath();
				Path fullClassPath = classPath.toAbsolutePath();
				Path fullDocPath = docPath.toAbsolutePath();
				Path[] paths = {fullBatPath, fullJavaPath, fullClassPath, fullDocPath};

				for(int x = 0; x < paths.length; x++)
				{
					if(Files.exists(paths[x]))
							System.out.println("File " + paths[x].toString() + " exists.");
					else
							System.out.println("File " + paths[x].toString() + " does NOT exists.");
				}
		}
}
