public class Main {
    public static void main(String[] args) {
        IPaymentProcessor internalProcessor = new InternalPaymentProcessor();
        internalProcessor.processPayment(100.0);
        internalProcessor.refundPayment(50.0);

        ExternalPaymentSystemA externalSystemA = new ExternalPaymentSystemA();
        IPaymentProcessor adapterA = new PaymentAdapterA(externalSystemA);
        adapterA.processPayment(200.0);
        adapterA.refundPayment(100.0);

        ExternalPaymentSystemB externalSystemB = new ExternalPaymentSystemB();
        IPaymentProcessor adapterB = new PaymentAdapterB(externalSystemB);
        adapterB.processPayment(300.0);
        adapterB.refundPayment(150.0);

        String region = "EU";
        IPaymentProcessor chosenProcessor = choosePaymentProcessor(region);
        chosenProcessor.processPayment(500.0);
        chosenProcessor.refundPayment(250.0);
    }

    public static IPaymentProcessor choosePaymentProcessor(String region) {
        if ("EU".equals(region)) {
            return new PaymentAdapterA(new ExternalPaymentSystemA());
        } else if ("US".equals(region)) {
            return new PaymentAdapterB(new ExternalPaymentSystemB());
        } else {
            return new InternalPaymentProcessor();
        }
    }
}
