public class Employee {

	private int empNum;
	private double payRate;
	public final int MAX_EMP_NUM = 9999;
	public final double MAX_RATE = 60.00;

	public Employee (int num, double rate) {
		setEmpNum(num);
		setPayRate(rate);
	}

	public void setEmpNum(int num) {
		if (num <= MAX_EMP_NUM)
			empNum = num;
		else
			empNum = MAX_EMP_NUM;
	}

	public void setPayRate(double rate) {
		if (payRate <= MAX_RATE)
			payRate = rate;
		else
			payRate = 0;
	}

}
