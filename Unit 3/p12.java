class Outer {
    	private String message = "Outer variable";

    	void displayMessage() {
        	int number = 42;

        	class LocalInner {
            		void print() {
                		System.out.println(message);
                		System.out.println("Local number: " + number);
            		}
        	}

        	LocalInner local = new LocalInner();
        	local.print();
    	}
}

public class LocalInnerClassExample {
    	public static void main(String args[]) {
        	Outer outer = new Outer();
        	outer.displayMessage();
    	}
}