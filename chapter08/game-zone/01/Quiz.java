/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 1

Task:
Write an application that contains an array of 10 multiple-choice quiz questions related to your favorite hobby.
Each question contains three answer choices. Also create an array that holds the correct answer to each
question?A, B, or C. Display each question and verify that the user enters only A, B, or C as the answer?if not,
keep prompting the user until a valid response is entered. If the user responds to a question correctly, display
Correct!; otherwise, display The correct answer is and the letter of the correct answer. After the user answers all
the questions, display the number of correct and incorrect answers. Save the file as Quiz.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class Quiz
{
	public static void main(String[] args)
	{
		String[] questions = {"How many measures of Gordon's Gin are in a Vesper (James Bond) martini?\n A - 1\n B - 2\n C - 3\n  >> ", //C
				      "Cacio & Pepe is a staple of what Italian city's cuisine?\n A - Napoli\n B - Rome\n C - Milano\n  >> ", //B
				      "Where did sushi originate?\n A - China\n B - Japan\n C - Thailand\n  >> ",  //A
				      "What is a Beaujolais?\n A - Type of rose wine\n B - Type of white wine\n C - Type of red wine\n  >> ", //C
				      "Which of the following sauces is NOT traditionally vegan - \n A - Hoisin\n B - Worcestershire\n C - Wasabi\n  >> ", //B
				      "What is the world's best-selling stout beer?\n A - Guinness\n B - Budweiser\n C - Stella Amstel\n  >> ",  //A
				      "What country drinks the most coffee?\n A - USA\n B - Brasil\n C - Finland\n  >> ",  //C
				      "What meat is used in a shepherd's pie?\n A - Lamb\n B - Rabbit\n C - Pork\n  >> ",  //A
				      "What is the difference between brandy and cognac?\n A - Amount of alcohol\n B - Color\n" +
					      " C - Cognac is from Congnac region of France\n  >> ", //C
				      "Pink Ladies and Granny Smiths are types of what fruit?\n A - Pears\n B - Apples\n C - Grapes\n  >> "};  //B
		char[] answers = {'C', 'B', 'A', 'C', 'B', 'A', 'C', 'A', 'C', 'B'};
		String entry;
		int count = 0;
		char answerLetter;
		Scanner input = new Scanner(System.in);
		System.out.println("\n    G A M E:   Q u i z\n");
		
		for(int i = 0; i < questions.length; i++)
		{
			System.out.println("\nQuestion #" + (i + 1) + ":");
			System.out.print(questions[i]);
			entry = input.nextLine().toUpperCase();
			answerLetter = entry.charAt(0);
			while(answerLetter != 'A' && answerLetter != 'B' && answerLetter != 'C')
			{
				System.out.print("ERROR >>> Wrong input, try again >> ");
				entry = input.nextLine().toUpperCase();
				answerLetter = entry.charAt(0);
			}
			if(answerLetter == answers[i])
			{
				System.out.println("Correct!");
				count++;
			}
			else
				System.out.println("Not correct!");
		}
		System.out.println("Correct answers " + count);
		System.out.println("Incorrect answers " + (questions.length - count));
	}
}
