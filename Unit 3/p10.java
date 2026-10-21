class OuterClass {
    	private String message = "Hello from the Outer Class!";

    	class InnerClass {
        	void display() {
            		System.out.println("Inside Inner Class.");
            		System.out.println("Accessing private member of Outer: " + message);
        	}
    	}
}

public class SimpleInnerClassExample {
    	public static void main(String args[]) {
        	OuterClass outer = new OuterClass();

        	OuterClass.InnerClass inner = outer.new InnerClass();

        	inner.display();
    	}
}