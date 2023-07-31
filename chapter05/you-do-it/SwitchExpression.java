import java.util.Scanner;

public class SwitchExpression {

	public static void main(String[] args) {
	
		char deptCode;
		String deptName = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter character >> ");
		deptCode = input.nextLine().charAt(0);

		switch (deptCode) {
			case 'a', 'A' -> deptName = "Accounting";
			case 'm', 'M' -> deptName = "Marketing";
			default -> deptName = "Unknown";
		}

		System.out.println(deptName + " department");

		System.out.println("\nSwitch expression within a call to println()");

		System.out.println(switch (deptCode) {
			case 'a', 'A' -> "Accounting";
			case 'm', 'M' -> "Marketing";
			default -> "Unknown";
		} + " department.");

		System.out.println("\nA switch expression includding a block and a yield statement:");

		deptName = switch (deptCode) {
			case 'a', 'A' -> "Accountng";
			case 'm', 'M' -> {
				System.out.println("Note that the Marketing Department");
				System.out.println("is closed on Fridays");
				yield "Marketing";
			}
			default		  -> "Unknown";
		};
		System.out.println(deptName + " department.");
	
	}

}
