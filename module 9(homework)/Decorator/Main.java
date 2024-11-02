public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " - " + beverage.cost());

        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " - " + beverage.cost());

        beverage = new Sugar(beverage);
        System.out.println(beverage.getDescription() + " - " + beverage.cost());

        beverage = new WhippedCream(beverage);
        System.out.println(beverage.getDescription() + " - " + beverage.cost());

        Beverage match = new Match();
        match = new Syrup(match);
        match = new Milk(match);
        match = new WhippedCream(match);
        System.out.println(match.getDescription() + " - " + match.cost());
    }
}
