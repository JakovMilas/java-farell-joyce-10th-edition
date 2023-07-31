/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 7

Task:
Create a class named JobApplicant that holds data about a job applicant.
Include a name, a phone number, and four Boolean fields that represent
whether the applicant is skilled in each of the following areas: word
processing, spreadsheets, databases, and graphics. Include a constructor
that accepts values for each of the fields. Also include a get method
for each field. Save the class as JobApplicant.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class JobApplicant {

	private String name;
	private String phoneNumber;
	private boolean isWord;
	private boolean isSpreadsheets;
	private boolean isDatabases;
	private boolean isGraphics;

	public JobApplicant(String name,
						String phoneNumber,
						boolean isWord,
						boolean isSpreadsheets,
						boolean isDatabases,
						boolean isGraphics) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.isWord = isWord;
		this.isSpreadsheets = isSpreadsheets;
		this.isDatabases = isDatabases;
		this.isGraphics = isGraphics;
	}

	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public boolean getIsWord() {
		return isWord;
	}
	public boolean getIsSpreadsheets() {
		return isSpreadsheets;
	}
	public boolean getIsDatabases() {
		return isDatabases;
	}
	public boolean getIsGraphics() {
		return isGraphics;
	}

}
