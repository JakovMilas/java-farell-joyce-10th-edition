/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 10c

Task:
Create a class named Wedding for a wedding planner. The class includes
the date of the wedding, the names of the Couple being married, and a
String for the location (for example, Smalltown VFW Hall). Provide a
constructor that requires a Couple, a LocalDate, and a String that contains
data about a Wedding event. Include get methods that return the Couple,
the LocalDate, and the String that represents the location.
Save the file as Wedding.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.time.*;

public class Wedding {

	private Couple couple;
	private LocalDate date;
	private String location;

	public Wedding(Couple couple, LocalDate date, String location) {
		this.couple = couple;
		this.date = date;
		this.location = location;
	}

	public Couple getCouple() {
		return couple;
	}
	public LocalDate getDate() {
		return date;
	}
	public String getLocation() {
		return location;
	}

}
