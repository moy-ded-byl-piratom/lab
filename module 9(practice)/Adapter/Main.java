public class Main {
    public static void main(String[] args) {
        IInternalDeliveryService deliveryService = DeliveryServiceFactory.getDeliveryService("Internal");
        deliveryService.deliverOrder("101");
        System.out.println(deliveryService.getDeliveryStatus("101"));
        System.out.println("Cost: $" + deliveryService.calculateDeliveryCost("101"));

        IInternalDeliveryService externalServiceA = DeliveryServiceFactory.getDeliveryService("ExternalA");
        externalServiceA.deliverOrder("202");
        System.out.println(externalServiceA.getDeliveryStatus("202"));
        System.out.println("Cost: $" + externalServiceA.calculateDeliveryCost("202"));

        IInternalDeliveryService externalServiceB = DeliveryServiceFactory.getDeliveryService("ExternalB");
        externalServiceB.deliverOrder("303");
        System.out.println(externalServiceB.getDeliveryStatus("303"));
        System.out.println("Cost: $" + externalServiceB.calculateDeliveryCost("303"));
    }
}

