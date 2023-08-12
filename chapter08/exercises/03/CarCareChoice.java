/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 3a

Task:
Write an application for Chapa?s Car Care Shop that shows a user a list of available services: oil change,
tire rotation, battery check, or brake inspection. Allow the user to enter a string that corresponds to one
of the options, and display the option and its price as $25, $22, $15, or $5, accordingly. Display an error
message if the user enters an invalid item. Save the file as CarCareChoice.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.*;

public class CarCareChoice
{
	public static void main(String[] args)
	{
		String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
		double[] prices =   {25.0, 22.0, 15.0, 5.0};
		String servicesList = "";
		String entry;
		int userSelection = 0;
		boolean isFound = false;
		
		for(int i = 0; i < services.length; i ++)
			servicesList += services[i] + "\n";
		entry = JOptionPane.showInputDialog(null, "Select service:\n" + servicesList);
		for(int i = 0; i < services.length && !isFound; i++)
		{
			if(entry.equalsIgnoreCase(services[i]))
			{
				userSelection = i;
				isFound = true;
			}
		}
		if (isFound)
			JOptionPane.showMessageDialog(null, services[userSelection] +
					", price $" + prices[userSelection]);
		else
			JOptionPane.showMessageDialog(null, "Invalid selection");
	}
}
