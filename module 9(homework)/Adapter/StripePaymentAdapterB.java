public class StripePaymentAdapterB implements IPaymentProcessor {
    private StripePaymentServiceB stripePaymentServiceB;

    public StripePaymentAdapterB(StripePaymentServiceB stripePaymentServiceB) {
        this.stripePaymentServiceB = stripePaymentServiceB;
    }

    @Override
    public void processPayment(double amount) {
        stripePaymentServiceB.processStripePaymentServiceB(amount);
    }


}
