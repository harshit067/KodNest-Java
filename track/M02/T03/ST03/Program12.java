
import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        int problemSolved = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();
        System.out.println("Learner: " + firstName);
        System.out.println("Problems Solved: " + problemSolved);
        System.out.println("Assessment: " + assessmentPercentage);

    }
}
