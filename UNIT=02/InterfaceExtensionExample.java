interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

public class InterfaceExtensionExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}

class Puppy implements Dog {
    public void eat() {
        System.out.println("Dog eats food");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}