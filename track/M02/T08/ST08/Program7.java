
import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int block = scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int matrix[][][] = new int[block][row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = scanner.nextInt();
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
