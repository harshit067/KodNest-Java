
import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int count = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {

            if (array[i] > array[i - 1]) {
                count++;

                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(max);
    }
}
