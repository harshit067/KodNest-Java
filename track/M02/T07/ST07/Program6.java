
public class Program6 {

    public static void main(String[] args) {
        int[] marks = {70, 80, 60, 90, 50};
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        System.out.println("Total: " + total);
        double average = total / 5;
        System.out.println("Average: " + average);
    }
}
