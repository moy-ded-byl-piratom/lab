public class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA externalServiceA;
    private int shipmentIdCounter = 1;

    public LogisticsAdapterA(ExternalLogisticsServiceA externalServiceA) {
        this.externalServiceA = externalServiceA;
    }

    @Override
    public void deliverOrder(String orderId) {
        int itemId = Integer.parseInt(orderId);
        externalServiceA.shipItem(itemId);
        System.out.println("Order " + orderId + " delivered via External Logistics Service A");
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        int shipmentId = shipmentIdCounter++;
        return externalServiceA.trackShipment(shipmentId);
    }

    @Override
    public double calculateDeliveryCost(String orderId) {
        int itemId = Integer.parseInt(orderId);
        return externalServiceA.getShippingCost(itemId);
    }
}

