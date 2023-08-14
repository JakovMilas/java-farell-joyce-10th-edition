/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 13b

Task:
Write an application that instantiates five Recording objects and prompts the user for values for the
data fields. Then prompt the user to enter which field the Recordings should be sorted by?song title,
artist, or playing time. Perform the requested sort procedure, and display the Recording objects.
Save the file as RecordingSort.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class RecordingSort
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String entry;
		Recording[] recordings = new Recording[5];
		for(int i = 0; i < recordings.length; i++)
			recordings[i] = enterData();
		System.out.println("\nHow do you want recordings to be sorted?");
		System.out.print(" by title\n by artist\n by playing time\n >> ");
		entry = input.nextLine().toLowerCase();
		sort(recordings, entry);
		display(recordings);
	}
	public static Recording enterData()
	{
		Recording rec = new Recording();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter song title >> ");
		rec.setTitle(input.nextLine());
		System.out.print("Enter song artist >> ");
		rec.setArtist(input.nextLine());
		System.out.print("Enter playing time >> ");
		rec.setPlayingTime(input.nextInt());
		return rec;
	}
	public static void sort(Recording[] recordings, String criteria)
	{
		int x, y;
		Recording temp;
		x = 1;
		while(x < recordings.length)
		{
			temp = recordings[x];
			y = x - 1;
			if(criteria.startsWith("t"))
			{
				while(y >= 0 && recordings[y].getTitle().compareTo(temp.getTitle()) > 0)
				{
					recordings[y + 1] = recordings[y];
					y--;
				}
				recordings[y + 1] = temp;
				x++;
			}
			else
				if(criteria.startsWith("a"))
				{
					while(y >= 0 && recordings[y].getArtist().compareTo(temp.getArtist()) > 0)
					{
						recordings[y + 1] = recordings[y];
						y--;
					}
					recordings[y + 1] = temp;
					x++;
				}
				else
					if(criteria.startsWith("p"))
					{
						while(y >= 0 && recordings[y].getPlayingTime() > temp.getPlayingTime())
						{
							recordings[y + 1] = recordings[y];
							y--;
						}
						recordings[y + 1] = temp;
						x++;
					}
					else
						System.out.println("ERROR >>> Wrong input!");
		}
	}
	public static void display(Recording[] recordings)
	{
		for(Recording r : recordings)
			System.out.println(r.getTitle() + " - " + r.getArtist() + " - " + r.getPlayingTime() + "sec.");
	}
}
