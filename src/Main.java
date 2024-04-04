public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int a = 0, b = 1;
        for (int i = 0; i < 5; i++) {
           a += b;
           b++;
        }
        System.out.println(a + " " + b);
    }
}