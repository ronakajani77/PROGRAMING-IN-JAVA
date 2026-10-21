class InvalidAgeException extends Exception {
    	public InvalidAgeException(String message) {
        	super(message);
    	}
}

public class ThrowsKeywordExample {
    	static void validateAge(int age) throws InvalidAgeException {
        	if (age < 18) {
            		throw new InvalidAgeException("Age must be 18 or older to register.");
        	} else {
            		System.out.println("Registration successful!");
        	}
    	}

    	public static void main(String args[]) {
        	try {
            		validateAge(15);
        	} catch (InvalidAgeException e) {
            		System.out.println("Caught exception: " + e.getMessage());
        	}

        	System.out.println("Program execution continues normally.");
    	}
}