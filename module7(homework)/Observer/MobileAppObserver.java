public class MobileAppObserver implements IObserver {
    private String appName;

    public MobileAppObserver(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String currency, double rate) {
        System.out.println(appName + " - курс " + currency + " поменялся на " + rate);
    }
}
