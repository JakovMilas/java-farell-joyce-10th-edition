/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 2a

Task:
Create a class named TestLease whose main() method declares four Lease
objects named lease1, lease2, lease3, and lease4. Create a getData()
method that prompts a user for values for each field for a Lease, and
return a newly constructed Lease object to the main() method, where it
is assigned to one of main()’s first three Lease objects. Do not prompt
the user for values for the fourth Lease object, but let it hold the
default values. After the four Lease objects have been assigned values,
pass the lease1 object to a showValues() method that displays the data.
Then call the addPetFee() method with the lease1 object, and confirm that
the fee explanation statement is displayed. Next, call the showValues()
method for the lease1 object again and confirm that the pet fee has been
added to the rent. Finally, call the showValues() method with each of the
other three objects. Confirm that three hold the values you supplied as
input and one holds the constructor default values.
Save the application as TestLease.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class TestLease {

	public static void main(String[] args) {
	
		Lease lease1 = new Lease();
		Lease lease2 = new Lease();
		Lease lease3 = new Lease();
		Lease lease4 = new Lease();

		lease1 = getData();
		lease2 = getData();
		lease3 = getData();

		showValues(lease1);
		lease1.addPetFee();
		showValues(lease1);
		showValues(lease2);
		showValues(lease3);
		showValues(lease4);
	
	}

	public static Lease getData() {
		Lease lease = new Lease();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter tenants name >> ");
		lease.setTenantName(input.nextLine());
		System.out.print("Enter apartment number >> ");
		lease.setApartmentNumber(input.nextInt());
		System.out.print("Enter monthly rent amount >> ");
		lease.setMonthlyRent(input.nextDouble());
		System.out.print("Enter term of lease >> ");
		lease.setTermOfLease(input.nextInt());
		return lease;
	}

	public static void showValues(Lease lease) {
		System.out.println("\nLease details:");
		System.out.println("Tenants name:     " + lease.getTenantName());
		System.out.println("Apartment number: " + lease.getApartmentNumber());
		System.out.println("Monthly rent amount: " + lease.getMonthlyRent());
		System.out.println("Term of lease:       " + lease.getTermOfLease());
	}

}
