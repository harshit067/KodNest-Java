
import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}
