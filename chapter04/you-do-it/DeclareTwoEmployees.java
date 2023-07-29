public class DeclareTwoEmployees {

	public static void main(String[] args) {

		Employee clerk = new Employee();
		Employee driver = new Employee();
		clerk.setEmpNum(345);
		driver.setEmpNum(567);
		System.out.println("\nThe clerk's number is " + clerk.getEmpNum() +
						   "\nand the driver's number is " + driver.getEmpNum());

	}

}
