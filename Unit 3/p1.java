public class SimpleExceptionHandling {
	public static void main(String args[]) {
        	int numerator = 10;
        	int denominator = 0;
        
        	System.out.println("Program started.");
        
        	try {
            		int result = numerator / denominator;
            		System.out.println("Result: " + result);
        	} catch (ArithmeticException e) {
            		System.out.println("Error: Cannot divide by zero! (" + e.getMessage() + ")");
        	} finally {
            		System.out.println("Finally block executed: Cleaning up resources.");
        	}
        	System.out.println("Program continues normally after exception handling.");
    	}
}