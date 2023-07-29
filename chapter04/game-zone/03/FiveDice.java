/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Game Zone 3

Task:
Using the Die class, write an application that randomly “throws” five dice for
the computer and five dice for the player. Display the values and then, by
observing the results, decide who wins based on the following hierarchy of
Die values. (The computer will not decide the winner; the player will determine
the winner based on observation. Later, you will learn to program the determination
of the winner.) Any higher combination beats a lower one; for example, five of a
kind beats four of a kind.
 ❯❯ Five of a kind
 ❯❯ Four of a kind
 ❯❯ Three of a kind
 ❯❯ A pair
After you learn about decision making, you will be able to make the program
determine whether you or the computer had the better roll. For now, just observe
how the values change as you execute the program multiple times.
Save the application as FiveDice.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class FiveDice {

	public static void main(String[] args) {
	
		Die p1 = new Die();
		Die p2 = new Die();
		Die p3 = new Die();
		Die p4 = new Die();
		Die p5 = new Die();

		Die c1 = new Die();
		Die c2 = new Die();
		Die c3 = new Die();
		Die c4 = new Die();
		Die c5 = new Die();

		System.out.println("\nPlayer:   " + p1.getValue() + " " + p1.getValue() + " " +
						p3.getValue() + " " + p4.getValue() + " " + p5.getValue());
		System.out.println("Computer: " + c1.getValue() + " " + c2.getValue() + " " +
						c3.getValue() + " " + c4.getValue() + " " + c5.getValue());
	
	}

}
