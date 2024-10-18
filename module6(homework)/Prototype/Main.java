public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, 1);
        Product product2 = new Product("Smartphone", 500, 2);

        Discount discount = new Discount("Holiday Sale", 10);

        Order originalOrder = new Order();
        originalOrder.addProduct(product1);
        originalOrder.addProduct(product2);
        originalOrder.setDelivery(20);
        originalOrder.setDiscount(discount);
        originalOrder.setPaymentMethod("Credit Card");

        Order clonedOrder = originalOrder.clone();

        originalOrder.getProducts().get(0).setQuantity(3);

        System.out.println(originalOrder);
        System.out.println(clonedOrder);
    }
}

