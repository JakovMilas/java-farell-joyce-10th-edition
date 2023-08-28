/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 6c

Task:
Write an application that prompts the user for topping values for a Pizza. Allow the user to continually
enter toppings until entering a QUIT constant or reaching 10 toppings. Also ask the user whether the
Pizza is to be delivered. If the Pizza is to be delivered, prompt the user for the delivery address and
construct a DeliveryPizza object; otherwise, construct a Pizza object. Then, display all the values
for the Pizza. Save the file as DemoPizza.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class DemoPizza
{
	public static void main(String[] args)
	{
		Pizza pizza;
		final String QUIT = "QUIT";
		String[] toppings = new String[10];
		String entry;;
		int numberOfToppings = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter topping for pizza or " + QUIT + " to exit >> ");
		entry = input.nextLine();

		while(numberOfToppings < toppings.length && !entry.equalsIgnoreCase(QUIT))
		{
			toppings[numberOfToppings] = entry;
			numberOfToppings++;
			System.out.print("Enter topping for pizza of " + QUIT + " to exit >> ");
			entry = input.nextLine();
		}

		System.out.print("Delivery for pizza? (yes/no) >> ");
		entry = input.nextLine();

		if(entry.equalsIgnoreCase("yes"))
		{
			System.out.print("Enter delivery address >> ");
			String address = input.nextLine();
			pizza = new DeliveryPizza(toppings, numberOfToppings, address);
		}
		else
		{
			pizza = new Pizza(toppings, numberOfToppings);
		}
		System.out.println(pizza.toString());
	}
}
