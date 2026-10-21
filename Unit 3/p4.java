public class MultipleCatchExample {
	public static void main(String args[]) {
        	try {
            		int[] numbers = new int[3];
            		numbers[5] = 10;
        	} catch (ArithmeticException e) {
            		System.out.println("Caught ArithmeticException.");
        	} catch (ArrayIndexOutOfBoundsException e) {
            		System.out.println("Caught ArrayIndexOutOfBoundsException.");
        	} catch (Exception e) {
            		System.out.println("Caught a generic Exception.");
        	}
        
        	System.out.println("Program execution continues normally.");
    	}
}