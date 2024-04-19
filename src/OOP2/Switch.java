package OOP2;
public class Switch {
    boolean status;
    electricLamp lamp;
    Switch(boolean status, electricLamp lamp) {
        this.status = status;
        this.lamp = lamp;
    }

    public void connectToLamp(electricLamp lamp) {
        this.lamp = lamp;
    }

    public void switchOn() {
        this.status = true;
        this.lamp.turnOn();
        System.out.println("switch is on.");
    }

    public void switchOff() {
        this.status = false;
        this.lamp.turnOff();
        System.out.println("switch is off.");
    }

    public static void main(String[] args) {
        electricLamp lamp1 = new electricLamp(false);
        Switch sw1 = new Switch(false, lamp1);
        sw1.switchOn();
    }
}

class electricLamp {
    boolean status;
    electricLamp(boolean status) {
        this.status = status;
    }

    public void turnOn() {
        this.status = true;
        System.out.println("lamp is on.");
    }

    public void turnOff() {
        this.status= false;
        System.out.println("lamp is off.");
    }
}