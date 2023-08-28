/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, exercise 6b

Task:
Create a subclass named DeliveryPizza that inherits from Pizza but adds a numeric delivery fee
and a String delivery address. The constructor?s parameters include the array of toppings, the delivery
address, and the number of toppings. The delivery fee is $3 if the Pizza ordered costs more than $18;
otherwise, the delivery fee is $5. Save the file as DeliveryPizza.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/



public class DeliveryPizza extends Pizza
{
	private double deliveryFee;
	private String deliveryAddress;

	public DeliveryPizza(String[] toppings, int numberOfToppings, String address)
	{
		super(toppings, numberOfToppings);
		deliveryAddress = address;
		
		if(price > 18)
			deliveryFee = 3;
		else
			deliveryFee = 5;
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nDelivery address: " + deliveryAddress + "\n" +
			"Delivery fee: $" + deliveryFee;
	}
}

