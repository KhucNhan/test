package OOP2;
public class Battery{
    int energy;
    Battery(int energy) {
        this.energy = energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void getEnergy() {
        System.out.println(this.energy);
    }

    public void decreaseEnergy() {
        this.energy -= 1;
    }
}
class Lamp {
    boolean status;
    Battery battery;
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }
    public void getStatus() {
        System.out.println(this.status);
    }

    public int getBatteryInfor() {
        return battery.energy;
    }

    public void light() {
        if (this.status) {
            System.out.println("Light on.");
        } else {
            System.out.println("Light off.");
        }
    }
    public static void main(String[] args) {
        Battery pin1 = new Battery(100);
        Lamp den1 = new Lamp();
        den1.setBattery(pin1);
        System.out.println(den1.getBatteryInfor());
        den1.turnOn();
        den1.getStatus();
        den1.light();
        System.out.println(den1.battery);
    }

}
