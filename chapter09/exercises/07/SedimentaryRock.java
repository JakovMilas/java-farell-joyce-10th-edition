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


public class SedimentaryRock extends Rock
{
	public SedimentaryRock(int numberOfSamples, int weight)
	{
		super(numberOfSamples, weight);
		description = "Sedimentary rocks are formed from deposits of pre-existing\n" +
			"	    rocks or pieces of once-living organism that accumulate on\n" + 
			"	    the Earth's surface. If sediment is buried deeply,\n" +
			"	    it becomes compacted and cemented, forming sedimentary rock.";
	}
}
