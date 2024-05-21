package HomeWork;
import java.util.ArrayList;
public class Shop {
    private ArrayList<Product> productList = new ArrayList<>(1000);

    Shop() {

    }

    Shop(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void deleteProduct(String name) {
        productList.removeIf(i -> compare(i.getName(), name));
    }

    public void deleteProduct(Product product) {
        productList.remove(product);
    }

    public int productPrice(Product product) {
        int x = 0;
        for (Product i : productList) {
            if (i.getName().equals(product.getName())) {
                x = i.getPrice();
                break;
            }
        }
        return x;
    }

    public int totalProductPrice() {
        int total = 0;
        for (Product i : productList) {
            total += i.getPrice() * i.getAmount();
        }
        return total;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void displayProductList() {
        for (Product i : productList) {
            System.out.println(i.toString());
        }
    }

    public void addNewProduct(String name, int price, int amount) {
        Product a = new Product();
        a.setAll(name, price, amount);
        productList.add(a);
    }

    public boolean compare(String product,String name) {
        return  ((product.toLowerCase()).equals(name.toLowerCase()));
    }

    public void sortPriceHighToLow() {
        for (int i = 0; i < productList.size() - 1; i++) {
            if (productList.get(i).getPrice() < productList.get(i + 1).getPrice()) {
                Product x = productList.get(i);
                productList.set(i, productList.get(i + 1));
                productList.set(i + 1, x);
                i = -1;
            }
        }
    }
}
