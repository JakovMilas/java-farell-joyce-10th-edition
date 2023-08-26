public class CompareAccounts
{
	public static void main(String[] args)
	{
		BankAccount acct1 = new BankAccount(1234, 500.00);
		BankAccount acct2 = new BankAccount(1234, 500.00);
		if(acct1.equals(acct2))
			System.out.println("Accounts are equal");
		else
			System.out.println("Acccounts are not equal");

		BankAccount2 acct3 = new BankAccount2(2345, 100.00);
		BankAccount2 acct4 = new BankAccount2(2345, 100.00);
		if(acct3.equals(acct4))
			System.out.println("Accounts with overriden method are equal");
		else
			System.out.println("Accounts with overriden method are not equal");
	}
}
