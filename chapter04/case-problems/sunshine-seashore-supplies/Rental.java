/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, Case Problems 2a

Task:
Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes,
beach chairs, and umbrellas to tourists. Create a Rental class for the
company. The Rental class contains the following:
 ❯❯ Two public final static fields that hold the number of minutes in an
    hour (60) and the hourly rental rate ($40).
 ❯❯ Four private fields that hold a contract number, number of hours for
    the rental, number of minutes over an hour, and the price. The contract
    number is stored as a String because the company plans to assign
	contract numbers such as K681.
 ❯❯ Two public set methods. One sets the contract number (setContractNumber()).
    The other is named setHoursAndMinutes(), and it accepts the number of
	minutes for the rental and then sets the hours, extra minutes over an hour,
	and the total price. For example, 70 minutes is 1 hour and 10 minutes.
	The total price is $40 per hour plus $1 for every extra minute.
 ❯❯ Four public get methods that return the values in the four nonstatic fields.
 ❯❯ A constructor that accepts a contract number and number of minutes as parameters.
    Pass these values to the setContractNumber() and setHoursAndMinutes() methods,
    respectively. The setHoursAndMinutes() method will automatically calculate the
    hours, extra minutes, and price.
 ❯❯ An overloaded default constructor that passes A000 and 0 to the two-parameter constructor.
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
		price = (hoursRented * HOURLY_RENTAL_RATE) + (minutesOverHourRented * 1.0);
	}

}
