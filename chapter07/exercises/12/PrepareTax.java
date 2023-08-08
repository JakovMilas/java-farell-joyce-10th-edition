/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, exercise 12b

Task:
Create an application that prompts a user for the data needed to create a TaxReturn. Continue to
prompt the user for data as long as any of the following are true:
 - The Social Security number is not in the correct format, with digits and dashes in the appropriate
   positions - for example, 999-99-9999.
 - The zip code is not five digits.
 - The marital status does not begin with one of the following: S, s, M, or m.
 - The annual income is negative.
After each item of the input data is correct, create a TaxReturn object and then display its values.
Save the file as PrepareTax.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



import java.util.Scanner;

public class PrepareTax {

	public static void main(String[] args) {
	
		TaxReturn tax = enterTaxReturnData();
		tax.displayTaxReturn();
	
	}

	public static String enterSsnData() {
		String ssn;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter social security number >> ");
		ssn = input.nextLine();
		while (!isSsnFormated(ssn)) {
			System.out.print("Plese enter SSN in correct format\n" +
					 "999-99-9999 >> ");
			ssn = input.nextLine();
		}
		return ssn;
	}
	
	public static boolean isSsnFormated(String ssn) {
		if (ssn.length() == 11) {
			for (int i = 0; i < 3; i++) {
				if (!Character.isDigit(ssn.charAt(i)))
					return false;
			}
			if (ssn.charAt(3) != '-')
				return false;
			for (int i = 4; i < 6; i++)
				if (!Character.isDigit(ssn.charAt(i)))
				return false;
			if (ssn.charAt(6) != '-')
				return false;
			for (int i = 7; i < 11; i++)
				if (!Character.isDigit(ssn.charAt(i)))
					return false;
		} else
			return false;
		return true;
	}

	public static String enterZipData() {
		Scanner input = new Scanner(System.in);
		String zip;
		System.out.print("Enter ZIP code >> ");
		zip = input.nextLine();
		while (zip.length() != 5 || !checkIsDigit(zip)) {
			System.out.print("ZIP must have 5 digits, try again >> ");
			zip = input.nextLine();
		}
		return zip;
	}

	public static boolean checkIsDigit(String number) {
		for (int i = 0; i < number.length(); i++) {
			if (!Character.isDigit(number.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean enterMaritalStatusData() {
		Scanner input = new Scanner(System.in);
		char status;
		String userInput;
		System.out.print("Enter marital status, M for married, S for single >> ");
		userInput = input.nextLine();
		status = Character.toLowerCase(userInput.charAt(0));
		while (status != 'm' && status != 's') {
			System.out.print("Wrong input, try again M/S >> ");
			userInput = input.nextLine();
			status = Character.toLowerCase(userInput.charAt(0));
		}
		if (status == 'm')
			return true;
		return false;
	}

	public static double enterIncomeData() {
		Scanner input = new Scanner(System.in);
		double income;
		System.out.print("Enter annual income $ >> ");
		income = input.nextDouble();
		while (income < 0) {
			System.out.print("Please enter positive number for income >> ");
			income = input.nextDouble();
		}
		return income;
	}

	public static String enterStringData(String field) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter " + field + " >> ");
		String userInput = input.nextLine();
		return userInput;
	}

	public static TaxReturn enterTaxReturnData() {
		String ssn = enterSsnData();
		String lName = enterStringData("last name");
		String fName = enterStringData("first name");
		String address = enterStringData("address");
		String city = enterStringData("city");
		String state = enterStringData("state");
		String zip = enterZipData();
		double income = enterIncomeData();
		boolean marital = enterMaritalStatusData();
		TaxReturn tax = new TaxReturn(ssn, lName, fName, address, city, state, zip, income, marital);
		return tax;
	}

}
