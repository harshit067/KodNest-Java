
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrix[][] = new int[3][];
        matrix[0] = new int[4];
        matrix[1] = new int[3];
        matrix[2] = new int[5];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
