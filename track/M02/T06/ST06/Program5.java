
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item);
        System.out.println("Quantity: " + quantity);
    }
}

public class Program5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();
        FoodOrder s = new FoodOrder(item);
        FoodOrder s1 = new FoodOrder(item, quantity);
        s.display();
        s1.display();

    }
}
