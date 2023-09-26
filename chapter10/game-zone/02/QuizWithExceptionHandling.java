/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 10, Game Zone 2

Task:
Create a class that contains an array of 10 multiple-choice questions to which the user is required to respond
with an A, B, or C. Display an error message if the user enters a character other than A, B, or C. If the user
enters nothing?that is, if the user just presses the Enter key without making an entry, catch the thrown
Exception, display an error message, and present the same question to the user again. Save the file as
QuizWithExceptionHandling.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class QuizWithExceptionHandling
{
	public static void main(String[] args)
	{
		String[] questions = 
		{
			"What is Benedictine monk Dom Pierre Perignon rumored to have created",
			"Which country drinks the most amount of coffee per person",
			"What is the most common color of toilet paper in France",
			"How many years old is the world?s oldest piece of chewing gum",
			"How many times per day does the average American open their fridge",
			"What color is an airplane?s famous black box",
			"What is Bombay Duck's main ingredient",
			"On a boat, what is the opposite of port",
			"In what language is the phrase ?Hakuna Matata?",
			"What type of computer was the first laptop computer"
		};
		String[][] answers = 
		{
			{"Tomato ketchup", "Champagne", "French fries"}, // B
			{"Finland", "Italy", "Colombia"}, // A
			{"Pink", "White", "Blue"}, // A
			{"100", "2,500", "5700"}, // C
			{"5", "22", "33"}, // C
			{"Red", "Orange", "Black"}, // B
			{"Fish", "Duck", "Chicken"}, // A
			{"Bow", "Starboard", "Deck"}, // B
			{"Dutch", "Yoruba", "Swahili"}, // C
			{"Apple Macintosh", "IBM PC", "Osborne 1"} // C
		};
		char[] correctAnswers = {'B', 'A', 'A', 'C', 'C', 'B', 'A', 'B', 'C', 'C'};
		String answer;
		boolean isValid = false;
		int correctAnswersCount = 0;
		Scanner input = new Scanner(System.in);
		for(int x = 0; x < questions.length; x++)
		{
			System.out.println("\n" + questions[x] + "?");
			for(int y = 0; y < answers[x].length; y++)
			{
				char n = (char)(65 + y);
				System.out.println(n + " - " + answers[x][y]);
			}
			System.out.print("Select your answer (A, B, C) >> ");
			answer = input.nextLine().toUpperCase();
			while(!isValid)
			{
				try
				{
					char c = answer.charAt(0);
					if(answer.length() == 0)
						throw new RuntimeException();
					if(c != 'A' && c != 'B' && c != 'C')
						throw new Exception("Wrong input!");
					isValid = true;
				}
				catch(RuntimeException e)
				{
					System.out.println("Answer can not be empty!");
					System.out.print("Try again (A, B or C) >> ");
					answer = input.nextLine().toUpperCase();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
					System.out.print("Try again (A, B or C) >> ");
					answer = input.nextLine().toUpperCase();
				}
			}
			isValid = false;
			if(answer.charAt(0) == correctAnswers[x])
			{
				System.out.println("CORRECT!");
				correctAnswersCount++;
			}
			else
				System.out.println("INCORRECT");
		}
		System.out.println("\nG A M E   O V E R\nYou have " + correctAnswersCount + " correct answers.");
	}
}
