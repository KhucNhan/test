package OOP1.temperature;
public class Temperature {
    private double c;
    Temperature(double c) {
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
}
