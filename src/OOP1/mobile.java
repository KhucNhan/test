package OOP1;

import java.util.List;
import java.util.ArrayList;

public class mobile {
    public static void main(String[] args) {
        Mobile nokia = new Mobile();
        Mobile iphone = new Mobile();

        nokia.turnOn();
        iphone.turnOn();
        String message = "Hello iPhone, this is Nokia!";
        String message2 = "Hello nokia, this is iphone!";
        nokia.sendMessage(iphone, message);
        iphone.sendMessage(iphone, message2);
        iphone.viewInbox();
    }
}

class Mobile {
    private int battery;
    private String composingMsg;
    private List<String> inbox;
    private List<String> outbox;
    private boolean isOn;


    public Mobile() {
        this.battery = 100;
        this.composingMsg = "";
        this.inbox = new ArrayList<>();
        this.outbox = new ArrayList<>();
        this.isOn = false;
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
        System.out.println("A new message has been received.");
        decreaseBattery();
    }

    public void sendMessage(Mobile receiver, String message) {
        if (isOn && receiver.isOn) {
            outbox.add(message);
            receiver.receiveMessage(message);
            System.out.println("Message has been sent.");
            decreaseBattery();
        } else {
            System.out.println("Failed to send message.");
        }
    }

    public void viewInbox() {
        if (inbox.isEmpty()) {
            System.out.println("Inbox is empty.");
        } else {
            System.out.println("Inbox:");
            for (String message : inbox) {
                System.out.println(message);
            }
            decreaseBattery();
        }
    }

    public void viewOutbox() {
        if (outbox.isEmpty()) {
            System.out.println("Outbox is empty.");
        } else {
            System.out.println("Outbox:");
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
