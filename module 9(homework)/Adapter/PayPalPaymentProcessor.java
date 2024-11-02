public class PayPalPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " through PayPal");
    }
}
