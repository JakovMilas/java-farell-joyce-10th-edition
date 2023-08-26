class ASuperClass
{
	public ASuperClass()
	{
		System.out.println("In superclass constructor");
	}
}
class ASubClass extends ASuperClass
{
	public ASubClass()
	{
		System.out.println("In subclass constructor");
	}
}
public class DemoConstructors
{
	public static void main(String[] args)
	{
		ASubClass child = new ASubClass();
	}
}
