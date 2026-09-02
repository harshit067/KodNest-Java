
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        while (left < right) {
            if (left > 0 && right <= array.length - 1) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            } else {
                System.out.println("-1");
            }
            left++;
            right--;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
