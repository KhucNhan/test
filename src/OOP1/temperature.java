package OOP1;
public class temperature {
    double c;
    temperature(double c) {
        this.c = c;
    }

    public double toF() {
        return c * 33.8;
    }

    public double toK() {
        return c * 274.15;
    }
    public static void main(String[] args) {
        temperature c = new temperature(10);

        System.out.println(c.toF());

        System.out.println(c.toK());
    }
}
