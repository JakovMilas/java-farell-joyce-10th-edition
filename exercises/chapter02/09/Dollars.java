import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {

		int dollars;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter amount of dollars >> ");
		dollars = input.nextInt();

		System.out.println("$" + dollars + " denominatiions:");
		System.out.println((dollars / 20) + " of 20 dollars denominations");
		System.out.println((dollars % 20 / 10) + " of 10 dollars denominations");
		System.out.println((dollars % 20 % 10 / 5) + " of 5 dollars denominations");
		System.out.println((dollars % 20 % 10 % 5) + " of 1 dollar denominations");

	}

}
