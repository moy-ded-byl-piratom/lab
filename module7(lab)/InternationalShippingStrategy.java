public class InternationalShippingStrategy implements IShippingStrategy{
    @Override
    public double CalculateSipping(double distance, double weight) {
        return distance*0.1 + weight*0.5 + 100;
    }
}
