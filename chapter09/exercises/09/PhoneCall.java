/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 9a

Task:
The Talk-A-Lot Cell Phone Company provides phone services for its customers. Create an abstract
class named PhoneCall that includes a String field for a phone number and a double field for
the price of the call. Also include a constructor that requires a phone number parameter and that sets
the price to 0.0. Include a set method for the price. Also include three abstract get methods?one
that returns the phone number, another that returns the price of the call, and a third that displays
information about the call. Save the file as PhoneCall.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public abstract class PhoneCall
{

	protected  String phoneNumber;
	protected double priceOfCall;

	public PhoneCall(String number)
	{
		phoneNumber = number;
		priceOfCall = 0.0;
	}
	public void setPriceOfCall(double price)
	{
		priceOfCall = price;
	}
	public abstract String getPhoneNumber();
	public abstract double getPriceOfCall();
	public abstract void display();
}
