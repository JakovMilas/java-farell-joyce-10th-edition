public class WorkingDog extends Dog implements Worker
{
	private int hoursOfTraining;
	public void setHoursOfTraining(int hrs)
	{
		hoursOfTraining = hrs;
	}
	public int getHoursOfTraining()
	{
		return hoursOfTraining;
	}
	public void work()
	{
		speak();
		System.out.println("i am a dog who workds");
		System.out.println("I have " + hoursOfTraining +
				" hours of professional training");
	}
}
