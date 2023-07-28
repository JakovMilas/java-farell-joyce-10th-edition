/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 03, Game Zone 1

Task:
Mad Libs is a children’s game in which the players provide a few words that are then
incorporated into a silly story. For example, you might ask a child for the name of
an animal, a number, and a direction. The child might reply with such answers as dog,
13, and east. The newly created Mad Lib might be:
Hickory Dickory Dock.
The dog ran up the clock.
The clock struck 13.
The dog ran east.
Hickory Dickory Dock.
Create a program that asks the user to provide a few words. Then send the words to a
method that displays a short story or nursery rhyme that uses them.
Save the file as MadLibWithMethod.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class MadLibWithMethod {

	public static void main(String[] args) {

		String animal, direction;
		int number;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an animal >> ");
		animal = input.nextLine();
		System.out.print("Enter an number >> ");
		number = input.nextInt();
		System.out.print("Enter an direction >> ");
		input.nextLine();
		direction = input.nextLine();

		displayStory(animal, number, direction);

	}

	public static void displayStory(String animal, int number, String direction) {

		System.out.println("\nHickory Dickory Dock." +
						   "\nThe " + animal + " ran up the clock." +
						   "\nThe clock struck " + number + "." +
						   "\nThe " + animal + " ran " + direction + "." +
						   "\nHickory Dickory Dock.");

	}

}
