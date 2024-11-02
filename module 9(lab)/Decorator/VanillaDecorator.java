public class VanillaDecorator extends BeverageDecorator {
    public VanillaDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 11.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Vanilla";
    }
}