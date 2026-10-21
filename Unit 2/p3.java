class Animal
{
    	String name;

    	public void eat()
	{
        	System.out.println(name + " is eating food.");
    	}

    	public void sleep()
	{
        	System.out.println(name + " is sleeping.");
    	}
}

class Dog extends Animal
{
    	public void bark()
	{
        	System.out.println(name + " says: Woof! Woof!");
    	}
}

public class Main
{
    	public static void main(String args[])
	{
        	Dog myDog = new Dog();

        	myDog.name = "Buddy";

        	myDog.eat();
        	myDog.sleep();

        	myDog.bark();
    	}
}