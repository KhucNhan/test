package OOP1;
public class temperature {
    private double c;
    temperature(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double CtoF() {
        return c * 33.8;
    }

    public double CtoK() {
        return c * 274.15;
    }
    public static void main(String[] args) {
        temperature c = new temperature(10);

        System.out.println(c.CtoF());

        System.out.println(c.CtoK());
    }
}
