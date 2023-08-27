/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 3b

Task:
Create a subclass named CustomTee that descends from TeeShirt and includes a field to hold
the slogan requested for the shirt. Include get and set methods for this field.
Save the file as CustomTee.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class CustomTee extends TeeShirt
{
	private String slogan;

	public void setSlogan(String slogan)
	{
		this.slogan = slogan;
	}
	public String getSlogan()
	{
		return slogan;
	}
}
