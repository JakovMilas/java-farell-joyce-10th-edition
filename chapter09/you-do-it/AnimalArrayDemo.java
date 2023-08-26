public class AnimalArrayDemo
{
	public static void main(String[] args)
	{
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cow();
		animals[2] = new Snake();
		for(int x = 0; x < animals.length; x++)
			animals[x].speak();
	}
}
