/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Case Problems 1a

Task:
Yummy Catering provides meals for parties and special events. In previous chapters, you have developed
an Event class that holds catering event information. Now modify the Event class as follows:
 - Modify the method that sets the event number in the Event class so that if the argument passed to the
   method is not a four-character String that starts with a letter followed by three digits, then the event
   number is forced to A000. If the initial letter in the event number is not uppercase, force it to be so.
 - Add a contact phone number field to the Event class.
 - Add a set method for the contact phone number field in the Event class. Whether the user enters all
   digits or any combination of digits, spaces, dashes, dots, or parentheses for a phone number, store
   it as all digits. (Assume a phone number is 10 digits and does not require a leading digit that might
   be needed when dialing.) For example, if the user enters (920) 872-9182, store the phone number
   as 9208729182. If the user enters a number with fewer or more than 10 digits,
   store the number as 0000000000.
 - Add a get method for the phone number field. The get method returns the phone number as a String
   constructed as follows: parentheses surround a three-digit area code, followed by a space, followed
   by the three-digit phone exchange, followed by a hyphen, followed by the last four digits of the
   phone number.
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
	private String phoneNumber;

	public Event(String eventNumber, int numberOfGuests) {
		setEventNumber(eventNumber);
		setNumberOfGuests(numberOfGuests);
	}

	public Event() {
		this("A000", 0);
	}

	public void setEventNumber(String eventNumber) {
		if(eventNumber.length() == 4 && Character.isLetter(eventNumber.charAt(0)) &&
						Character.isDigit(eventNumber.charAt(1)) &&
						Character.isDigit(eventNumber.charAt(2)) &&
						Character.isDigit(eventNumber.charAt(3))) {
		eventNumber = Character.toUpperCase(eventNumber.charAt(0)) +
				eventNumber.substring(1, eventNumber.length());
		this.eventNumber = eventNumber;
		} else
			this.eventNumber = "A000";
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

	public void setPhoneNumber(String phoneNumber) {
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < phoneNumber.length(); i++)
			if (Character.isDigit(phoneNumber.charAt(i)))
				strBuild.append(phoneNumber.charAt(i));
		phoneNumber = strBuild.toString();
		if (phoneNumber.length() == 10)
			this.phoneNumber = phoneNumber;
		else
			this.phoneNumber = "0000000000";
	}

	public String getPhoneNumber() {
		String  phone = "(" + phoneNumber.substring(0, 3) + ") " +
			phoneNumber.substring(3, 6) + "-" +
			phoneNumber.substring(6, phoneNumber.length());
		return phone;
	}


}
