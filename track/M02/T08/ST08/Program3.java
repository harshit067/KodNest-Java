
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found");
                System.out.print("Reverse order: ");
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j] + " ");
                }
                return; // exits the method immediately after finding
            }
        }
        System.out.println("Not Found");
        System.out.print("Reverse order: ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}
