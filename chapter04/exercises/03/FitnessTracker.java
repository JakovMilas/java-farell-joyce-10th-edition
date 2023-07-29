/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 3a

Task:
Create a FitnessTracker class that includes three data fields for a fitness
activity: a String for the name of the activity, an int for the number of
minutes spent participating, and a LocalDate for the date. The class includes
methods to get each field. Create a default constructor that automatically
sets the activity to running, the minutes to 0, and the date to January 1 of
the current year. Overload the constructor that receives parameters for each
of the fields and assigns them appropriately.
Save the file as FitnessTracker.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.time.*;

public class FitnessTracker {

	private String fitnessActivity;
	private int numberOfMinutes;
	private LocalDate date;

	public FitnessTracker() {
		fitnessActivity = "running";
		numberOfMinutes = 0;
		date = LocalDate.of(2023, 1, 1);
	}

	public FitnessTracker(String activity, int minutes, LocalDate date) {
		fitnessActivity = activity;
		numberOfMinutes = minutes;
		this.date = date;
	}

	public String getFitnessActivity() {
		return fitnessActivity;
	}
	public int getNumberOfMinutes() {
		return numberOfMinutes;
	}
	public LocalDate getDate() {
		return date;
	}

}
