package HomeWork;

import java.util.Arrays;
import java.util.Objects;

public class Shop {
    //    final int MAX_LIMITED = 1000;
    private Product[] products = new Product[0];

    Shop() {

    }

    Shop(Product[] products) {
        this.products = products;
    }

    public boolean deleteProduct(String name) {
        Product[] a = new Product[products.length - 1];
        int k = 0;
        for (int i = 0; i < products.length; i++) {
            if (!compare(products[i].getName(), name)) {
                a[k] = products[i];
                k++;
            }
        }
        products = Arrays.copyOf(a, a.length);

        return !haveProduct(name);
    }

    public boolean deleteProduct(Product product) {
        Product[] a = new Product[products.length - 1];
        int k = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != product) {
                a[k] = products[i];
                k++;
            }
        }
        products = Arrays.copyOf(a, a.length);

        return !haveProduct(product);
    }

    public int productPrice(Product product) {
        for (Product i : products) {
            if (i.getName().equals(product.getName())) {
                return i.getPrice();
            }
        }

        throw new RuntimeException("Not found");
    }

    public int totalProductPrice() {
        int total = 0;
        for (Product i : products) {
            total += i.getPrice() * i.getAmount();
        }
        return total;
    }

    public boolean addProduct(Product product) {
        if (haveProduct(product)) {
            return false;
        }

        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = product;
        return true;
    }

    public void getProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }
    }

    public void addNewProduct(String name, int price, int amount) {
        Product a = new Product();
        a.setAll(name, price, amount);
        addProduct(a);
    }

    public boolean compare(String product, String name) {
        return ((product.toLowerCase()).equals(name.toLowerCase()));
    }

    public boolean haveProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == product) {
                return true;
            }
        }

        return false;
    }

    public boolean haveProduct(String name) {
        for (int i = 0; i < products.length; i++) {
            if (Objects.equals(products[i].getName(), name)) {
                return true;
            }
        }

        return false;
    }

    public void sortPriceHighToLow() {
        for (int i = 0; i < products.length - 1; i++) {
            if (products[i].getPrice() < products[i + 1].getPrice()) {
                Product x = products[i];
                products[i] = products[i + 1];
                products[i + 1] = x;
                i = -1;
            }
        }
    }
}
