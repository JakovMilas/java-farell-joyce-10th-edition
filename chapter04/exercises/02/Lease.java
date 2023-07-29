/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 04, exercise 02a

Task:
Create a class named Lease with fields that hold an apartment tenant’s name,
apartment number, monthly rent amount, and term of the lease in months.
Include a default constructor that initializes the name to XXX, the apartment
number to 0, the rent to 1000, and the term to 12. Also include methods to get
and set each of the fields. Include a nonstatic method named addPetFee() that
adds $10 to the monthly rent value and calls a static method named
explainPetPolicy() that explains the pet fee. Save the class as Lease.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


public class Lease {

	private String tenantName;
	private int apartmentNumber;
	private double monthlyRent;
	private int termOfLease;

	public Lease() {
		tenantName = "XXX";
		apartmentNumber = 0;
		monthlyRent = 1000.0;
		termOfLease = 12;
	}

	public void setTenantName(String name) {
		tenantName = name;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setApartmentNumber(int number) {
		apartmentNumber = number;
	}
	public int getApartmentNumber() {
		return apartmentNumber;
	}
	public void setMonthlyRent(double rent) {
		monthlyRent = rent;
	}
	public double getMonthlyRent() {
		return monthlyRent;
	}
	public void setTermOfLease(int term) {
		termOfLease = term;
	}
	public int getTermOfLease() {
		return termOfLease;
	}

	public void addPetFee() {
		monthlyRent = monthlyRent + 10.0;
		explainPetPolicy();
	}

	public void explainPetPolicy() {
		System.out.println("\nAdded $10.0 fee for having a pet.");
	}

}
