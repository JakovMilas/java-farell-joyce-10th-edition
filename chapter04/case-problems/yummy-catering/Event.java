/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Case Problems 1a

Task:
Create a class to hold Event data for Yummy Catering. The class contains the following:
 ❯❯ Two public final static fields that hold the price per guest ($35) and the
 cutoff value for a large event (50 guests).
 ❯❯ Three private fields that hold an event number, number of guests for the event,
    and the price. The event number is stored as a String because the company plans to
    assign event numbers such as M312. 
 ❯❯ Two public set methods that set the event number (setEventNumber()) and the number
    of guests (setGuests()). The price does not have a set method because the
	setGuests() method will calculate the price as the number of guests multiplied by
	the price per guest every time the number of guests is set.
 ❯❯ Three public get methods that return the values in the three nonstatic fields.
 ❯❯ A constructor that accepts an event number and number of guests as parameters.
    Pass these values to the setEventNumber() and setGuests() methods, respectively.
    The setGuests() method will automatically calculate the event price.
 ❯❯ Another constructor that is a default constructor that passes A000 and 0 to the
    two-parameter constructor.
Save the file as Event.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class Event {

	public final static double PRICE_PER_GUEST = 35.0;
	public final static int CUTOFF_VALUE = 50;
	private String eventNumber;
	private int numberOfGuests;
	private double price;

	public Event(String eventNumber, int numberOfGuests) {
		setEventNumber(eventNumber);
		setNumberOfGuests(numberOfGuests);
	}

	public Event() {
		this("A000", 0);
	}

	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
		price = this.numberOfGuests * PRICE_PER_GUEST;
	}
	public String getEventNumber() {
		return eventNumber;
	}
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	public double getPrice() {
		return price;
	}


}
