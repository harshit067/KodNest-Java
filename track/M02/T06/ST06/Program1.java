
class Student {

    String name;
    int age;
    double hieght;

    public Student(String name, int age, double hieght) {
        this.name = name;
        this.age = age;
        this.hieght = hieght;
    }

    public void display() {
        System.out.println(name + " " + age + " " + hieght);
    }
}

public class Program1 {

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 22, 4.5);
        s1.display();
    }
}
