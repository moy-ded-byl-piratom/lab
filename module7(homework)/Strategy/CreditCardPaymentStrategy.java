public class CreditCardPaymentStrategy implements IPaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPaymentStrategy(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " " + cardNumber + " " + cardHolder);
    }
}

