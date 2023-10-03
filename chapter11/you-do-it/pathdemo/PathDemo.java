import java.nio.file.*;

public class PathDemo
{
	public static void main(String[] args)
	{
		Path filePath = Paths.get("/home/jakov/java-farrell-joyce-10th-edition/chapter11/you-do-it/Data.txt");
		int count = filePath.getNameCount();
		System.out.println("File path is " + filePath.toString());
		System.out.println("File name is " + filePath.getFileName());
		System.out.println("There are " + count + " elements in the file path");
		for(int x = 0; x < count; x++)
		{
			System.out.println("Element " + x + " is " + filePath.getName(x));
		}
	}
}
