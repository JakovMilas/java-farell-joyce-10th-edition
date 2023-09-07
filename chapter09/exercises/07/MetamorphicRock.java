/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 7b

Task:
Create three child classes named IgneousRock, SedimentaryRock, and MetamorphicRock.
The constructors for these classes require parameters for the sample number and weight. Search the
Internet for a brief description of each rock type and assign it to the description field. Save the files as
IgneousRock.java, SedimentaryRock.java, and MetamorphicRock.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class MetamorphicRock extends Rock
{
	public MetamorphicRock(int numberOfSamples, int weight)
	{
		super(numberOfSamples, weight);
		description = "Metamorphic rocks form when rocks are subjected to high heat,\n" +
			"	    high pressure, hot mineral-rich fluids or, more commonly,\n" +
			"	    some combination of these factors.";
	}
}
