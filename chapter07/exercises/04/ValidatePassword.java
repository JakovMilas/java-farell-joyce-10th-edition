/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 4

Task:
Write an application that prompts the user for a password that contains at least two
uppercase letters, at least three lowercase letters, and at least one digit. Continually
reprompt the user until a valid password is entered. Display a message indicating whether
the password is valid; if not, display the reason the password is not valid.
Save the file as ValidatePassword.java.
Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;

public class ValidatePassword {

	public static void main(String[] args) {

		String password;

		password = JOptionPane.showInputDialog(null, "Enter your password");

		while (!checkPassword(password)) {
			password = JOptionPane.showInputDialog(null, "Password must have at least\n" +
							"2 uppercase letters\n" +
							"3 lowercase letters\n" +
							"1 digit\n" +
							"Please try again, enter your password");
		}

		JOptionPane.showMessageDialog(null, "Password succesufully created");

	}

	public static boolean checkPassword(String password) {
		boolean isValidPassword = false;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int passwordLength = password.length();
		for (int i = 0; i < passwordLength; i++) {
			char c = password.charAt(i);
			if (Character.isDigit(c))
				digitCount++;
			else {
				if (Character.isLetter(c))
					if (Character.isLowerCase(c))
						lowerCaseCount++;
					else
						upperCaseCount++;
			}
		}
		System.out.println(upperCaseCount + " " + lowerCaseCount + " " + digitCount);

		if (upperCaseCount >= 2 && lowerCaseCount >= 3 && digitCount >= 1) {
			isValidPassword = true;
		}
		return isValidPassword;
	}

}
