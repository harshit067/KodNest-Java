
public class Program8 {

    public static void main(String[] args) {
        String s1 = "Raja";
        String s2 = "Rani";
        String s3 = s1 + s2;
        System.out.println(s3);

        String s4 = new String("Tanu");
        String s5 = new String("Shanu");
        String s6 = s4.concat(s5).concat("Rama");
        System.out.println(s6);
    }
}
