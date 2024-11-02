public class ExternalLogisticsServiceA {
    public void shipItem(int itemId) {
        System.out.println("Shipping item " + itemId + " via External Logistics Service A.");
    }

    public String trackShipment(int shipmentId) {
        return "Tracking shipment " + shipmentId + " via External Logistics Service A.";
    }

    public double getShippingCost(int itemId) {
        return 15;
    }
}
