import java.util.ArrayList;
import java.util.List;

public class StockExchange implements ISubject {
    private List<IObserver> observers;
    private List<Stock> stocks;

    public StockExchange() {
        observers = new ArrayList<>();
        stocks = new ArrayList<>();
    }

    public void addStock(String symbol, double price) {
        stocks.add(new Stock(symbol, price));
    }

    public void updateStockPrice(String symbol, double newPrice) {
        for (Stock stock : stocks) {
            if (stock.getSymbol().equals(symbol)) {
                stock.setPrice(newPrice);
                notifyObservers(symbol, newPrice);
                break;
            }
        }
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
    public void notifyObservers(String stockSymbol, double price) {
        for (IObserver observer : observers) {
            observer.update(stockSymbol, price);
        }
    }
}
