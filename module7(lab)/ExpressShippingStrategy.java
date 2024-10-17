public class ExpressShippingStrategy implements IShippingStrategy{
    @Override
    public double CalculateSipping(double distance, double weight) {
        return (weight * 0.75 + distance * 0.2) + 10;
    }
}
