public class ThrowKeywordExample {
    	static void checkAge(int age) {
        	if (age < 18) {
            		throw new IllegalArgumentException("Age must be 18 or above.");
        	} else {
            		System.out.println("Access granted!");
        	}
    	}

    	public static void main(String args[]) {
        	try {
            		checkAge(15);
        	} catch (IllegalArgumentException e) {
            		System.out.println("Caught exception: " + e.getMessage());
        	}

        	System.out.println("Program execution continues normally.");
    	}
}