public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] numbers = {88, 22, 99, 72, 44, 31, 64};
		display(numbers);
		bubbleSort(numbers);
		display(numbers);
	}

	public static void display(int[] numbers)
	{
		for(int n : numbers)
			System.out.print(n + " ");
		System.out.println();	
	}

	public static void bubbleSort(int[] numbers)
	{
		int x, y, temp;
		int comparisonsToMake = numbers.length - 1;
		for(x = 0; x < numbers.length - 1; x++)
		{
			for(y = 0; y < comparisonsToMake; y++)
			{
				if(numbers[y] > numbers[y + 1])
				{
					temp = numbers[y];
					numbers[y] = numbers[y + 1];
					numbers[y + 1] = temp;	
				}
			}
			comparisonsToMake--;
		}
			
	}
}
