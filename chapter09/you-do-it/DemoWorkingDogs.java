public class DemoWorkingDogs
{
	public static void main(String[] args)
	{
		WorkingDog aSheepHerder = new WorkingDog();
		WorkingDog aSeeingEyeDog = new WorkingDog();

		aSheepHerder.setName("Simom, the Border Collie");
		aSeeingEyeDog.setName("Sophie, the German Shepherd");
		aSheepHerder.setHoursOfTraining(40);
		aSeeingEyeDog.setHoursOfTraining(300);

		System.out.println(aSheepHerder.getName() + " says ");
		aSheepHerder.speak();
		aSheepHerder.work();
		System.out.println();

		System.out.println(aSeeingEyeDog.getName() + " says ");
		aSeeingEyeDog.speak();
		aSeeingEyeDog.work();
	}
}
