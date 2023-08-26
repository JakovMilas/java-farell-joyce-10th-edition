public class BankAccount2
{
	private int acctNum;
	private double balance;
	public BankAccount2(int num, double bal)
	{
		acctNum = num;
		balance = bal;
	}
	@Override
	public String toString()
	{
		String info = "BankAccount acctNum = " + acctNum +
			"    Balance = $" + balance;
		return info;
	}
	@Override
	public boolean equals(Object obj)
	{
		boolean result;
		if(obj == this)
			result = true;
		else
			if(obj == null)
				return false;
			else
				if(obj.getClass() != this.getClass())
					result = false;
		BankAccount2 secondAcct = (BankAccount2)obj;
		if(acctNum == secondAcct.acctNum && balance == secondAcct.balance)
			result = true;
		else
			result = false;
		return result;
	}
}
