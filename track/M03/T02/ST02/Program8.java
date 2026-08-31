
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int second = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            } else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(second);
        }
    }
}
