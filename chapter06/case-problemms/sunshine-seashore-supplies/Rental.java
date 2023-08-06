/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, Case Problems 2a

Task:
Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes,
beach chairs, and umbrellas to tourists. In Chapter 4, you created a
Rental class for the company. Now, make the following change to the class:
 ❯❯ Currently, a rental price is calculated as $40 per hour plus $1 for
    each minute over a full hour. This means that a customer who rents
    equipment for 41 or more minutes past an hour pays more than a customer
    who waits until the next hour to return the equipment. Change the price
	calculation so that a customer pays $40 for each full hour and $1 for
	each extra minute up to and including 40 minutes.
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
		this.contractNumber = contractNumber;
	}
	public void setHoursAndMinutes(int minutes) {
		hoursRented = minutes / MINUTES_IN_HOUR;
		minutesOverHourRented = minutes % MINUTES_IN_HOUR;
		if (minutesOverHourRented <= 40)
			price = (hoursRented * HOURLY_RENTAL_RATE) + (minutesOverHourRented * 1.0);
		else
			price = (hoursRented * HOURLY_RENTAL_RATE) + HOURLY_RENTAL_RATE;
	}

}
