import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements ISubject {
    private List<IObserver> observers;
    private String currency;
    private double rate;

    public CurrencyExchange() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(currency, rate);
        }
    }

    public void setRate(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
        notifyObservers();
    }
}
