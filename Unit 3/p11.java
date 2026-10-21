class OuterClass {
    	private static String staticMessage = "Hello from Outer's static field!";
    	private String instanceMessage = "Hello from Outer's instance field!";

    	static class StaticNestedClass {
        	void display() {
            		System.out.println("Inside Static Nested Class.");
            		System.out.println("Accessing static field: " + staticMessage);

        	}
    	}
}

public class StaticInnerClassExample {
    	public static void main(String args[]) {
        	OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        	nestedObject.display();
    	}
}