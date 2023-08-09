/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 07, Case Problems 2a

Task:
Sunshine Seashore Supplies rents beach equipment to tourists. In previous chapters, you have developed
a Rental class that holds equipment rental information. Now modify the Rental class as follows:
 - Modify the method that sets the contract number in the Rental class so that if the argument passed
   to the method is not a four-character String that starts with a letter followed by three digits, then the
   contract number is forced to A000. If the initial letter in the contract number is not uppercase, force it
   to be so.
 - Add a contact phone number field to the Rental class.
 - Add a set method for the contact phone number field in the Rental class. Whether the user enters
   all digits or any combination of digits, spaces, dashes, dots, or parentheses for a phone number, store
   it as all digits. (Assume a phone number is 10 digits and does not require a leading digit that might
   be needed when dialing.) For example, if the user enters (920) 872-9182, store the phone number
   as 9208729182. If the user enters a number with fewer or more than 10 digits,store the number
   as 0000000000.
 - Add a get method for the phone number field. The get method returns the phone number as a String
   constructed as follows: parentheses surround a three-digit area code, followed by a space, followed
   by the three-digit phone exchange, followed by a hyphen, followed by the last four digits
   of the phonenumber.
Save the file as Rental.java.

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

}
