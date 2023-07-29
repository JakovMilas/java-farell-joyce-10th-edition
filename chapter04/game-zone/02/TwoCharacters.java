/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Game Zone 2

Task:
Write an application in which you create at least two MyCharacter objects.
In turn, pass each character to a display method that displays the
character’s attributes. Save the application as TwoCharacters.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class TwoCharacters {

	public static void main(String[] args) {
	
		MyCharacter character1 = new MyCharacter();
		MyCharacter character2 = new MyCharacter();

		character1.setColor("red");
		character1.setNumberOfEyes(2);
		character1.setNumberOfLives(3);

		character2.setColor("black");
		character2.setNumberOfEyes(4);
		character2.setNumberOfLives(3);

		display(character1);
		display(character2);
	
	}

	public static void display(MyCharacter character) {
		System.out.println("\nCharacter details:");
		System.out.println("Color: " + character.getColor());
		System.out.println("Number of eyes: " + character.getNumberOfEyes());
		System.out.println("Number of lives: " + character.getNumberOfLives());
	}

}
