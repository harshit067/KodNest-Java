
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        System.out.println("Total: " + total);
    }
}
