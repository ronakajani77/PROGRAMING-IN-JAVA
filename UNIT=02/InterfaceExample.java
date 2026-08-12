interface Animal {
    void sound();
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}