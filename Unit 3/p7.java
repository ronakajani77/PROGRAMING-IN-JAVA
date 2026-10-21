class InsufficientBalanceException extends Exception {
    	public InsufficientBalanceException(String message) {
        	super(message);
    	}
}

public class CustomExceptionExample {
    	private static double balance = 5000.0;

    	static void withdraw(double amount) throws InsufficientBalanceException {
        	if (amount > balance) {
            		throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance. Available: ₹" + balance);
        	}
        	balance -= amount;
        	System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
    	}

    	public static void main(String args[]) {
        	try {
            		withdraw(6000.0);
        	} catch (InsufficientBalanceException e) {
            		System.out.println("Caught Custom Exception: " + e.getMessage());
        	}

        	System.out.println("Program execution continues normally.");
    	}
}