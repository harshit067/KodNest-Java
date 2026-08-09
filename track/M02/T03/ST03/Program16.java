
import java.util.Scanner;

public class Program16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int practiceDays = scanner.nextInt();

        int totalSolved = 0;

        for (int i = 1; i <= practiceDays; i++) {
            int solvedProblem = scanner.nextInt();
            totalSolved += solvedProblem;
        }

        double dailyAverage = (double) totalSolved / practiceDays;

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);

        if (dailyAverage >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }
    }
}
