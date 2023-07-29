/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 4c

Task:
Create a class named Patient that includes an ID number, age, and BloodData.
Provide a default constructor that sets the ID number to 0, the age to 0,
and the BloodData values to the default BloodData values (O and +). Create
an overloaded constructor that provides values for each field.
Also provide get methods for each field. Save the file as Patient.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Patient {

	private int idNumber;
	private int age;
	BloodData bloodData;

	public Patient() {
		idNumber = 0;
		age = 0;
		bloodData = new BloodData();
	}

	public Patient(int id, int age, String type, String factor) {
		idNumber = idNumber;
		this.age = age;
		bloodData = new BloodData(type, factor);
	}

	public Patient(int id, int age) {
		idNumber = id;
		this.age = age;
		bloodData = new BloodData();
	}

	public int getIdNumber() {
		return idNumber;
	}
	public int getAge() {
		return age;
	}
	public BloodData getBloodData() {
		return bloodData;
	}

}
