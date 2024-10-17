public class TravelBookingContext {
private ICostCalculationStrategy _calculationStrategy;
    public void setCalculationStrategy(ICostCalculationStrategy strategy) {
        this._calculationStrategy = strategy;
    }
    public double calculateCost(int countOfPassengers, int typeClass, int sale, int benefits) {
        return _calculationStrategy.conculation(countOfPassengers, typeClass, sale, benefits);
    }
}
