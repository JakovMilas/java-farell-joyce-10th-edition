/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 4a

Task:
Create a Die class from which you can instantiate an object containing a random value from 1 through 6. The constructor sets the value.
Include a method to return the value. Save the file as Die.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



public class Die {
	
	private int value;

	public Die() {
		value = (int)(Math.random() * 6) + 1;
	}

	public int getValue() {
		return value;
	}

}
