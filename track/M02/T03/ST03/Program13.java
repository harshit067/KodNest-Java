
import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int practiceDays = scanner.nextInt();
        int totalProblemSolved = 0;

        for (int i = 1; i <= practiceDays; i++) {
            int problemSolved = scanner.nextInt();
            totalProblemSolved += problemSolved;
        }

        System.out.println("Total solved: " + totalProblemSolved);

        if (totalProblemSolved >= 20) {
            System.out.println("Status: Strong progress");
        } else if (totalProblemSolved > 10 && totalProblemSolved < 20) {
            System.out.println("Keep improving");
        } else {
            System.out.println("Needs more practice");
        }
    }
}
