package HomeWork;
public class Product {
    private String name;
    private int price;
    private int amount;

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

    public void setAll(String name, int price, int amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    public String toString() {
        return "Name: " + name +
                "  ||  Price: " + price +
                "  ||  Amount: " + amount;
    }
}
