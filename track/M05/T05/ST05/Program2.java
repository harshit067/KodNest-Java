
interface Shape {

    void input();

    void display();
}

class Square implements Shape {

    @Override
    public void input() {
        System.out.println("Input");
    }

    @Override
    public void display() {
        System.out.println("Display");
    }
}

public class Program2 {

    public static void main(String[] args) {
        Shape s = new Square();
        s.input();
        s.display();
    }
}
