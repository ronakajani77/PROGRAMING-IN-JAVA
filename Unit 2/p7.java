interface PaymentGateway
{
    	void processPayment(double amount);
    	String getReceipt();

    	default void logTransaction(double amount)
	{
        	System.out.println("[LOG] Transaction initiated for amount: $" + amount);
    	}
}

class CreditCardPayment implements PaymentGateway
{
    	private String cardNumber;
    	private String transactionId;

    	public CreditCardPayment(String cardNumber)
	{
        	this.cardNumber = cardNumber;
    	}

    	@Override
    	public void processPayment(double amount)
	{
        	logTransaction(amount);
        	this.transactionId = "CC-" + (int)(Math.random() * 100000);
        	System.out.println("Processing credit card payment of $" + amount + " using card ending in " + cardNumber.substring(cardNumber.length() - 4));
    	}

    	@Override
    	public String getReceipt()
	{
        	return "Receipt ID: " + transactionId + " (Paid via Credit Card)";
    	}
}

class UpiPayment implements PaymentGateway
{
    	private String upiId;
    	private String transactionId;

    	public UpiPayment(String upiId)
	{
        	this.upiId = upiId;
    	}

    	@Override
    	public void processPayment(double amount)
	{
        	logTransaction(amount);
        	this.transactionId = "UPI-" + (int)(Math.random() * 100000);
        	System.out.println("Processing UPI payment of $" + amount + " via ID: " + upiId);
    	}

    	@Override
    	public String getReceipt()
	{
        	return "Receipt ID: " + transactionId + " (Paid via UPI)";
    	}
}

public class Main {
    	public static void main(String[] args)
	{
        	PaymentGateway payment1 = new CreditCardPayment("1234-5678-9876-5432");
        	payment1.processPayment(250.00);
        	System.out.println(payment1.getReceipt());

        	PaymentGateway payment2 = new UpiPayment("user@upi");
        	payment2.processPayment(85.50);
        	System.out.println(payment2.getReceipt());
    	}
}