
interface Calculator1 {

    void add();

    void sub();
}

interface Calculator2 extends Calculator1 {

    void mul();

    void div();
}

class Calculator implements Calculator2 {

    @Override
    public void add() {
        System.out.println("Addition");
    }

    @Override
    public void sub() {
        System.out.println("Subtraction");
    }

    @Override
    public void mul() {
        System.out.println("Multiplication");
    }

    @Override
    public void div() {
        System.out.println("Division");
    }
}

public class Program3 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add();
        calc.sub();
        calc.mul();
        calc.div();
    }
}
