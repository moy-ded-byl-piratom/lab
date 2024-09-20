public class CalculationTotalDiscount {
    private IDiscount discount;
    public CalculationTotalDiscount(IDiscount discount) {
        this.discount = discount;
    }
    public double calculateOrderDiscount(Order order) {
        double total = 0;
        for (Product product : order.products) {
            total += product.price * product.amount;
        }
        return discount.applyDiscount(total);
    }
}
