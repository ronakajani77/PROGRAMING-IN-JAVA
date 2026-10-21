public class ArithmeticExceptionExample {
	public static void main(String[] args) {
        	int numerator = 50;
        	int denominator = 0;

        	System.out.println("Attempting division...");

        	try {
            		int result = numerator / denominator;
            		System.out.println("Result: " + result);
        	} catch (ArithmeticException e) {
            		System.out.println("Exception caught: " + e.getMessage());
            		System.out.println("ArithmeticException handled successfully.");
        	}

        	System.out.println("Program execution continues normally.");
    	}
}