
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName);
        System.out.println("Price: " + price);
    }
}

public class Program6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String planName = scanner.nextLine();
        int price = scanner.nextInt();
        MobilePlan s = new MobilePlan();
        MobilePlan s1 = new MobilePlan(planName, price);
        s.display();
        s1.display();

    }
}
