public class WhippedCream extends BeverageDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return super.cost() + 45;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Whipped Cream";
    }
}
