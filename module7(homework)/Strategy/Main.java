import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите метод оплаты - 1- Банковская карта, 2- PayPal, 3- Криптовалюта");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Номер карты");
                String cardNumber = scanner.nextLine();
                System.out.println("Имя");
                String cardHolder = scanner.nextLine();
                context.setPaymentStrategy(new CreditCardPaymentStrategy(cardNumber, cardHolder));
                break;
            case 2:
                System.out.println("email PayPal:");
                String email = scanner.nextLine();
                context.setPaymentStrategy(new PayPalPaymentStrategy(email));
                break;
            case 3:
                System.out.println("Адрес криптокошелька:");
                String walletAddress = scanner.nextLine();
                context.setPaymentStrategy(new CryptocurrencyPaymentStrategy(walletAddress));
                break;
            default:
                return;
        }

        System.out.println("Сумма для оплаты:");
        double amount = scanner.nextDouble();
        context.executePayment(amount);
    }
}
