public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("addCondiments");
    }
}

