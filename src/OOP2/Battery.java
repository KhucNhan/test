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
        this.battery.decreaseEnergy();
    }

    public int getBatteryInfor() {
        this.battery.decreaseEnergy();
        return this.battery.energy;
    }

    public void light() {
        if (this.status && this.battery.energy > 0) {
            System.out.println("Light on.");
            this.battery.decreaseEnergy();
        } else if (this.status && this.battery.energy < 0){
            System.out.println("The lamp is run out of energy.");
        } else {
            System.out.println("Light off.");
        }
    }
    public static void main(String[] args) {
        Battery pin1 = new Battery(0);
        Lamp den1 = new Lamp();
        den1.setBattery(pin1);
        System.out.println(den1.getBatteryInfor());
        den1.turnOn();
        den1.getStatus();
        den1.light();
        System.out.println(den1.battery);
    }
}