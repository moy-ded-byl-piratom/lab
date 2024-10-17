public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("brewing tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("addCondiments");
    }
}
