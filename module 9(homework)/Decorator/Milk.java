public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk";
    }
}
