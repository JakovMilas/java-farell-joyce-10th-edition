/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 9b

Task:
Modify the CategorizeStrings application to divide the entered Strings into those that contain no
spaces, one space, or more. After data entry is complete, continually prompt the user to enter the type of
String to display. If the user does not enter one of the three valid choices, display all of the Strings.
Save the file as CategorizeStrings2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class CategorizeStrings2 {

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
						"NO to see no spaces strings\n" +
						"ONE to see one space strings\n" +
						"MORE to see more spaces strings" +
						"STOP to exit\n >> ");
			word = input.nextLine();
			if (word.equalsIgnoreCase("no")) {
				System.out.println("\nStrings with no spaces:");
				for (int i = 0; i < count; i++)
					if (countSpaces(strings[i]) == 0)
						System.out.println(strings[i]);
			} else
				if (word.equalsIgnoreCase("one")) {
					System.out.println("\nStrings with one space:");
					for (int i = 0; i < count; i++)
						if (countSpaces(strings[i]) == 1)
							System.out.println(strings[i]);
			} else
				if (word.equalsIgnoreCase("more")) {
					System.out.println("\nStrings with more than one space:");
					for (int i = 0; i < count; i++)
						if (countSpaces(strings[i]) > 1)
							System.out.println(strings[i]);
			} else 
				if (!word.equalsIgnoreCase("stop")) {
					System.out.println("\nAll strings:");
					for (int i = 0; i < count; i++)
						System.out.println(strings[i]);
			}

		}
	}

	public static int countSpaces(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count++;
		}
		return count;
	}
}
