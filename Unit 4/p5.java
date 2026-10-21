class Worker implements Runnable {
    	private String name;

    	public Worker(String name) {
        	this.name = name;
    	}

    	public void run() {
        	for (int i = 1; i <= 5; i++) {
            		System.out.println(name + " - Count: " + i);
            		try {
                		Thread.sleep(100);
            		} catch (InterruptedException e) {
                		Thread.currentThread().interrupt();
            		}
        	}
    	}
}

public class Main {
    	public static void main(String args[]) {
        	Thread t1 = new Thread(new Worker("Thread-1"));
        	Thread t2 = new Thread(new Worker("Thread-2"));

        	t1.start();
        	t2.start();

        	try {
            		t1.join();
            		t2.join();
        	} catch (InterruptedException e) {
            		Thread.currentThread().interrupt();
        	}

        	System.out.println("Both threads have finished execution. Main thread resumes.");
    	}
}