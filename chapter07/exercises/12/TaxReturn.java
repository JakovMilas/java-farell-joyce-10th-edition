/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 12a

Task:
Create a TaxReturn class with fields that hold a taxpayer?s Social Security number, last name, first
name, street address, city, state, zip code, annual income, marital status, and tax liability. Include a
constructor that requires arguments that provide values for all the fields other than the tax liability. The
constructor calculates the tax liability based on annual income and marital status. The following table
shows the percentage of income that is taxed.

Income ($)          Single Status     Married Status
0?20,000            15%               14%
20,001?50,000       22%               20%
50,001 and over     30%               28%

In the TaxReturn class, also include a display method that displays all the TaxReturn data.
Save the file as TaxReturn.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class TaxReturn {

	private String socialSecurityNumber;
	private String lastName;
	private String firstName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private double annualIncome;
	private boolean maritalStatus;
	private double taxLiability;

	public TaxReturn(String ssn, String ln, String fn, String add, String ci, String st, String zc, double ai, boolean ms) {
	
		socialSecurityNumber = ssn;
		lastName = ln;
		firstName = fn;
		address = add;
		city = ci;
		state = st;
		zipCode = zc;
		annualIncome = ai;
		maritalStatus = ms;

		if (annualIncome > 0 && annualIncome < 20_000) {
			if (maritalStatus)
				taxLiability = 0.14;
			else
				taxLiability = 0.15;
		} else
			if (annualIncome > 20_000 && annualIncome < 50_000) {
				if (maritalStatus)
					taxLiability = 0.20;
				else
					taxLiability = 0.22;
		} else {
			if (maritalStatus)
				taxLiability = 0.28;
			else
				taxLiability = 0.30;
		}
	
	}

	public void displayTaxReturn() {
		System.out.println("\nTax return details:");
		System.out.println("Social security number: " + socialSecurityNumber);
		System.out.println("Last name : " + lastName);
		System.out.println("First name: " + firstName);
		System.out.println("Address: " + address);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("ZIP code: " + zipCode);
		System.out.println("Annual income: $" + annualIncome);
		System.out.print("Marital status: ");
		if (maritalStatus)
			System.out.println("married");
		else
			System.out.println("single");
		System.out.println("Tax liability: " + (taxLiability * 100) + "%");

	}

}
