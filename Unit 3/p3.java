public class FinallyBlockDemo {
    	public static void main(String args[]) {
        	try {
            		int result = 10 / 0;
            		System.out.println("Result: " + result);
        	} catch (ArithmeticException e) {
            		System.out.println("Caught an ArithmeticException.");
        	} finally {
            		System.out.println("The finally block has executed.");
        	}
        
        	System.out.println("Program continues normally.");
    	}
}