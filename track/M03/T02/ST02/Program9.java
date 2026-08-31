
import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            int freq = 0;

            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j]) {
                    freq++;
                }
            }

            if (freq == 1) {
                System.out.println(array[i]);
                return;
            }
        }

        System.out.println(-1);
    }
}
