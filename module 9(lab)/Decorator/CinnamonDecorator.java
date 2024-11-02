public class CinnamonDecorator extends BeverageDecorator {
    public CinnamonDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 9.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Cinnamon";
    }
}
