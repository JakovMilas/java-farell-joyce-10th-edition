/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 8

Task:
Write an application that allows a user to enter any number of student
quiz scores until the user enters a sentinel 99. If the score entered is
less than 0 or greater than 10, display an appropriate message and do not
use the score. After all the scores have been entered, display the number
of scores entered, the highest score, the lowest score, and the arithmetic
average. Save the file as QuizScoreStatistics.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class QuizScoreStatistics {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int score;
		int sumOfScores = 0;
		int countOfScores = 0;
		int lowestScore = 10;
		int  highestScore = 0;
		double averageScore;
		final int SENTINEL = 99;

		System.out.print("Enter quiz score or " +
						SENTINEL + " to exit >> ");
		score = input.nextInt();

		while (score != SENTINEL) {
			if (score < 0 || score > 10)
				System.out.println("ERROR: Invalid score!");
			else {
				sumOfScores += score;
				countOfScores++;
				if (score < lowestScore)
					lowestScore = score;
				if (score > highestScore && score != SENTINEL)
					highestScore = score;
			}
				System.out.print("Enter quiz score or " +
								SENTINEL + " to exit >> ");
				score = input.nextInt();
		}

		if (countOfScores != 0) {
			averageScore = (double) sumOfScores / countOfScores;
			System.out.println("\nNumber of scores: " + countOfScores);
			System.out.println("Lowest score:  " + lowestScore);
			System.out.println("Highest score: " + highestScore);
			System.out.println("Average score: " + averageScore);
		}

	}

}
