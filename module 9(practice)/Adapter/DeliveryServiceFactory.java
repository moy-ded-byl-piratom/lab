public class DeliveryServiceFactory {
    public static IInternalDeliveryService getDeliveryService(String serviceType) {
        switch (serviceType) {
            case "Internal":
                return new InternalDeliveryService();
            case "ExternalA":
                return new LogisticsAdapterA(new ExternalLogisticsServiceA());
            case "ExternalB":
                return new LogisticsAdapterB(new ExternalLogisticsServiceB());
            default:
                throw new IllegalArgumentException("Unknown service type- " + serviceType);
        }
    }
}

