/*
Farrel Joyce - Java Programming, 10th Edition (2023)

Chapter 05, exercise 6

Task:
Acme Parts runs a small factory and employs workers who are paid one of
three hourly rates depending on their shift: first shift, $17 per hour;
second shift, $18.50 per hour; third shift, $22 per hour. Each factory
worker might work any number of hours per week; any hours greater than
40 are paid at one and one-half times the usual rate. In addition,
second- and third-shift workers can elect to participate in the retirement
plan, for which 3 percent of the worker’s gross pay is deducted from the
paychecks. Write a program that prompts the user for hours worked and the
shift number; if the shift number is 2 or 3, prompt the user to enter the
worker’s choice to participate in the retirement plan. Display:
 (1) the hours worked
 (2) the shift
 (3) the hourly pay rate
 (4) the regular pay
 (5) overtime pay
 (6) the total of regular and overtime pay
 (7) the retirement deduction, if any, and
 (8) the net pay
Save the file as AcmePay.java.

Written by: Jakov Milas
https://github.com/JakovMilas/java-farell-joyce-10th-edition
*/


import java.util.Scanner;

public class AcmePay {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		final double FIRST_SHIFT_RATE = 17.0;
		final double SECOND_SHIFT_RATE = 18.50;
		final double THIRD_SHIFT_RATE = 22.0;
		final int REGULAR_WEEK_HOURS = 40;
		final double OVERTIME_RATE = 1.5;
		final double RETIREMENT_DEDUCTION = 0.03;
		boolean isRetirementPlan = false;
		int hoursWorked;
		int shift;
		double hourlyPayRate;
		double regularPay;
		double overtimePay = 0;
		double totalRegularAndOvertime = 0;
		double retirementDeduction = 0;
		double netPay;

		System.out.print("Enter hours worked >> ");
		hoursWorked = input.nextInt();
		System.out.print("Enter your shift >> ");
		shift = input.nextInt();
		if (shift == 2 || shift == 3) {
			System.out.print("Do you want a retirement plan (1 for yes) >> ");
			int retPlan = input.nextInt();;
			if (retPlan == 1)
				isRetirementPlan = true;
		}

		if (shift == 1)
			hourlyPayRate = FIRST_SHIFT_RATE;
		else
			if (shift == 2)
				hourlyPayRate = SECOND_SHIFT_RATE;
			else
				hourlyPayRate = THIRD_SHIFT_RATE;

		if (hoursWorked < REGULAR_WEEK_HOURS)
			regularPay = hoursWorked * hourlyPayRate;
		else {
			regularPay = REGULAR_WEEK_HOURS * hourlyPayRate;
			overtimePay = (hoursWorked - REGULAR_WEEK_HOURS) *
					hourlyPayRate * OVERTIME_RATE;
		}

		totalRegularAndOvertime = regularPay + overtimePay;
		if (isRetirementPlan) {
			retirementDeduction = totalRegularAndOvertime * RETIREMENT_DEDUCTION;
			netPay = totalRegularAndOvertime - retirementDeduction;
		}
		else
			netPay = totalRegularAndOvertime;

		System.out.println("\nHours worked: " + hoursWorked);
		System.out.println("Shift: " + shift + ". shift");
		System.out.println("Hourly pay rate: $" + hourlyPayRate);
		System.out.println("Regular pay: $" + regularPay);
		System.out.println("Overtime pay: $" + overtimePay);
		System.out.println("Total overtime and regular pay: $" +
							totalRegularAndOvertime);
		if (isRetirementPlan)
			System.out.println("Retirement deduction: $" + retirementDeduction);
		System.out.println("Net pay: $ " + netPay);

	}

}
