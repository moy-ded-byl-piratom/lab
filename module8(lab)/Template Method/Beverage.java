public abstract class Beverage {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("boilWater");
    }

    private void pourInCup() {
        System.out.println("pourInCup");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}
