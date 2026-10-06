
class Parent {

    void display1() {
        System.out.println("This is the parent class method 1");
    }

    void display2() {
        System.out.println("This is the parent class method 2");
    }
}

class Child extends Parent {

    @Override
    void display2() {
        System.out.println("This is the child class method 2");
    }

    void display3() {
        System.out.println("This is the child class method 3");
    }
}

public class Program5 {

    public static void main(String[] args) {

        Child c = new Child();
        c.display1();
        c.display2();
        c.display3();
    }
}
