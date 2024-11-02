public class Espresso implements Beverage {
    @Override
    public double cost() {
        return 100;
    }
    @Override
    public String getDescription() {
        return "Espresso";
    }
}

