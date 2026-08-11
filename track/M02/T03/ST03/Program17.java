
import java.util.Scanner;

public class Program17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Profile");
        Student s1 = new Student();
        int id = scanner.nextInt();
        s1.disp();
        System.out.println("ID: " + id);
        String name = scanner.next();
        s1.disp();
        System.out.println("Name: " + name);
        String course = scanner.next();
        s1.disp();
        System.out.println("Course: " + course);
        double javaScore = scanner.nextDouble();
        s1.disp();
        System.out.println("Java Score: " + javaScore);
    }
}

class Student {

    public void disp() {
        int id;
        String name;
        String course;
        double javaScore;
    }
}
