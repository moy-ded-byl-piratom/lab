public class NewsAgencyObserver implements IObserver {
    private String agencyName;

    public NewsAgencyObserver(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void update(String currency, double rate) {
        System.out.println(agencyName + " - курс " + currency + " поменялся на " + rate);
    }
}
