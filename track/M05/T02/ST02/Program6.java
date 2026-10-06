
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal {

    @Override
    void eat() {
        System.out.println("Tiger is eating");
    }
}

class Monkey extends Animal {

    @Override
    void eat() {
        System.out.println("Monkey is eating");
    }
}

public class Program6 {

    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eat();
        m.sleep();

        Tiger t = new Tiger();
        t.eat();
        t.sleep();
    }
}
