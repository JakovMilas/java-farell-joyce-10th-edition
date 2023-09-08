/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 14b

Task:
Create classes called Machine, Athlete, and PoliticalCandidate that all implement Runner.
The run() method displays a message describing the meaning of run to each class. Save the files as
Machine.java, Athlete.java, and PoliticalCandidate.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class Machine implements Runner
{
	@Override
	public String run()
	{
		return "Machine is running.";
	}
}
