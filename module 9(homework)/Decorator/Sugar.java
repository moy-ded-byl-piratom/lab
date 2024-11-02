public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }
}
