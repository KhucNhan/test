package OOP1.temperature;

public class TempMain {
    public static void main(String[] args) {
        Temperature c = new Temperature(10);

        System.out.println(c.CtoF());

        System.out.println(c.CtoK());
    }
}
