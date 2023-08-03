import java.util.Scanner;

public class CustomerSurvey {

	public static void main(String[] args) {

		int rating;
		final int MIN = 1;
		final int MAX = 5;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a value that");
		System.out.println("represent your satisfaction with");
		System.out.println("our service.");
		System.out.println("Etner a value between " + MIN);
		System.out.println("and " + MAX);
		System.out.println("with " + MAX + " meaning highly");
		System.out.println("satisfied and");
		System.out.println(MIN + " meaning not at all saticfied.");
		System.out.print("Enter your rating >> ");
		rating = input.nextInt();

		while (rating < MIN || rating > MAX) {
			System.out.println("You must enter a value");
			System.out.println("between " + MIN + " and " + MAX);
			System.out.print("Please try again >> ");
			rating = input.nextInt();
		}

		System.out.println("Thank you.");

	}

}
