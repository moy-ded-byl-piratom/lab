public class TradingRobot implements IObserver {
    private double threshold;

    public TradingRobot(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(String stockSymbol, double price) {
        if (price > threshold) {
            System.out.println(stockSymbol +" "+ price);
        } else {
            System.out.println(stockSymbol +" "+ price);
        }
    }
}
