/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 11b

Task:
Create a child class named ElectricBlanket that extends Blanket and includes two additional
fields: one for the number of heat settings and one for whether the ElectricBlanket has an
automatic shutoff feature. Default values are one heat setting and no automatic shutoff. Include get and
set methods for the fields. Do not allow the number of settings to be fewer than one or more than five; if
it is, use the default setting of 1. Add a $5.75 premium to the price if the blanket has the automatic shutoff
feature. Also include a toString() method that calls the parent class toString() method and
combines the returned value with data about the new fields to return a complete description of features.
Save the file as ElectricBlanket.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class ElectricBlanket extends Blanket
{
	private int numberOfHeatSettings;
	private boolean isAutoShutoff;

	public ElectricBlanket()
	{
		numberOfHeatSettings = 1;
		isAutoShutoff = false;
	}

	public void setNumberOfHeatSettings(int number)
	{
		if(number < 1 || number > 5)
			numberOfHeatSettings = 1;
		else
			numberOfHeatSettings = number;
	}
	public int getNumberOfHeatSettings()
	{
		return numberOfHeatSettings;
	}
	public void setIsAutoShutoff(boolean autoOff)
	{
		isAutoShutoff = autoOff;
		if(autoOff)
			price += 5.75;
			
	}
	public boolean getIsAutoShutoff()
	{
		return isAutoShutoff;
	}

	public String toString()
	{
		return (super.toString() + "\nNumber of heat settings: " + getNumberOfHeatSettings() +
				"\nAuto shutoff: " + getIsAutoShutoff());
	}
}
