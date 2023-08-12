import java.util.*;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		int[] myScores = new int[5];
		display("Original array:             ", myScores);
		Arrays.fill(myScores, 8);
		display("After filling with 8s:      ", myScores);
		myScores[2] = 3;
		myScores[4] = 6;
		display("After changing two values:  ", myScores);
		Arrays.sort(myScores);
		display("After sorting:              ", myScores);
	}
	public static void display(String message, int[] array)
	{
		System.out.print(message);
		for(int x = 0; x < array.length; x++)
			System.out.print(array[x] + " ");
		System.out.println();
	}
}
