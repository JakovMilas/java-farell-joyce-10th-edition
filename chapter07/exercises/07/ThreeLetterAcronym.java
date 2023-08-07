/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise 7

Task:
Three-letter acronyms are common in the business world. For example, in Java you use
the IDE (Integrated Development Environment) in the JDK (Java Development Kit) to write
programs used by the JVM (Java Virtual Machine) that you might send over a LAN
(local area network). Programmers even use the acronym TLA to stand for three-letter acronym.
Write a program that allows a user to enter three words, and display the appropriate
three-letter acronym in all uppercase letters. If the user enters more than three words,
ignore the extra words. Save the file as ThreeLetterAcronym.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;

public class ThreeLetterAcronym {

	public static void main(String[] args) {

		String str;
		char letter1 = ' ', letter2 = ' ', letter3 = ' ';
		int strLen;
		boolean isSecond = false;
		str = JOptionPane.showInputDialog(null, "Enter string to make acronym");
		strLen = str.length();

		for (int i = 0; i < strLen; i++) {
			char c = str.charAt(i);
			if (i == 0)
				letter1 = Character.toUpperCase(str.charAt(i));
			else
				if (c == ' ' && !isSecond) {
					letter2 = Character.toUpperCase(str.charAt(i + 1));
					isSecond = true;
			} else
				if (c == ' ' && isSecond) {
					letter3 = Character.toUpperCase(str.charAt(i + 1));
					i = strLen;
			}
		}

		JOptionPane.showMessageDialog(null, letter1 + "" + letter2 + "" + letter3);

	}

}
