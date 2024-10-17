import java.util.Scanner;
public class MainStrategy {
    public static void main(String[] args) {
        DeliveryContext deliveryContext = new DeliveryContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип доставки- 1 - Стандартная, 2 - Экспресс, 3 - Международная");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                deliveryContext.SetShippingStrategy(new StandartDeliveryShipping());
                break;
            case "2":
                deliveryContext.SetShippingStrategy(new ExpressShippingStrategy());
                break;
            case "3":
                deliveryContext.SetShippingStrategy(new InternationalShippingStrategy());
                break;
            default:
                return;
        }

        double weight = scanner.nextDouble();

        System.out.println("Введите расстояние доставки (км):");        double distance = scanner.nextDouble();

        double cost = deliveryContext.calculateCost(weight, distance);
        System.out.printf("Стоимость ", cost);
    }
}
