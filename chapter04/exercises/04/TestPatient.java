/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 4d

Task:
Create an application that declares three Patient objects. Use all default
values for one Patient object, prompt the user for values for the second
Patient object, and for the third object, prompt the user for Patient data
but use default values for that Patient’s BloodData.
Save the file as TestPatient.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

import java.util.Scanner;

public class TestPatient {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int id;
		int age;
		String type;
		String factor;
		Patient patient1, patient2, patient3;

		patient1 = new Patient();

		System.out.print("Enter patient's id number >> ");
		id = input.nextInt();
		System.out.print("Enter patient's age >> ");
		age = input.nextInt();
		System.out.print("Enter patient's blood type >> ");
		input.nextLine();
		type = input.nextLine();
		System.out.print("Enter patient's blood type RH factor >> ");
		factor = input.nextLine();

		patient2 = new Patient(id, age, type, factor);

		System.out.print("Enter another patient's ID number >> ");
		id = input.nextInt();
		System.out.print("Enter another patient's age >> ");
		age = input.nextInt();

		patient3 = new Patient(id, age);

		display(patient1);
		display(patient2);
		display(patient3);
	
	}

	public static void display(Patient patient) {
		System.out.println("\nPatient data:");
		System.out.println("ID: " + patient.getIdNumber());
		System.out.println("Age: " + patient.getAge());
		System.out.println("Blood data: " + patient.getBloodData().getBloodType() + "" +
						patient.getBloodData().getRhFactor());
	}

}
