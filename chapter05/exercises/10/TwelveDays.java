/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 10

Task:
Use the Web to locate the lyrics to the traditional song “The Twelve Days
of Christmas.” The song contains a list of gifts received for the holiday.
The list is cumulative so that as each “day” passes, a new verse contains
all the words of the previous verse, plus a new item. Write an application
that displays the words to the song starting with any day the user enters.
(Hint: Use a switch statement with cases in descending day order and without
any break statements so that the lyrics for any day repeat all the lyrics
for previous days.) Save the file as TwelveDays.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TwelveDays {

	public static void main(String[] args) {

		String day;
		Scanner input = new Scanner(System.in);
		System.out.println("\n*** Twelve Days of Christmas ***\n");
		System.out.print("Enter day (first, fifth...) to display verses >> ");
		day = input.nextLine();

		displayVerses(day);

	}

	public static void displayVerses(String day) {
			System.out.println("\nOn a " + day + " day of Chirstmas");
			System.out.println("my true love sent to me:");
		switch (day) {
			case "twelfth":
				System.out.println("Drummers Drumming");
			case "eleventh":
				System.out.println("Pipers Piping");
			case "tenth":
				System.out.println("Lords a Leaping");
			case "ninth":
				System.out.println("ladies Dancing");
			case "eighth":
				System.out.println("Maids a Milking");
			case "seventh":
				System.out.println("Swans a Swimming");
			case "sixth":
				System.out.println("Geese a Laying");
			case "fifth":
				System.out.println("Golden Rings");
			case "fourth":
				System.out.println("Calling Birds");
			case "third":
				System.out.println("3 French Hens");
			case "second":
				System.out.println("2 Turtle Doves");
			case "first":
				if (!day.equals("first"))
					System.out.print("and a Partridge in a Pear Tree");
				else
					System.out.println("A Partridge in a Pear Tree");
		}
	}

}
