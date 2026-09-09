
public class Program9 {

    public static void main(String[] args) {
        String s1 = "Java";
        System.out.println(s1);
        char array[] = s1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String s2 = new String(array);
        System.out.println(s2);
    }

}
