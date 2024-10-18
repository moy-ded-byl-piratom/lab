public class BankObserver implements IObserver {
    private String bankName;

    public BankObserver(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void update(String currency, double rate) {
        System.out.println(bankName + " - курс " + currency + " поменялся на " + rate);
    }
}
