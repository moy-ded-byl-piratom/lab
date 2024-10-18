import java.util.ArrayList;
import java.util.List;

public class Order implements Cloneable {
    private List<Product> products;
    private double deliveryCost;
    private Discount discount;
    private String paymentMethod;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }


    public void setDelivery(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public Order clone() {
        try {
            Order clonedOrder = (Order) super.clone();
            clonedOrder.products = new ArrayList<>();
            for (Product product : this.products) {
                clonedOrder.products.add(product.clone());
            }
            clonedOrder.discount = (this.discount != null) ? this.discount.clone() : null;
            return clonedOrder;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return products + " " + deliveryCost + " " + discount + " " + paymentMethod;
    }

    public List<Product> getProducts() {
        return products;
    }
}