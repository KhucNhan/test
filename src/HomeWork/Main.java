package HomeWork;

public class Main {
    public static void main(String[] args) {
        Product pocket = new Product("pocket", 10, 100);
        Product jacket = new Product("jacket", 30, 150);
        Product shirt = new Product("shirt", 20, 200);

        Shop shop = new Shop();

        shop.addProduct(pocket);
        shop.addProduct(jacket);
        shop.addProduct(shirt);
        shop.addProduct(new Product("hat", 5, 100));

        shop.displayProductList();

        shop.sortPriceHighToLow();

        shop.deleteProduct("hat");
        shop.displayProductList();

        shop.addNewProduct();

        shop.deleteProduct(jacket);
        shop.deleteProduct("SHIRT");

        shop.displayProductList();
    }
}
