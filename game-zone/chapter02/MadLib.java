/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 02, Game Zone 1

Task:
Mad Libs is a children’s game in which they provide a few words that are then incorporated into a silly story.
The game helps children understand different parts of speech because they are asked to provide specific types
of words. For example, you might ask a child for a noun, another noun, an adjective, and a past-tense verb.
The childmight reply with such answers as table, book, silly, and studied. The newly created Mad Lib might
be the following:
Mary had a little table
Its book was silly as snow
And everywhere that Mary studied
The table was sure to go.
Create a Mad Libs program that asks the user to provide at least four or five words, and then create
and display a short story or nursery rhyme that uses them. Save the file as MadLib.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a noun >> ");
		String noun = input.nextLine();

		System.out.print("Enter second noun >> ");
		String noun2 = input.nextLine();

		System.out.print("Enter an adjective >> ");
		String adjective = input.nextLine();

		System.out.print("Enter a verb >> ");
		String verb = input.nextLine();

		System.out.print("Enter an past-tense verb >> ");
		String pastTenseVerb = input.nextLine();

		String story = "Marry had a little " + noun + ".\n";
		story += "Its " + noun2 + " was " + adjective + " as snow.\n";
		story += "And everywhere that Mary " + pastTenseVerb + ".\n";
		story += "The " + noun + " was sure to go.";

		System.out.println(story);
	}
}
