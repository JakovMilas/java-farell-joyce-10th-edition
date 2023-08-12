/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, exercise 3b

Task:
It might not be reasonable to expect users to type long entries such as oil change accurately. Modify
the CarCareChoice class so that as long as the user enters the first three characters of a service, the
choice is considered valid. Save the file as CarCareChoice2.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import javax.swing.*;

public class CarCareChoice2
{
	public static void main(String[] args)
	{
		String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
		double[] prices = {25.0, 22.0, 15.0, 5.0};
		String servicesList = "";
		String entry;
		int userSelection = 0;
		boolean isFound = false;
		
		for(int i = 0; i < services.length; i ++)
			servicesList += services[i] + "\n";
		entry = JOptionPane.showInputDialog(null, "Select service:\n" + servicesList);
		entry = entry.toLowerCase();
		for(int i = 0; i < services.length && !isFound; i++)
		{
			if(entry.startsWith(services[i].substring(0, 3)))
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
