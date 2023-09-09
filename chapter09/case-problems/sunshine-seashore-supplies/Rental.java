/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 08, Case Problems 2a

Task:
	
In previous chapters, you developed classes that hold rental contract information for Sunshine Seashore
Supplies. Now modify the Rental class to include an integer field that holds an equipment type. Add
a final String array that holds names of the types of equipment that Sunshine rents?personal
watercraft, pontoon boat, rowboat, canoe, kayak, beach chair, umbrella, and other. Include get and set
methods for the integer equipment type field. If the argument passed to the method that sets the
equipment type is larger than the size of the array of String equipment types, then set the integer
to the element number occupied by other. Include a get method that returns a Rental?s String
equipment type based on the numeric equipment type. Save the file as Rental.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Rental {

	public static final int MINUTES_IN_HOUR = 60;
	public static final double HOURLY_RENTAL_RATE = 40.0;
	private String contractNumber;
	private int hoursRented;
	private int minutesOverHourRented;
	private double price;
	private String phoneNumber;
	int equipmentType;
	public static final String[] equipment = {"personal watercraft", "pontoon boat",
		"rowboat", "canoe", "kayak", "beach chair", "umbrella", "other"};

	public Rental(String contractNo, int minutes) {
		setContractNumber(contractNo);
		setHoursAndMinutes(minutes);
	}

	public Rental() {
		this("A000", 0);
	}

	public String getContractNumber() {
		return contractNumber;
	}
	public int getHoursRented() {
		return hoursRented;
	}
	public int getMinutesOverHourRented() {
		return minutesOverHourRented;
	}
	public double getPrice() {
		return price;
	}

	public void setContractNumber(String contractNumber) {
		if (contractNumber.length() == 4 && Character.isLetter(contractNumber.charAt(0)) &&
					   	    Character.isDigit(contractNumber.charAt(1)) &&
					   	    Character.isDigit(contractNumber.charAt(2)) &&
					   	    Character.isDigit(contractNumber.charAt(3)))
			this.contractNumber = Character.toUpperCase(contractNumber.charAt(0)) +
				contractNumber.substring(1, contractNumber.length());
		else
			this.contractNumber = "A000";
	}
	public void setHoursAndMinutes(int minutes) {
		hoursRented = minutes / MINUTES_IN_HOUR;
		minutesOverHourRented = minutes % MINUTES_IN_HOUR;
		if (minutesOverHourRented <= 40)
			price = (hoursRented * HOURLY_RENTAL_RATE) + (minutesOverHourRented * 1.0);
		else
			price = (hoursRented * HOURLY_RENTAL_RATE) + HOURLY_RENTAL_RATE;
	}

	public void setPhoneNumber(String phone) {
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < phone.length(); i++)
			if (Character.isDigit(phone.charAt(i)))
				strBuild.append(phone.charAt(i));
		phone = strBuild.toString();
		if (phone.length() == 10)
			this.phoneNumber = phone;
		else
			this.phoneNumber = "0000000000";
	}

	public String getPhoneNumber() {
		String phone = "(" + phoneNumber.substring(0, 3) + ") " +
			phoneNumber.substring(3, 6) + "-" +
			phoneNumber.substring(6, phoneNumber.length());
		return phone;
	}
	public void setEquipmentType(int type)
	{
		if(type >= equipment.length)
			type = equipment.length - 1;
		else	
			equipmentType = type;
	}
	public String getEquipmentType()
	{
		return equipment[equipmentType];
	}

}
