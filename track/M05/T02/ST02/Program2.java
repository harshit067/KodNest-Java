
class Parent {

    Parent() {
        System.out.println("Parent Constructor executes");
    }
}

class Child extends Parent {

    Child() {
        System.out.println("Child Constructor executes");
    }
}

public class Program2 {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
