/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 7a

Task:
Create a class named Rock that acts as a superclass for rock samples collected and catalogued by a
natural history museum. The Rock class contains fields for a number of samples, a description of the
type of rock, and the weight of the rock in grams. Include a constructor that accepts parameters for the
sample number and weight. The Rock constructor sets the description value to Unclassified. Include get
methods for each field. Save the file as Rock.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Rock
{
	private int numberOfSamples;
	protected String description;
	private int weight;

	public Rock(int numberOfSamples, int weight) {
		description = "Unclassified";
		this.numberOfSamples = numberOfSamples;
		this.weight = weight;
	}

	public int getNumberOfSamples()
	{
		return numberOfSamples;
	}
	public String getDescription()
	{
		return description;
	}
	public int getWeight()
	{
		return weight;
	}
}
