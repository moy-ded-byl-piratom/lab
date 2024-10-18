public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("tea brew");
    }

    @Override
    protected void addCondiments() {
        System.out.println("addCondiments");
    }
}
