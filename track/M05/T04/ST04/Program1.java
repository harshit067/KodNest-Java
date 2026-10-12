
class Student {

    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name == s.name) {
            return true;
        } else {
            return false;
        }
    }
}

public class Program1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Yash";
        Student s2 = new Student();
        s2.roll = 1;
        s2.name = "Yash";
        System.out.println(s1.equals(s2));
    }
}
