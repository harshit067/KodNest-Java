
import java.util.Scanner;

class Product {

    private double price;

    Product(double price) {
        this.price = price;
    }

    // Create getPrice()
    public double getPrice() {
        return price;
    }
}

public class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read price
        double price = scanner.nextDouble();
        // Create Product
        Product product = new Product(price);
        // Print the price through the getter

        System.out.println(product.getPrice());
    }
}
