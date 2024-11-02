public class Syrup extends BeverageDecorator {
    public Syrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Syrup";
    }
}

