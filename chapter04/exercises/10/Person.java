/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 10a

Task:
Create a class named Person that holds two String objects for the person’s
first and last name. Include a constructor that requires an argument for
each field. Include get methods for each field. Save the file as Person.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Person {

	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
