/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Game Zone 3

Task:
Write an application that randomly “throws” two dice and displays their values.
Save the application as TwoDice.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class TwoDice {

	public static void main(String[] args) {
	
		Die die1 = new Die();
		Die die2 = new Die();

		System.out.println("\n" + die1.getValue() + " " + die2.getValue());
	
	}

}
