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


public class IgneousRock extends Rock
{
	public IgneousRock(int numberOfSamples, int weight)
	{
		super(numberOfSamples, weight);
		description = "Igneous rocks (from the Latin word for fire) form when hot,\n" +
			"	    molten rock crystallizes and solidifies.";
	}
}
