/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Game Zone 3

Task:
Dice are used in many games. One die can be thrown to randomly show a value
from 1 through 6. Design a Die class that can hold an integer data field for
a value (from 1 to 6). Include a constructor that randomly assigns a value to
a die object. For example, the following statement generates a random number
between LOWEST_DIE_VALUE (which should contain the value 1) and HIGHEST_DIE_VALUE
(which should contain the value 6) and assigns it to a variable.
randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
Also include a method in the class to return a Die’s value. Save the class as Die.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Die {

	private int value;
	private final int MIN = 1;
	private final int MAX = 6;

	public Die() {
		value = (int)(Math.random() * 100) % MAX + MIN;
	}

	public int getValue() {
		return value;
	}

}
