package OOP2;

public class Remote {
    int seri;
    TV tv;
    Remote(int seri, TV tv) {
        this.seri = seri;
        this.tv = tv;
    }

    public void setTV(TV tv) {
        this.tv = tv;
    }

    public void setChannel(int channel) {
        if (this.tv.status) {
            this.tv.setChannel(channel);
        } else {
            System.out.println("The tv is off.");
        }
    }

    public void setVolume(int volume) {
        if (this.tv.status) {
            this.tv.setVolume(volume);
        } else {
            System.out.println("The tv is off.");
        }
    }

    public void turnOn() {
        this.tv.turnOn();
    }

    public void turnOff() {
        this.tv.turnOff();
    }

    public static void main(String[] args) {
        TV tv1 = new TV(3,10);
        Remote rm1 = new Remote(2005,tv1);
        tv1.turnOn();
        tv1.setChannel(7);
        rm1.setChannel(3);
        rm1.setVolume(6);
        tv1.setVolume(8);
        rm1.turnOff();
    }
}

class TV {
    boolean status;
    int channel, volume;
    TV(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }

    public void getStatus() {
        if (this.status) {
            System.out.println("The tv is on.");
        } else {
            System.out.println("The tv is off.");
        }
    }

    public void turnOn() {
        this.status = true;
        System.out.println("The tv is on.");
    }

    public void turnOff() {
        this.status = false;
        System.out.println("The tv is off.");
    }

    public void getVolume() {
        if (this.status) {
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("The tv is off. Please turn on to use.");
        }
    }

    public void getChannel() {
        if (this.status) {
            System.out.println("Channel: " + this.channel);
        } else {
            System.out.println("The tv is off. Please turn on to use.");
        }
    }

    public void setChannel(int channel) {
        if (this.status) {
            this.channel = channel;
            System.out.println("Channel: " + this.channel);
        } else {
            System.out.println("The tv is off. Please turn on to use.");
        }
    }

    public void setVolume(int volume) {
        if (this.status) {
            this.volume = volume;
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("The tv is off. Please turn on to use.");
        }
    }
}
