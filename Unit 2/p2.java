interface Vehicle
{
	void start();
    	void stop();
}

interface AdvancedVehicle extends Vehicle
{
    	void fly();
}

class FlyingCar implements AdvancedVehicle
{
    	@Override
    	public void start()
	{
        	System.out.println("Flying car engine started.");
    	}

    	@Override
    	public void stop()
	{
        	System.out.println("Flying car landed and engine turned off.");
    	}

    	@Override
    	public void fly()
	{
        	System.out.println("Flying car is cruising in the sky.");
    	}
}

public class Main
{
    	public static void main(String args[]) 
	{
        	AdvancedVehicle mySkyCar = new FlyingCar();

        	mySkyCar.start();

        	mySkyCar.fly();

        	mySkyCar.stop();
    	}
}