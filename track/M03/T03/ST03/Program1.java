
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int result[] = new int[array.length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                result[index] = array[i];
                index++;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
