public class Main {
    public static void main(String[] args) {
        IPaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        paypalProcessor.processPayment(110);

        StripePaymentService stripeService = new StripePaymentService();
        IPaymentProcessor stripeAdapter = new StripePaymentAdapter(stripeService);
        stripeAdapter.processPayment(200);

        StripePaymentServiceB squareService = new StripePaymentServiceB();
        IPaymentProcessor squareAdapter = new StripePaymentAdapterB(squareService);
        squareAdapter.processPayment(150);

    }
}
