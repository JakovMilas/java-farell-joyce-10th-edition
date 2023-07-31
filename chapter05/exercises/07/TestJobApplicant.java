/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 7

Task:
Create an application that instantiates three JobApplicant objects in the
main() method. Pass each object, in turn, to a method that gets user data
for each field: the user enters Strings for the name and phone number, and
enters four integers that indicate whether the applicant possesses each of
the four skills. Return a complete JobApplicant object to the main() method.
After the objects are returned to the main() method, pass each to a boolean
method that determines whether an applicant is qualified for an interview
and returns true or false. A qualified applicant has at least three of the
four skills. Then, in the main() method, display a message that includes the
applicant’s name, phone number, and whether the applicant is qualified.
Save the application as TestJobApplicants.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TestJobApplicant {

	public static void main(String[] args) {

		JobApplicant ja1 = getApplicantData();
		JobApplicant ja2 = getApplicantData();
		JobApplicant ja3 = getApplicantData();

		displayApplicant(ja1);
		displayApplicant(ja2);
		displayApplicant(ja3);

	}

	public static JobApplicant getApplicantData() {
		String name, phone;
		boolean word = false, sheet = false, dbase = false, graph = false;
		int selectSkill;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter applicant name >> ");
		name = input.nextLine();
		System.out.print("Enter applicant's phone number >> ");
		phone = input.nextLine();
		System.out.print("Skill word (1 for yes) >> ");
		selectSkill = input.nextInt();
		if (selectSkill == 1)
			word = true;
		System.out.print("Skill spreadsheets (1 for yes) >> ");
		selectSkill = input.nextInt();
		if (selectSkill == 1)
			sheet = true;
		System.out.print("Skill databases (1 for yes) >> ");
		selectSkill = input.nextInt();
		if (selectSkill == 1)
			dbase = true;
		System.out.print("Skill graphics (1 for yes) >> ");
		selectSkill = input.nextInt();
		if (selectSkill == 1)
			graph = true;
		JobApplicant jb = new JobApplicant(name, phone, word,
						 sheet, dbase, graph);
		return jb;

	}

	public static boolean checkIsQualified(JobApplicant ja) {
		int count = 0;
		boolean isQualified = false;
		if (ja.getIsWord())
			count = count + 1;
		if (ja.getIsSpreadsheets())
			count = count + 1;
		if (ja.getIsDatabases())
			count = count + 1;
		if (ja.getIsGraphics())
			count = count + 1;

		if (count >= 3)
			isQualified = true;
		return isQualified;
	}

	public static void displayApplicant(JobApplicant ja) {
		System.out.println("\nApplicant " + ja.getName());
		System.out.println("Phone number: " + ja.getPhoneNumber());
		System.out.println("Qualified: " + checkIsQualified(ja));
	}

}
