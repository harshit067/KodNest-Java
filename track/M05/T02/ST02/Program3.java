
class Parent {

    Parent() {
        System.out.println("Parent default constructor");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Child default constructor");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Child parameterized1 constructor");
    }

    Child(int a, int b) {
        System.out.println("Child parameterized2 constructor");
    }
}

public class Program3 {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
