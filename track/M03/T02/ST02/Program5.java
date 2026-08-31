
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int closest = arr[0];

        for (int i = 1; i < n; i++) {

            if (Math.abs(target - arr[i]) < Math.abs(target - closest)) {
                closest = arr[i];
            } else if (Math.abs(target - arr[i]) == Math.abs(target - closest)
                    && arr[i] < closest) {
                closest = arr[i];
            }
        }

        System.out.println(closest);
    }
}
