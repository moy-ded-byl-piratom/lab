public class NoDiscount implements IDiscount {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;
    }
}
