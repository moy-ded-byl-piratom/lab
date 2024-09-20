import java.util.ArrayList;
public class Order {
    public ArrayList<Product> products;
    public String paymentMethod;
    public String deliveryMethod;
    public String status;
    public INotification notification;

    public Order() {
        this.products = new ArrayList<>();
        this.notification = notification;
        this.paymentMethod = paymentMethod;
        this.deliveryMethod = deliveryMethod;
    }
    public void addProduct(String name, double price, int amount) {
        products.add(new Product(name, price, amount));
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
