
class Parent {

    int a = 10;
}

class Child extends Parent {

    int a = 30;

    public void display() {
        System.out.println("parent value is: " + super.a);
        System.out.println("child value is: " + a);
    }
}

public class Program4 {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
