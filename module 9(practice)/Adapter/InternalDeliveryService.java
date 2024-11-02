public class InternalDeliveryService implements IInternalDeliveryService {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Delivering order " + orderId + " using internal delivery service");
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return "Status of order " + orderId + " - Delivered by internal service";
    }

    @Override
    public double calculateDeliveryCost(String orderId) {
        return 11;
    }
}
