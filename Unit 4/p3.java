class MyRunnable implements Runnable {
    	public void run() {
        	Thread current = Thread.currentThread();
        	System.out.println("Running Thread Name: " + current.getName());
        	System.out.println("Running Thread Priority: " + current.getPriority());
    	}
}

public class Main {
    	public static void main(String args[]) {
        	MyRunnable runnable = new MyRunnable();
        
        	Thread t1 = new Thread(runnable);
        	t1.setName("AlphaThread");
        	t1.setPriority(Thread.MAX_PRIORITY);
        
        	t1.start();
    	}
}