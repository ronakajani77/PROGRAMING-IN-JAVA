class Vehicle
{
    	String brand = "Generic Vehicle";

    	void startEngine()
	{
        	System.out.println("The engine is running.");
    	}
}

class Car extends Vehicle
{
    	int doors = 4;

    	void drive()
	{
        	System.out.println("Driving the " + brand + " car with " + doors + " doors.");
    	}
}

class Bike extends Vehicle
{
    	boolean hasKickStart = true;

    	void ride()
	{
        	System.out.println("Riding the " + brand + " bike. Kickstart available: " + hasKickStart);
    	}
}

public class Main
{
    	public static void main(String args[])
	{
        	Car myCar = new Car();
        	myCar.brand = "Toyota";
        	myCar.startEngine();
        	myCar.drive();

        	Bike myBike = new Bike();
        	myBike.brand = "Yamaha";
        	myBike.startEngine();
        	myBike.ride();
    	}
}