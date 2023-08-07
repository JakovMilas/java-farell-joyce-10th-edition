/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 01

Task:
Modify the CharacterInfo class shown in Figure 7-3 so that the tested character is
retrieved from user input. Save the file as InputCharacterInfo.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import javax.swing.JOptionPane;

public class InputCharacterInfo {

	public static void main(String[] args) {

		char aChar;
		String userInput;
		String message = "";

		userInput = JOptionPane.showInputDialog(null, "Enter one character");
		aChar = userInput.charAt(0);
		JOptionPane.showMessageDialog(null, "The character is " + aChar);
		if (Character.isUpperCase(aChar))
			message += aChar + " is uppercase\n";
		else
			message +=  aChar + " is not uppercase\n";
		
		if (Character.isLowerCase(aChar))
			message += aChar + " is lowercase\n";
		else
			message += aChar + " is not lowercase\n";

		aChar = Character.toLowerCase(aChar);
		message += "After toLowerCsae(), aChar is " + aChar + "\n";
		aChar = Character.toUpperCase(aChar);
		message += "After toUpperCase(), aChar is " + aChar + "\n";;
		if (Character.isLetterOrDigit(aChar))
			message += aChar + " is letter or digit\n";
		else
			message += aChar + " is neither a letter nor a digit\n";
		if (Character.isWhitespace(aChar))
			message += aChar + " is whitespace\n";
		else
			message += aChar + " is not whitespace\n";
		
		JOptionPane.showMessageDialog(null, message);

	}

}
