public class TestBuilding
{
	public static void main(String[] args)
	{
		Building bldg = new Building("47 Oak Street", 600);
		System.out.println("The address is " + bldg.address());
		System.out.println("Square feet: " + bldg.squareFeet());
	}
}
