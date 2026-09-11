
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();
        String city = scanner.nextLine();
        System.out.println("Name: " + learnerName);
        System.out.println("City: " + city);
        System.out.println("Name Length: " + learnerName.length());

    }
}
