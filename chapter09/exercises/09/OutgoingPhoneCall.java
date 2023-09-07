/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 9b

Task:
Create two child classes of PhoneCall : IncomingPhoneCall and OutgoingPhoneCall. The
IncomingPhoneCall constructor passes its phone number parameter to its parent?s constructor
and sets the price of the call to 2 cents. The method that displays the phone call information
displays the phone number, the rate, and the price of the call (which is the same as the rate). The
OutgoingPhoneCall class includes an additional field that holds the time of the call in minutes.
The constructor requires both a phone number and the time. The price is 4 cents per minute,
and the display method shows the details of the call, including the phone number, the rate per
minute, the number of minutes, and the total price. Save the files as IncomingPhoneCall.java and
OutgoingPhoneCall.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class OutgoingPhoneCall extends PhoneCall
{
	private int callDuration;

	public OutgoingPhoneCall(String number, int duration)
	{
		super(number);
		setPriceOfCall(0.04);
		callDuration = duration;
	}
	@Override
	public void display()
	{
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Rate per minute: $" + priceOfCall);
		System.out.println("Call duration: " + callDuration + " min.");
		System.out.println("Total price: $" + (priceOfCall * callDuration));
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public double getPriceOfCall()
	{
		return priceOfCall;
	}
}
