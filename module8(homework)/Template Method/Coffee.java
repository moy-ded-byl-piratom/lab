public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Coffee brew");
    }

    @Override
    protected void addCondiments() {
        System.out.println("addCondiments");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return getUserInput();
    }
}
