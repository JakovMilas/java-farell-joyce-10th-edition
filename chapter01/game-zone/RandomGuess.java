/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 01, Game Zone 1

Task:
Write a Java application that displays two dialog boxes in sequence. The first asks you to think of a number
between 1 and 10. The second displays a randomly generated number; the user can see whether the guess was
accurate. (After you study future chapters, you will be able to improve this game so that the user can enter a
guess, and the program can determine whether the user was correct. Also, as you gain skills in Java, you will
be able to tell the user how far off the guess was, tell the user whether the guess was high or low, and provide a
specific number of repeat attempts.) Save the file as RandomGuess.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Think of a number from 1 to 10");
		JOptionPane.showMessageDialog(null, "The number is " + (1 + (int)(Math.random() * 10)));

	}

}
