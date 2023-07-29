/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 4b

Task:
Create an application named TestBloodData that declares two objects.
Prompt the user for values for one, and use the default constructor
values for the other. Display the details of both objects. Then change
the values in the default object so it uses the user’s values, and
display the details for the object again to confirm the changes are
made correctly. Save the application as TestBloodData.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TestBloodData {

	public static void main(String[] args) {
	
		String type;
		String factor;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter blood type >> ");
		type = input.nextLine();
		System.out.print("Enter RH factor >> ");
		factor = input.nextLine();

		BloodData blood1 = new BloodData(type, factor);
		BloodData blood2 = new BloodData();

		display(blood1);
		display(blood2);
	
	}

	public static void display(BloodData blood) {
		System.out.println("Blood data: " + blood.getBloodType() + "" + blood.getRhFactor());
	}

}
