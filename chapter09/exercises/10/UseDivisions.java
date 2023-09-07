/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 10c

Task:
Write an application named UseDivision that creates a Division reference. Ask the user whether a
DomesticDivision or InternationalDivision object should be created. Prompt for appropriate
values and assign a new subclass object to the Division reference. Then display the details of the
created object. Save the file as UseDivision.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class UseDivisions
{
	public static void main(String[] args)
	{
		char choice;
		String divisionName = "";
		int accountNumber = 0;
		String state = "";
		String language = "";
		Scanner input = new Scanner(System.in);
		Division division = new DomesticDivision("", 0, "");

		System.out.print("Select:\nI - for international division\n" +
				"D - for domestic division\n >> ");
		choice = input.nextLine().toUpperCase().charAt(0);
		if(choice == 'D')
		{
			System.out.print("Enter divisioin name >> ");
			divisionName = input.nextLine();
			System.out.print("Enter account number >> ");
			accountNumber = input.nextInt();
			input.nextLine();
			System.out.print("Enter state >> ");
			state = input.nextLine();
			division = new DomesticDivision(divisionName, accountNumber, state);
		}
		if(choice == 'I')
		{
			System.out.print("Enter division name >> ");
			divisionName = input.nextLine();
			System.out.print("Enter account number >> ");
			accountNumber = input.nextInt();
			input.nextLine();
			System.out.print("Enter country >> ");
			state = input.nextLine();
			System.out.print("Enter language >> ");
			language = input.nextLine();
			division = new InternationalDivision(divisionName, accountNumber, state, language);
		}
		if(choice == 'D' || choice == 'I')
			division.display();
	}
}
