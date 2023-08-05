/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 06, Game Zone 3

Task:
Many games use coin tosses, particularly to determine events such as which player
takes the first turn in a game. When you toss one coin, the probability of getting
“heads” is 50 percent. When you toss two coins, the probability of getting exactly
one “head” is also 50 percent. (The possible tosses are HH, HT, TH, and TT.) When
you toss four coins, is the probability of getting exactly two heads also 50
percent? Write a program that calculates the number of times exactly two heads come
up in 1,000 attempts in four random coin toss sets. Run the program multiple times
to ensure that your results are reasonably consistent, and then search the Internet
to get an additional check on your answer. Save the program as HeadsTails.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Random;

public class HeadTails {

	public static void main(String[] args) {

		Random random = new Random();
		int coin1, coin2, coin3, coin4;
		int headCount = 0;
		int twoHeadCount = 0;
		final int TOSS = 1000;
		double percent;

		for (int i = 0; i < TOSS; i++) {
			coin1 = random.nextInt(2);
			coin2 = random.nextInt(2);
			coin3 = random.nextInt(2);
			coin4 = random.nextInt(2);
			if (coin1 == 0)
				headCount++;
			if (coin2 == 0)
				headCount++;
			if (coin3 == 0)
				headCount++;
			if (coin4 == 0)
				headCount++;
			if (headCount == 2)
				twoHeadCount++;
			headCount = 0;
		}
		percent = (((double)twoHeadCount) / TOSS) * 100;
		System.out.printf("\nTwo head count: %d (%.1f%%)", twoHeadCount, percent);

	}

}
