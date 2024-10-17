public class DeliveryContext {
    IShippingStrategy _shipping;

    public void SetShippingStrategy(IShippingStrategy shipping) {
        this._shipping = shipping;
    }

    public double calculateCost(double distance, double weight) {
        if (_shipping == null) {
            throw new IllegalStateException("Стратегия доставки не установлена");
        }
        return _shipping.CalculateSipping(distance, weight);
    }
}