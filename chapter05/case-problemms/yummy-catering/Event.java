/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Case Problems 1a

Task:
Yummy Catering provides meals for parties and special events. In Chapter 4,
you created an Event class for the company. Now, make the following changes
to the class:
 ❯❯ Currently, the class contains a constant for the price per guest ($35)
    that is used for every guest. Replace that constant field with two
	constant fields—a lower price per guest that is $32 and a higher price
	per guest that is $35.
 ❯❯ Add a new method named isLargeEvent() that returns true if the number
   of guests is 50 or greater and otherwise returns false.
 ❯❯ Modify the method that sets the number of guests so that a large Event
    (more than 50 guests) uses the lower price per guest to set the field
	that holds the price per guest and to calculate the total Event price.
    A small Event uses the higher price.
Save the file as Event.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class Event {

	public static final double LARGE_EVENT_PRICE_PER_GUEST = 32.0;
	public static final double SMALL_EVENT_PRICE_PER_GUEST = 35.0;
	public static final int CUTOFF_VALUE = 50;
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
		if (isLargeEvent(numberOfGuests))
			price = numberOfGuests * LARGE_EVENT_PRICE_PER_GUEST;
		else
			price = numberOfGuests * SMALL_EVENT_PRICE_PER_GUEST;
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

	public boolean isLargeEvent(int guests) {
		if (guests >= 50)
			return true;
		return false;
	}


}
