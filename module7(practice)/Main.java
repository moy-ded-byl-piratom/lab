public class Main {
    public static void main(String[] args) {
        TravelBookingContext bookingContext = new TravelBookingContext();

        bookingContext.setCalculationStrategy(new BusStrategy());
        double busCost = bookingContext.calculateCost(10, 2, 10, 5);
        System.out.println(busCost);

        bookingContext.setCalculationStrategy(new Plane());
        double planeCost = bookingContext.calculateCost(5, 1, 15, 0);
        System.out.println(planeCost);
    }
}
