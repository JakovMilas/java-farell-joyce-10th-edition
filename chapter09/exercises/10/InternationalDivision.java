/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 10b

Task:
Create two subclasses named InternationalDivision and DomesticDivision .
The InternationalDivision subclass includes a field for the country in which the
division is located and a field for the language spoken; its constructor requires both. The
DomesticDivision subclass includes a field for the state in which the division is located; a
value for this field is required by the constructor. Save the files as InternationalDivision.java and
DomesticDivision.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class InternationalDivision extends Division
{
	private String country;
	private String language;

	public InternationalDivision(String divisionName, int accountNumber,
			String country, String language)
	{
		super(divisionName, accountNumber);
		this.country = country;
		this.language = language;
	}
	@Override
	public void display()
	{
		System.out.println("\nDivision name: " + divisionName);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Country: " + country);
		System.out.println("Language: " + language);
	}
}
