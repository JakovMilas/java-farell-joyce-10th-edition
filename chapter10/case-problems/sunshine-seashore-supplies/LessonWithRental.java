/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 09, Case Problems 2a

Task:
In Chapter 8, you created a Rental class for Sunshine Seashore Supplies. Now extend the class to
create a LessonWithRental class. In the extended class, include a new boolean field that indicates
whether a lesson is required or optional for the type of equipment rented. Also include a final array
that contains Strings representing the names of the instructors for each of the eight equipment types,
and store names that you choose in the array. Create a LessonWithRental constructor that requires
arguments for a contract number, minutes for the rental, and an integer equipment type. Pass the first
two parameters to the Rental constructor, and assign the last parameter to the equipment type. For the
first two equipment types (personal watercraft and pontoon boat), set the boolean lesson required field
to true; otherwise, set it to false. Also include a getInstructor() method that builds and returns
a String including the String for the equipment type, a message that indicates whether a lesson is
required, and the instructor?s name. Save the file as LessonWithRental.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/

public class LessonWithRental extends Rental
{
	private boolean isLessonRequired = false;
	public final static String[] instructors = {"Johnson", "Jenna", "Michael", "Kate", "Maria",
						    "Don", "George", "Helena"};

	public LessonWithRental(String contractNumber, int minutesRented, int equipmentType)
	{
		super(contractNumber, minutesRented);
		setEquipmentType(equipmentType);
		if(equipmentType == 0 || equipmentType == 1)
			isLessonRequired = true;
	}
	public String getInstructor()
	{
		return ("Equipment type: " + getEquipmentType() + "\n" +
			"Is lessons required: " + isLessonRequired + "\n" +
			"Instructor: " + instructors[equipmentType]);
	}
}
