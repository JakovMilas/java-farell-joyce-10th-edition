/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Game Zone 4

Task:
Eliza is a famous 1966 computer program written by Joseph Weizenbaum. It imitates a psychologist (more
specifically, a Rogerian therapist) by rephrasing many of a patient?s statements as questions and posing them to
the patient. This type of therapy (sometimes called nondirectional) is often parodied in movies and television
shows, in which the therapist does not even have to listen to the patient, but gives ?canned? responses that
lead the patient from statement to statement. For example, when the patient says, I am having trouble with
my brother, the therapist might say, Tell me more about your brother. If the patient says, I dislike school, the
therapist might say, Why do you say you dislike school? Eliza became a milestone in the history of computers
because it was the first time a computer programmer attempted to create the illusion of human-to-human interaction.
Create a simple version of Eliza by allowing the user to enter statements continually until the user quits by
typing Goodbye. After each statement, have the computer make one of the following responses:
 - If the user entered the word my (for example, I am having trouble with my brother), respond with Tell me
   more about your and insert the noun in question?for example, Tell me more about your brother. When
   you search for a word in the user?s entry, make sure it is the entire word and not just letters within
   another word. For example, when searching for my, make sure it is not part of another word such
   as dummy or mystic.
 - If the user entered a strong word, such as love or hate, respond with You seem to have strong feelings
   about that.
 - Add a few other appropriate responses of your choosing.
 - In the absence of any of the preceding inputs, respond with a random phrase from the following: Please
   go on, Tell me more, or Continue.
Save the file as Eliza.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Eliza {

	private static String name;

	public static void main(String[] args) {
	
		String userAnswer = "";
		boolean isFirstQuestion = true;
		final String EXIT = "goodbye";
		Scanner input = new Scanner(System.in);

		while (!userAnswer.equalsIgnoreCase(EXIT)) {
			if (isFirstQuestion) {
				System.out.print("Hello, what's your name?\n >> ");
				name = input.nextLine();
				System.out.println("How can i help you, " + name + "?");
				isFirstQuestion = false;
			} else {
				userAnswer = userReplay();
				System.out.println(elizaQuestion(userAnswer));
			}
		}
	
	}

	public static String userReplay() {
		Scanner input = new Scanner(System.in);
		System.out.print(" >> ");
		return input.nextLine();
	}

	public static String elizaQuestion(String answer) {
		String question;
		if (answer.equalsIgnoreCase("goodbye"))
			question = "Goodbye, have a nice day.";
		else
			if (answer.contains(" my "))
				question = "Tell me more about your " + extractWord(answer, " my ");
		else
			if (answer.contains(" love "))
				question = "You seem to have strong feelings about " + extractWord(answer, " love ");
		else
			if (answer.contains(" hate "))
				question = "You seem to have strong feelings about " + extractWord(answer, " hate ");
		else 
			if (answer.contains(" his "))
				question = "What about his " + extractWord(answer, " his ");
		else
			if (answer.contains(" i "))
				question = "Dou you often talk about yourself, " + name + "?";
		else
			if (answer.contains("your name"))
				question = "My name is Eliza";
		else
			if (answer.contains(" talk "))
				question = "You are talking to much, " + name;
		else
			if (answer.contains(" not "))
				question = "Why not " + extractWord(answer, " not ");
		else
			if (answer.contains(" about "))
				question = "What about " + extractWord(answer, " about ");
		else
			if (answer.contains(" your "))
				question = "What about my " + extractWord(answer, " your ");
		else	
			question = randomQuestion();	
		return question;
	}

	public static String extractWord(String answer, String word) {
		int extractedWordStartIndex, extractedWordEndIndex = 0;
		boolean isWhiteSpaceFound = false;
		extractedWordStartIndex = answer.indexOf(word) + word.length();
		for (int i = extractedWordStartIndex; i < answer.length() && !isWhiteSpaceFound; i++) {
			if (answer.charAt(i) == ' ') {
				extractedWordEndIndex = i;
				isWhiteSpaceFound = true;
			} else
				extractedWordEndIndex = answer.length();
		}
		return answer.substring(extractedWordStartIndex, extractedWordEndIndex);
	}

	public static String randomQuestion() {
		int number = (int)(Math.random() * 3);
		String question;
		switch (number) {
			case 0:
				question = "Please go on";
				break;
			case 1:
				question = "Tel me more";
				break;
			default:
				question = "Continue";
		}
		return question;
	}

}
