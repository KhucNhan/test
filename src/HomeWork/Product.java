package HomeWork;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Product {
    private String name;
    private int price, amount;
    Scanner sc = new Scanner(System.in);

    Product() {

    }

    Product(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAll() {
        System.out.print("Name: ");
        this.name = sc.nextLine();
        System.out.print("Price: ");
        this.price = sc.nextInt();
        System.out.print("Amount: ");
        this.amount = sc.nextInt();
    }

    public String toString() {
        return "Name: " + name +
                "  ||  Price: " + price +
                "  ||  Amount: " + amount;
    }
}
