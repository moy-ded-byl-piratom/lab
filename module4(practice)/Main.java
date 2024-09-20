public class Main {
    public static void main(String[] args) {
        INotification emailNotification = new EmailNotification("customer@example.com");

        Order order1 = new Order();
        order1.addProduct("A", 100.0, 2);
        order1.addProduct("B", 200.0, 2);
        IDiscount percentageDiscountStrategy = new PercentageDiscount(10);
        CalculationTotalDiscount discountCalculator = new CalculationTotalDiscount(percentageDiscountStrategy);
        double total = discountCalculator.calculateOrderDiscount(order1);

        System.out.println("Price " + total);
        IPayment payment = new CreditCardPayment();
        payment.processPayment(total);

        IDelivery delivery = new PickUpPointDelivery();
        delivery.deliverOrder(order1);
        order1.setStatus("Отправлен в пункт выдачи");

    }
}
