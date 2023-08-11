import java.util.Scanner;

public class SortEmployees
{
	public static void main(String[] args)
	{
		final int NUM_EMPLOYEES = 5;	
		Employee[] emps = new Employee[NUM_EMPLOYEES];
		enterData(emps);
		System.out.println("Unsorted ");
		display(emps);
		System.out.println();
		bubbleSalarySort(emps);
		System.out.println("Bubble salary sort: ");
		display(emps);
		System.out.println();
		insertionEmpNumSort(emps);
		System.out.println("Insertion salary sort: ");
		display(emps);
	}
	public static void enterData(Employee[] emps)
	{
		Scanner input = new Scanner(System.in);	
		for(int i = 0; i < emps.length; i++)
		{
			emps[i] = new Employee();
			System.out.print("Enter employee number # >> ");
			emps[i].setEmpNum(input.nextInt());
			System.out.print("Enter last name >> ");
			input.nextLine();
			emps[i].setLastName(input.nextLine());
			System.out.print("Enter first name >> ");
			emps[i].setFirstName(input.nextLine());
			System.out.print("Enter salary >> ");
			emps[i].setSalary(input.nextDouble());
		}	
	}
	public static void display(Employee[] emps)
	{
		for(Employee e : emps)
		{
			System.out.println("#" + e.getEmpNum() + " " + e.getLastName() + " " +
						e.getFirstName() + "   $" + e.getSalary());	
		}	
	}
	public static void bubbleSalarySort(Employee[] emps)
	{
		int x, y;
		Employee temp;
		int comparisonsToMake = emps.length - 1;
		for(x = 0; x < emps.length - 1; x++)
		{
			for(y = 0; y < comparisonsToMake; y++)
			{
				if(emps[y].getSalary() > emps[y + 1].getSalary())
				{
					temp = emps[y];
					emps[y] = emps[y + 1];
					emps[y + 1] = temp;
					
				}
			}
			comparisonsToMake--;
		}	
	}
	public static void insertionEmpNumSort(Employee[] emps)
	{
		int x, y;
		Employee temp;
		x = 1;
		while(x < emps.length)
		{
			temp = emps[x];
			y = x - 1;
			while(y >= 0 && emps[y].getEmpNum() > temp.getEmpNum())
			{
				emps[y + 1] = emps[y];
				y--;	
			}
			emps[y + 1] = temp;
			x++;
		}	
	}
}
