/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 11c

Task:
Create an application that creates a Blanket and displays the starting values. Then, continually
prompt the user for a Blanket material. Display the values, prompt the user for a size, and display
the values again. Continue to get new material and size values until a sentinel value is entered.
Then do the same for an ElectricBlanket, including allowing the user to change the number
of settings and whether the ElectricBlanket has the automatic shutoff feature. Save the file as
DemoBlankets.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;

public class DemoBlankets
{
	public static void main(String[] args)
	{
		String SENTINEL = "quit";
		String entry;
		Blanket blanket = new Blanket();
		ElectricBlanket elBlanket = new ElectricBlanket();
		Scanner input = new Scanner(System.in);
		System.out.println(blanket.toString());

		System.out.print("Enter material (cotton, wool, cashmere) or " + SENTINEL + " to exit >> ");
		entry = input.nextLine().toLowerCase();
		while(!entry.equals(SENTINEL))
		{
			blanket.setMaterial(entry);
			System.out.println(blanket.toString());
			System.out.print("Enter blanket size (twin, double, queen, king) or " + SENTINEL + " to exit >> ");
			entry = input.nextLine();
			if(!entry.equals(SENTINEL))
			{
				blanket.setSize(entry);
				System.out.println(blanket.toString());
				blanket = new Blanket();
				System.out.print("Enter material (cotton, wool cashmere) or " + SENTINEL + " to exit >> ");
				entry = input.nextLine();
			}
		}
		System.out.print("Enter material for electric blanket (cotton, wool, cashmere) or "
				+ SENTINEL + " to exit >> ");
		entry = input.nextLine();
		while(!entry.equals(SENTINEL))
		{
			elBlanket.setMaterial(entry);
			System.out.println(elBlanket.toString());
			System.out.print("Enter electric blanket size (twin, double, queen, king) or "
					+ SENTINEL + " to exit >> ");
			entry = input.nextLine();
			if(!entry.equals(SENTINEL))
			{
				elBlanket.setSize(entry);
				System.out.println(elBlanket.toString());
				System.out.print("Enter number of heat settings (1 - 5) or "
						+ SENTINEL + " to exit >> ");
				entry = input.nextLine();
				if(!entry.equalsIgnoreCase(SENTINEL))
				{
					elBlanket.setNumberOfHeatSettings(Integer.parseInt(entry));
					System.out.println(elBlanket.toString());
					System.out.print("Does electric blanket have auto shuttoff (yes, no) or "
							+ SENTINEL + " to exit >> ");
					entry = input.nextLine();
					if(entry.startsWith("y"))
						elBlanket.setIsAutoShutoff(true);
					else
						elBlanket.setIsAutoShutoff(false);
					System.out.println(elBlanket.toString());
					elBlanket = new ElectricBlanket();
					System.out.print("Enter material for electrinc blanket (cotton, wool, cashmere) or "
							+ SENTINEL + " to exit >> ");
					entry = input.nextLine();
				}
			}
		}
	}
}
