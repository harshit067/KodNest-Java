
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();
        String s = sentence.trim().toLowerCase();
        String k = keyword.trim().toLowerCase();
        System.out.println("Normalized text: " + s);
        System.out.println("Contains keyword: " + s.contains(k));
    }
}
