
public class Program7 {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.startsWith("Nest"));
        System.out.println(str.contains("Nest"));
        System.out.println(str.endsWith("gies"));
        System.out.println(str.indexOf('N'));
        System.out.println(str.indexOf('Z'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'p'));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 14));

        String s1 = " Java ";
        System.out.println(s1.trim());
        System.out.println(s1.stripLeading());
        System.out.println(s1.stripTrailing());

        String s2 = "Raja";
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

        String s3 = "";
        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());

        String s4 = " ";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());

    }
}
