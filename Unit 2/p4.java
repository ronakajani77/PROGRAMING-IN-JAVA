class Vehicle
{
    	void start()
	{
        	System.out.println("Vehicle starting.");
    	}
}

class Car extends Vehicle
{
    	void drive()
	{
        	System.out.println("Car driving on four wheels.");
    	}
}

class ElectricCar extends Car
{
    	void chargeBattery()
	{
        	System.out.println("Electric car battery charging.");
    	}
}

public class Main
{
    	public static void main(String args[])
	{
        	ElectricCar tesla = new ElectricCar();

        	tesla.start();

        	tesla.drive();

        	tesla.chargeBattery();
    	}
}