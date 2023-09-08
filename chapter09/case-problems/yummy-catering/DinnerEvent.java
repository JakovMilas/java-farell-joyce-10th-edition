/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Case Problems 1a

Task:
In Chapter 8, you created an Event class for Yummy Catering. Now extend the class to create a
DinnerEvent class. In the extended class, include four new integer fields that represent numeric
choices for an entr?e, two side dishes, and a dessert for each DinnerEvent object. Also include three
final arrays that contain String menu options for entr?es, side dishes, and desserts, and store at
least three choices in each array. Create a DinnerEvent constructor that requires arguments for an
event number and number of guests, and integer menu choices for one entr?e, two side dishes, and one
dessert. Pass the first two parameters to the Event constructor, and assign the last four parameters
to the appropriate local fields. Also include a getMenu() method that builds and returns a String
including the Strings for the four menu choices. Save the file as DinnerEvent.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class DinnerEvent extends Event
{
	private int entree;
	private int side1;
	private int side2;
	private int dessert;

	public static final String[] entrees = {"Spaghetti", "Fried Catfish", "Chicken"};
	public static final String[] sideDishes = {"Baked tomatoes with cheese", "Tuna salad", "Basmati rice"};
	public static final String[] desserts = {"Applepie", "Pancakes", "Some Cake"};

	public DinnerEvent(String eventNumber, int numberOfGuests, int entree, int side, int side2, int dessert)
	{
		super(eventNumber, numberOfGuests);
		this.entree = entree;
		this.side1 = side1;
		this.side2 = side2;
		this.dessert = dessert;
	}
	public String getMenu()
	{
		return ("Entree: " + entrees[entree] + "  Side dish 1: " + sideDishes[side1] +
				"  Side dish 2: " + sideDishes[side2] + "  Dessert: " + desserts[dessert]);
	}
}
