/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 9a

Task:
Write an application that accepts up to 20 Strings, or fewer if the user enters
a terminating value. Store each String in one of two lists—one list for short
Strings that are 10 characters or fewer and another list for long Strings that are
11 characters or more. After data entry is complete, prompt the user to enter which
type of String (short or long) to display, and then output the correct list. For this
exercise, you can assume that if the user does not request the list of short Strings,
the user wants the list of long Strings. If a requested list has no Strings, output
an appropriate message. Prompt the user continually until a sentinel value is entered.
Save the file as CategorizeStrings.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class CategorizeStrings {

	public static void main(String[] args) {

		final int LIMIT = 20;
		final int SHORT_STRING = 10;
		final String SENTINEL = "stop";
		String word;
		int count = 0;
		String[] strings = new String[LIMIT];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string #1 or STOP to exit >> ");
		word = input.nextLine();
		while (!word.equalsIgnoreCase(SENTINEL) && count < LIMIT) {
			strings[count] = word;
			count++;
			System.out.print("Enter string #" + (count + 1) + " or STOP to exit >> ");
			word = input.nextLine();
		}
		word = "";
		while (!word.equalsIgnoreCase(SENTINEL)) {
			System.out.print("\nType:\n" +
						"SHORT to see short strings\n" +
						"LONG to see long strings\n" +
						"STOP to exit\n >> ");
			word = input.nextLine();
			if (!word.equalsIgnoreCase(SENTINEL)) {
				if (word.equalsIgnoreCase("short")) {
					System.out.println("\nShort strings:");
					for (int i = 0; i < count; i++)
						if (strings[i].length() <=10)
							System.out.println(strings[i]);
				} else {
					System.out.println("\nLong strings:");
					for (int i = 0; i < count; i++)
						if (strings[i].length() > 10)
							System.out.println(strings[i]);
				}
			}
		}
	}
}
