import java.util.Scanner;

public class ElectionStatistics {

	public static void main(String[] args) {

		String party1Name;
		String party2Name;
		String party3Name;
		int party1Votes;
		int party2Votes;
		int party3Votes;
		int totalVotes;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first party name >> ");
		party1Name = input.nextLine();
		System.out.print("Enter number of votes for " + party1Name + " >> ");
		party1Votes = input.nextInt();
		input.nextLine();

		System.out.print("Enter second party name >> ");
		party2Name = input.nextLine();
		System.out.print("Enter number of votes for " + party2Name + " >> ");
		party2Votes = input.nextInt();
		input.nextLine();

		System.out.print("Enter third party name >> ");
		party3Name = input.nextLine();
		System.out.print("Enter number of votes for " + party3Name + " >> ");
		party3Votes = input.nextInt();

		totalVotes = party1Votes + party2Votes + party3Votes;

		System.out.println(party1Name + " received " + ((double) party1Votes / totalVotes * 100) + "% of the vote.");
		System.out.println(party2Name + " received " + ((double) party2Votes / totalVotes * 100) + "% of the vote.");
		System.out.println(party3Name + " received " + ((double) party3Votes / totalVotes * 100) + "% of the vote.");

	}

}
