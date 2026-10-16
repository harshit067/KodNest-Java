
import java.util.Scanner;

abstract class Person {

    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println("ID :" + id);
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }

    abstract Double calculatePayment();

    abstract void displayRole();
}

class Student extends Person {

    String course;
    double fee;

    Student(int id, String name, int age, String course, double fee) {
        super(id, name, age);
        this.course = course;
        this.fee = fee;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Course :" + course);
        System.out.println("Fee :" + fee);
    }

    @Override
    Double calculatePayment() {
        return fee;
    }

    @Override
    void displayRole() {
        System.out.println("Role : Student");
    }
}

class Professor extends Person {

    String subject;
    double salary;

    Professor(int id, String name, int age, String subject, double salary) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Subject :" + subject);
        System.out.println("Salary :" + salary);
    }

    @Override
    Double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Role : Professor");
    }
}

class AdminStaff extends Person {

    String department;
    double salary;

    AdminStaff(int id, String name, int age, String department, double salary) {
        super(id, name, age);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Department :" + department);
        System.out.println("Salary :" + salary);
    }

    @Override
    Double calculatePayment() {
        return salary;
    }

    @Override
    void displayRole() {
        System.out.println("Role : Admin Staff");
    }
}

public class CollegeManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student Details: ");
        int id = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();
        String course = scanner.next();
        double fee = scanner.nextDouble();

        System.out.println("Enter Professor Details: ");
        int pid = scanner.nextInt();
        String pname = scanner.next();
        int page = scanner.nextInt();
        String subject = scanner.next();
        double psalary = scanner.nextDouble();

        System.out.println("Enter Admin Staff Details: ");
        int aid = scanner.nextInt();
        String aname = scanner.next();
        int aage = scanner.nextInt();
        String department = scanner.next();
        double asalary = scanner.nextDouble();

        Student s1 = new Student(id, name, age, course, fee);
        Professor p1 = new Professor(pid, pname, page, subject, psalary);
        AdminStaff as = new AdminStaff(aid, aname, aage, department, asalary);

        Person[] person = {s1, p1, as};
        double total = 0;
        for (Person p : person) {
            System.out.println("Details: ");
            p.showDetails();
            p.displayRole();
            total = total + p.calculatePayment();
        }
        System.out.println("Expected total payment: " + total);
    }

}
