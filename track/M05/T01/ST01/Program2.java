
class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {
            pageNum = x;
        }
    }

    public void getData() {
        System.out.println("Number of pages: " + pageNum);
    }
}

public class Program2 {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setData(-100);
        b1.getData();
    }
}
