class ApplicationException extends Exception {
    	public ApplicationException(String message, Throwable cause) {
        	super(message, cause);
    	}
}

public class ExceptionChainingExample {
    	static void processConfig() throws ApplicationException {
        	try {
            		int value = Integer.parseInt("xyz");
        	} catch (NumberFormatException e) {
            		throw new ApplicationException("Failed to load configuration settings.", e);
        	}
    	}

    	public static void main(String args[]) {
        	try {
            		processConfig();
        	} catch (ApplicationException e) {
            		System.out.println("Caught Exception: " + e.getMessage());
            		System.out.println("Root Cause: " + e.getCause());
        	}

        	System.out.println("Program execution continues normally.");
    	}
}