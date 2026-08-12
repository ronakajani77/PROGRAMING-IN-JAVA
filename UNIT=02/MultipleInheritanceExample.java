interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }

    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Child c = new Child();

        c.fatherProperty();
        c.motherProperty();
    }
}