/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, exercise

Task:
Write an application that prompts the user for three first names and concatenates
them in every possible two- name combination so that new parents can easily compare
them to find the most pleasing baby name. Save the file as BabyNameComparison.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.JOptionPane;

public class BabyNameComparison {

	public static void main(String[] args) {

		String babyNames;
		String name1 = " ", name2 = " ", name3 = " ";
		int babyNamesLength;
		int wordCount = 0;
		int whitespace = 0;
		String nameCombinations = "";

		babyNames = JOptionPane.showInputDialog(null, "Enter three names for the baby");
		babyNamesLength = babyNames.length();

		for (int i = 0; i < babyNamesLength; i++) {
			char c = babyNames.charAt(i);
			if (c == ' ' && wordCount == 0) {
				name1 = babyNames.substring(whitespace, i);
				whitespace = i;
				wordCount++;

			} else
				if (c == ' ' && wordCount == 1) {
					name2 = babyNames.substring(whitespace + 1, i);
					whitespace = i;
					wordCount++;
				} else
					if (wordCount == 2)
						name3 = babyNames.substring(whitespace + 1, babyNamesLength);

		}

		nameCombinations += name1 + " " + name2 + "\n" +
						    name1 + " " + name3 + "\n" +
						    name2 + " " + name1 + "\n" +
						    name2 + " " + name3 + "\n" +
						    name3 + " " + name1 + "\n" +
						    name3 + " " + name2 + "\n";
		JOptionPane.showMessageDialog(null, "Name combinations:\n\n" + nameCombinations);

	}

}
