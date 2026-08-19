
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int matrix[][] = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
            System.out.println("Row" + " " + (i + 1) + " " + "total" + " " + total);
        }
    }
}
