/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 4a

Task:
Create a class named BloodData that includes String fields that hold a
blood type (the four blood types are O, A, B, and AB) and an Rh factor
(the factors are + and –). Create a default constructor that sets the
fields to O and + and an overloaded constructor that requires values
for both fields. Include get and set methods for each field.
Save this file as BloodData.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class BloodData {

	private String bloodType;
	private String rhFactor;

	public BloodData() {
		bloodType = "0";
		rhFactor = "+";
	}

	public BloodData(String bloodType, String rhFactor) {
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setRhFactor(String rhFactor) {
		this.rhFactor = rhFactor;
	}
	public String getRhFactor() {
		return rhFactor;
	}

}
