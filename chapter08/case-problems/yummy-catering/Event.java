/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Case Problems 1a

Task:

In previous chapters, you developed classes that work with catering event information for Yummy
Catering. Now modify the Event class to include an integer field that holds an event type. Add a final
String array that holds names of the types of events that Yummy caters?wedding, baptism, birthday,
corporate, and other. Include get and set methods for the integer event type field. If the argument passed
to the method that sets the event type is larger than the size of the array of String event types, then
set the integer to the element number occupied by other. Include a get method that returns an event?s
String event type based on the numeric event type.
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
	private int eventType;
	private String[] eventTypes = {"wedding", "baptism", "birthday", "corporate", "other"};

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
	public void setEventType(int type)
	{
		if(type < 0 || type >= eventTypes.length)
			eventType = 4;
		else
			eventType = type;
	}
	public String getEventType()
	{
		return eventTypes[eventType];
	}
}
