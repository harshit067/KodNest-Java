
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            if (array[left] % 2 != 0 && array[right] % 2 == 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            left++;
            right--;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
