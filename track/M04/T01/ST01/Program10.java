
import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();
        original.toUpperCase();
        System.out.println("Original: " + original);
        String res = original.toUpperCase();
        System.out.println("After ignored call: " + original);
        System.out.println("Uppercase copy: " + res);
    }
}
