/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 1

Task:
Write an application that creates a quiz. The quiz should contain at least
five questions about a hobby, popular music, astronomy, or any other personal
interest. Each question should be a multiple-choice question with at least
four answer options. When the user answers the question correctly, display a
congratulatory message. If the user responds to a question incorrectly, display
an appropriate message as well as the correct answer. At the end of the quiz,
display the number of correct and incorrect answers and the percentage of
correct answers. Save the file as Quiz.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		String q1 = "What company was originally called Cadabra?";
		
		String q1a1 = "Facebook";
		String q1a2 = "Amazon"; // correct
		String q1a3 = "Yahoo";
		String q1a4 = "Google";

		String q2 = "How many faces does a Dodecahedron have?";
		
		String q2a1 = "6";
		String q2a2 = "8";
		String q2a3 = "10";
		String q2a4 = "12"; // correct

		String q3 = "What Renaissance artist is buried in Rome's Pantheon?";
		
		String q3a1 = "Raphael"; // correct
		String q3a2 = "Micheleangelo";
		String q3a3 = "Da Vinci";
		String q3a4 = "Goya";

		String q4 = "How many bones do we have in an ear?";
		
		String q4a1 = "3"; // correct
		String q4a2 = "4";
		String q4a3 = "5";
		String q4a4 = "none";

		String q5 = "How many ghosts chase Pac-Man at the start of each game?";
		
		String q5a1 = "8";
		String q5a2 = "6";
		String q5a3 = "4"; // correct
		String q5a4 = "2";

		int answer = 0;

		while (answer != 2)
			answer = displayQuestion(q1, q1a1, q1a2, q1a3, q1a4);
		System.out.println("Correct!");

		answer = 0;
		while (answer != 4)
			answer = displayQuestion(q2, q2a1, q2a2, q2a3, q2a4);
		System.out.println("Correct!");
		
		answer = 0;
		while (answer != 1)
			answer = displayQuestion(q3, q3a1, q3a2, q3a3, q3a4);
		System.out.println("Correct!");

		answer = 0;
		while (answer != 1)
			answer = displayQuestion(q4, q4a1, q4a2, q4a3, q4a4);
		System.out.println("Correct!");

		answer = 0;
		while (answer != 3)
			answer = displayQuestion(q5, q5a1, q5a2, q5a3, q5a4);
		System.out.println("Correct!");

	}

	public static int displayQuestion(
					String q, String a1, String a2, String a3, String a4) {
		Scanner input = new Scanner(System.in);
		System.out.println("\n" + q);
		System.out.print("1 " + a1 + "\n" +
						   "2 " + a2 + "\n" +
						   "3 " + a3 + "\n" +
						   "4 " + a4 + "\n" +
						   " >> ");
		int response = input.nextInt();
		return response;
	}

}
