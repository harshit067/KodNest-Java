
import java.util.Scanner;

public class Program14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remaining = monthlyIncome - totalExpense;
        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remaining);
        if (remaining >= 0) {
            System.out.println("Status: Within budget");
        }
        if (remaining < 0) {
            System.out.println("Status: Over budget");
        }

    }
}
