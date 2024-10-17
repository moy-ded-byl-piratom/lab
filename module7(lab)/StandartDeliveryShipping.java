public class StandartDeliveryShipping implements IShippingStrategy {
    @Override
    public double CalculateSipping(double distance, double weight) {
        return weight * 0.5 + distance * 0.1;
    }
}
