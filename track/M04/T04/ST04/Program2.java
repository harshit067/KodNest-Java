
public class Program2 {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        if (s1 == s2) {
            System.out.println("References are the same");
        } else {
            System.out.println("References are different");
        }
        if (s1.equals(s2)) {
            System.out.println("Content is same");
        } else {
            System.out.println("Content is different");
        }
    }
}
