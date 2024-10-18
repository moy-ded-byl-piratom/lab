public class CryptocurrencyPaymentStrategy implements IPaymentStrategy {
    private String wallet;

    public CryptocurrencyPaymentStrategy(String wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " " + wallet);
    }
}
