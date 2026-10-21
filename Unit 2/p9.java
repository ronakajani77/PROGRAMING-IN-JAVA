class Animal
{
    	void makeSound()
	{
        	System.out.println("The animal makes a sound.");
    	}
}

class Dog extends Animal
{
    	@Override
    	void makeSound()
	{
        	System.out.println("The dog barks: Woof Woof!");
    	}
}

class Cat extends Animal
{
    	@Override
    	void makeSound()
	{
        	System.out.println("The cat meows: Meow Meow!");
    	}
}

public class Main
{
    	public static void main(String args[])
	{
        	Animal genericAnimal = new Animal();
        	genericAnimal.makeSound();

        	Animal myDog = new Dog();
        	myDog.makeSound();

        	Animal myCat = new Cat();
        	myCat.makeSound();
    	}
}