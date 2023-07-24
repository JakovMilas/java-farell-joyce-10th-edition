import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a noun >> ");
		String noun = input.nextLine();

		System.out.print("Enter second noun >> ");
		String noun2 = input.nextLine();

		System.out.print("Enter an adjective >> ");
		String adjective = input.nextLine();

		System.out.print("Enter a verb >> ");
		String verb = input.nextLine();

		System.out.print("Enter an past-tense verb >> ");
		String pastTenseVerb = input.nextLine();

		String story = "Marry had a little " + noun + ".\n";
		story += "Its " + noun2 + " was " + adjective + " as snow.\n";
		story += "And everywhere that Mary " + pastTenseVerb + ".\n";
		story += "The " + noun + " was sure to go.";

		System.out.println(story);
	}
}
