abstract class BankAccount
{
    	private String accountNumber;
    	protected double balance;

    	public BankAccount(String accountNumber, double balance) 
	{
        	this.accountNumber = accountNumber;
        	this.balance = balance;
    	}

    	public void displayAccountInfo()
	{
        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Balance: $" + balance);
    	}

    	abstract void calculateInterest();
}

class SavingsAccount extends BankAccount
{
    	private double interestRate = 0.05;

    	public SavingsAccount(String accountNumber, double balance)
	{
        	super(accountNumber, balance);
    	}

   	@Override
    	void calculateInterest()
	{
        	double interest = balance * interestRate;
        	System.out.println("Savings Interest Earned (5%): $" + interest);
    	}
}

class CheckingAccount extends BankAccount
{
    	private double interestRate = 0.01;

    	public CheckingAccount(String accountNumber, double balance)
	{
        	super(accountNumber, balance);
    	}

    	@Override
    	void calculateInterest()
	{
        	double interest = balance * interestRate;
        	System.out.println("Checking Interest Earned (1%): $" + interest);
    	}
}

public class Main
{
    	public static void main(String args[])
	{
        	BankAccount savings = new SavingsAccount("SA-101", 5000.00);
        	BankAccount checking = new CheckingAccount("CA-202", 2000.00);

        	System.out.println("--- Savings Account ---");
        	savings.displayAccountInfo();
        	savings.calculateInterest();

        	System.out.println("\n--- Checking Account ---");
        	checking.displayAccountInfo();
        	checking.calculateInterest();
    	}
}