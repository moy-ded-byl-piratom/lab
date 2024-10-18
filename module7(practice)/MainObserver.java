public class MainObserver {
    public static void main(String[] args) {
        StockExchange stockExchange = new StockExchange();

        stockExchange.addStock("AA", 150);
        stockExchange.addStock("BB", 750);

        Trader trader1 = new Trader("Трейдер 1");
        Trader trader2 = new Trader("Трейдер 2");
        TradingRobot robot = new TradingRobot(700);

        stockExchange.registerObserver(trader1);
        stockExchange.registerObserver(trader2);
        stockExchange.registerObserver(robot);
        
        stockExchange.updateStockPrice("AA", 155);

        stockExchange.updateStockPrice("BB", 680);

        stockExchange.updateStockPrice("BB", 720);

        stockExchange.removeObserver(trader1);

        stockExchange.updateStockPrice("AA", 160);
    }
}
