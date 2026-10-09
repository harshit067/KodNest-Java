
class Developer {

    void work() {
        System.out.println("Developer Working");
    }

    void project() {
        System.out.println("Developer doing project");
    }
}

class Java extends Developer {

    @Override
    void work() {
        System.out.println("Java Developer Working");
    }

    @Override
    void project() {
        System.out.println("Java Developer doing project");
    }
}

class Python extends Developer {

    @Override
    void work() {
        System.out.println("Python Developer Working");
    }

    @Override
    void project() {
        System.out.println("Python Developer doing project");
    }
}

public class Program1 {

    public static void main(String[] args) {
        Java j = new Java();
        accessMethod(j);

        Python p = new Python();
        accessMethod(p);
    }

    static void accessMethod(Developer d) {
        d.work();
        d.project();
    }
}
