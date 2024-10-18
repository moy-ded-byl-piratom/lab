public class Main {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();

        MobileAppObserver mobileApp = new MobileAppObserver("MobileApp");
        NewsAgencyObserver newsAgency = new NewsAgencyObserver("NewsAgency");
        BankObserver bank = new BankObserver("Bank");

        currencyExchange.registerObserver(mobileApp);
        currencyExchange.registerObserver(newsAgency);
        currencyExchange.registerObserver(bank);

        currencyExchange.setRate("USD", 75.50);
        currencyExchange.setRate("EUR", 90.30);

        currencyExchange.removeObserver(newsAgency);

        currencyExchange.setRate("KZT", 105.75);
    }
}
