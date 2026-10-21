interface Showable {
    	void show();

    	interface Message {
        	void printMessage();
    	}
}

class Display implements Showable, Showable.Message {
    	public void show() {
        	System.out.println("Displaying from outer interface method.");
    	}

    	public void printMessage() {
        	System.out.println("Printing message from nested interface method.");
    	}
}

public class NestedInterfaceExample {
    	public static void main(String args[]) {
        	Display obj = new Display();
        	obj.show();
        	obj.printMessage();
    	}
}