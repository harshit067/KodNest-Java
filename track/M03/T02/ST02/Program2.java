
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = -1;
        int last = -1;
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                if (first == (-1)) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(first + " " + last);
    }
}
