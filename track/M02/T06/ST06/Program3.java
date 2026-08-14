
import java.util.Scanner;

class Product {

    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class Program3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        Product s1 = new Product(name, price);
        s1.display();

    }
}
