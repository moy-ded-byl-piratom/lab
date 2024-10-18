public class PayPalPaymentStrategy implements IPaymentStrategy {
    private String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " " + email);
    }
}
