/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 2c

Task:
 Write an application that instantiates a Candle object and ScentedCandle object. Prompt the user for
values for each object. For the ScentedCandle, offer the user at least four choices for the scent, such
as gardenia, but you do not need to verify that the user enters one of the four choices. Display the details
for each Candle. Save the file as DemoCandles.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DemoCandles
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] scents = {"gardenia", "coconut", "vanilla", "cinnamon"};
		Candle candle = new Candle();
		ScentedCandle sCandle = new ScentedCandle();
		System.out.print("Enter color of a candle >> ");
		candle.setColor(input.nextLine());
		System.out.print("Enter height of a candle >> ");
		candle.setHeight(input.nextInt());
		System.out.print("Enter color of scented candle >> ");
		input.nextLine();
		sCandle.setColor(input.nextLine());
		System.out.print("Enter scented candle height >> ");
		sCandle.setHeight(input.nextInt());
		System.out.println("Enter candle scent:");
		for(String scent : scents)
			System.out.println(scent);
		System.out.print(" >> ");
		input.nextLine();
		sCandle.setScent(input.nextLine());

		System.out.println("Candle color " + candle.getColor() + ", height " +
				candle.getHeight() + ", price $" + candle.getPrice());
		System.out.println("Scented candle color " + sCandle.getColor() + ", height " +
				sCandle.getHeight() + ", scent " + sCandle.getScent() +
				" price $" + sCandle.getPrice());
	}
}
