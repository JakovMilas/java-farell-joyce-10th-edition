import java.util.Scanner;

public class DemoAnonymousClass
{
	public static void main(String[] args)
	{
		int pounds;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter capacity for washing machine" +
				" in pounds of laundry >> ");
		pounds = input.nextInt();
		Worker washingMachine = new Worker()
		{
			public void work()
			{
				System.out.println("i get clothes clean");
				System.out.println(" and can handle " + pounds +
						"pounds of laundry at a time.");
			}
		};
		washingMachine.work();
	}
}
