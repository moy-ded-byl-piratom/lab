public class LogisticsAdapterB implements IInternalDeliveryService {
    private ExternalLogisticsServiceB externalServiceB;

    public LogisticsAdapterB(ExternalLogisticsServiceB externalServiceB) {
        this.externalServiceB = externalServiceB;
    }

    @Override
    public void deliverOrder(String orderId) {
        String packageInfo = "OrderID " + orderId;
        externalServiceB.sendPackage(packageInfo);
        System.out.println("Order " + orderId + " delivered via External Logistics Service B");
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        String trackingCode = "Track" + orderId;
        return externalServiceB.checkPackageStatus(trackingCode);
    }

    @Override
    public double calculateDeliveryCost(String orderId) {
        String packageInfo = "OrderID " + orderId;
        return externalServiceB.estimateCost(packageInfo);
    }
}
