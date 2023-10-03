import java.io.IOException;
import java.nio.file.*;

public class PathDemo4
{
	public static void main(String[] args)
	{
		Path filePath = Paths.get("/home/jakov/workspace/java-farell-joyce-10th-edition/chapter11/you-do-it/Data.txt");
		try
		{
			Files.delete(filePath);
			System.out.println("File of directory is deleted.");
		}
		catch (NoSuchFileException e)
		{
			System.out.println("No such file or directory.");
		}
		catch (DirectoryNotEmptyException e)
		{
			System.out.println("Directory is not empty.");
		}
		catch (SecurityException e)
		{
			System.out.println("No permission to delete.");
		}
		catch (IOException e)
		{
			System.out.println("IO Exception");
		}
	}
}
