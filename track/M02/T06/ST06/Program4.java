
import java.util.Scanner;

class Book {

    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    void display() {
        System.out.println("Author Name: " + author);
        System.out.println("Title: " + title);
    }
}

public class Program4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        String title = scanner.nextLine();
        Book s1 = new Book(author, title);
        s1.display();

    }
}
