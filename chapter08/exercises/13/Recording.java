/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 13a

Task:
Radio station KJAVA wants a class to keep track of recordings it plays. Create a class named Recording
that contains fields to hold methods for setting and getting a Recording?s title, artist, and playing time
in seconds. Save the file as Recording.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Recording
{
	private String title;
	private String artist;
	int playingTime;

	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	public String getArtist()
	{
		return artist;
	}
	public void setPlayingTime(int time)
	{
		playingTime = time;
	}
	public int getPlayingTime()
	{
		return playingTime;
	}
}
