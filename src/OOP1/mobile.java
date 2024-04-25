package OOP1;

import java.util.List;
import java.util.ArrayList;

public class mobile {
    private int battery;
    private String composingMsg, name;
    private List<String> inbox;
    private List<String> outbox;
    private boolean isOn;

    public mobile(String name) {
        this.battery = 100;
        this.composingMsg = "";
        this.inbox = new ArrayList<>();
        this.outbox = new ArrayList<>();
        this.isOn = false;
        this.name = name;
    }

    public static void main(String[] args) {
        mobile nokia = new mobile("nokia");
        mobile iphone = new mobile("iphone");

        nokia.turnOn();
        iphone.turnOn();
        String message = "Hello iPhone, this is Nokia!";
        String message2 = "Hello nokia, this is iphone!";
        nokia.sendMessage(iphone, message);
        nokia.sendMessage(iphone, " ");
        iphone.sendMessage(nokia, message2);
        iphone.viewInbox();
        nokia.viewInbox();
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean turnOn() {
        return isOn = true;
    }

    public void togglePower() {
        if (isOn) {
            isOn = false;
            System.out.println("Mobile is turned off.");
        } else {
            isOn = true;
            System.out.println("Mobile is turned on.");
        }
        decreaseBattery();
    }

    public void chargeBattery() {
        battery = 100;
        System.out.println("Battery is fully charged.");
    }

    public void composeMessage(String message) {
        composingMsg = message;
        decreaseBattery();
    }

    public void receiveMessage(String message) {
        inbox.add(message);
        System.out.println(this.name + ": A new message has been received.");
        decreaseBattery();
    }

    public void sendMessage(mobile receiver, String message) {
        if (isOn && receiver.isOn) {
            this.outbox.add(message);
            System.out.println(this.name + ": Message has been sent.");
            receiver.receiveMessage(message);
            decreaseBattery();
        } else {
            System.out.println("Failed to send message.");
        }
    }

    public void viewInbox() {
        if (inbox.isEmpty()) {
            System.out.println(this.name + " inbox is empty.");
        } else {
            System.out.println(this.name + "'s inbox:");
            for (String message : inbox) {
                System.out.println(message);
            }
            decreaseBattery();
        }
    }

    public void viewOutbox() {
        if (outbox.isEmpty()) {
            System.out.println(this.name + " outbox is empty.");
        } else {
            System.out.println(this.name + " outbox:");
            for (String message : outbox) {
                System.out.println(message);
            }
            decreaseBattery();
        }
    }

    public void decreaseBattery() {
        battery--;
        if (battery == 0) {
            isOn = false;
            System.out.println("Mobile is out of battery.");
        }
    }
}
