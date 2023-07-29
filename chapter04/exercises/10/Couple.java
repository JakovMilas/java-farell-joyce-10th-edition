/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 10b

Task:
Create a class named Couple that contains two Person objects that represent
a bride and a groom. Include a constructor that requires two Person objects.
Include two get methods that each return a Person. Save the file as Couple.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Couple {

	private Person bride;
	private Person groom;

	public Couple(Person bride, Person groom) {
		this.bride = bride;
		this.groom = groom;
	}

	public Person getBride() {
		return bride;
	}

	public Person getGroom() {
		return groom;
	}

}
