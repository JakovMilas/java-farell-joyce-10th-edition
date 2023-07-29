/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Game Zone 2

Task:
Computer games often contain different characters or creatures. For example,
you might design a game in which alien beings possess specific characteristics
such as color, number of eyes, or number of lives. Design a character for a game,
creating a class to hold at least three attributes for the character. Include
methods to get and set each of the character’s attributes.
Save the file as MyCharacter.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class MyCharacter {

	private String color;
	private int numberOfEyes;
	private int numberOfLives;

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setNumberOfEyes(int eyes) {
		numberOfEyes = eyes;
	}
	public int getNumberOfEyes() {
		return numberOfEyes;
	}
	public void setNumberOfLives(int lives) {
		numberOfLives = lives;
	}
	public int getNumberOfLives() {
		return numberOfLives;
	}


}
