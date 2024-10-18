import java.util.Scanner;
public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    private void boilWater() {
        System.out.println("boilWater");
    }

    private void pourInCup() {
        System.out.println("pourInCup");
    }
    protected abstract void brew();
    protected abstract void addCondiments();
    protected boolean customerWantsCondiments() {
        return true;
    }
    protected boolean getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите добавить добавки? (y/n): ");
        String answer = scanner.nextLine().toLowerCase();
        return answer.startsWith("y");
    }
}
