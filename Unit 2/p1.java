interface Vehicle
{
	void start();
	void stop();

		default void honk()
		{
			System.out.println("Beep beep!");
		}
	}

class Car implements Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Car engine started with a key turn.");
	}

	@Override
	public void stop()
	{
		System.out.println("Car stopped using foot brakes.");
	}
}

class Bike implements Vehicle
{
	@Override
	public void start()
	{
		System.out.println("Bike started using self-start button.");
	}

	@Override
	public void stop()
	{
		System.out.println("Bike stopped using hand brakes.");
	}

	@Override
	public void honk()
	{
		System.out.println("Loud bike horn!");
	}
}

public class Main
{
	public static void main(String args[])
	{
		Vehicle myCar = new Car();
		myCar.start();
		myCar.honk();
		myCar.stop();


		Vehicle myBike = new Bike();
       		myBike.start();
       		myBike.honk();
        	myBike.stop();
    	}
}