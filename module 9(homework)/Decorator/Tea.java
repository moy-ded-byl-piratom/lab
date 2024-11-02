public class Tea implements Beverage {
    @Override
    public double cost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }
}
