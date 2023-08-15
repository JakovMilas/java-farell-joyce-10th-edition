/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Game Zone 5

Task:
Magic 8 Ball is a toy developed in the 1950s and used for fortune-telling or advice-seeking. A player asks or
thinks of a yes-or-no question such as Will I be rich someday? The player then turns the ball over to see one of
20 randomly chosen responses?for example, It is certain or Very doubtful. Create a program that simulates the
toy by allowing a user to type a question; the user then receives one of 20 random responses. Allow the user to
keep asking questions until the user types in a sentinel value. Save the program as Magic8Ball.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.*;

public class Magic8Ball
{
	public static void main(String[] args)
	{
		final String EXIT = "QUIT";
		String question;
		String answer;
		String[] answers =
		{
			"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.",
			"You may rely on it.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.",
			"Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.",
			"My sources say no.", "Outlook not so good.", "Very doubtful. ", "As I see it, yes.",
			"Most likely.", "Outlook good.", "Yes.", "Signs point to yes.",
		};
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("\n    G A M E:   M a g i c   8   B a l l\n");
		
		System.out.print("Ask me something or enter " + EXIT + " to exit >> ");
		question = input.nextLine();
		while(question.length() == 0)
		{
			System.out.print("Try again >> ");
			question = input.nextLine();
		}
		while(!question.equalsIgnoreCase(EXIT))
		{
			answer = answers[random.nextInt(answers.length)];
			System.out.println(answer);
			System.out.print("Ask me something or enter " + EXIT + " to exit >> ");
			question = input.nextLine();
			while(question.length() == 0)
			{
				System.out.print("Try again >> ");
				question = input.nextLine();
			}
		}
	}
}
