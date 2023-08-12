class DisplayRents
{
	public static void main(String[] args)
	{
		int[][] rents = 
		{
			{400, 450, 510},
			{500, 560, 610},
			{625, 676, 740},
			{1000, 1250, 1600}
		};
		int floor;
		int bedrooms;
		for(floor = 0; floor < rents.length; floor++)
			for(bedrooms = 0; bedrooms < rents[floor].length; bedrooms++)
				System.out.println("Floor " + floor + " Bedrooms " +
					bedrooms + " Rents is $: " + rents[floor][bedrooms]);
	}
}
