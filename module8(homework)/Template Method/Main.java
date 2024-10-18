public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();
        Beverage hotChocolate = new HotChocolate();

        tea.prepareRecipe();

        coffee.prepareRecipe();
        hotChocolate.prepareRecipe();
    }
}
