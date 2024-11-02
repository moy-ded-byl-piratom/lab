public class ExternalLogisticsServiceB {
    public void sendPackage(String packageInfo) {
        System.out.println("Sending package with info " + packageInfo + " via External Logistics Service B.");
    }

    public String checkPackageStatus(String trackingCode) {
        return "Status of package with tracking code " + trackingCode + ": In transit.";
    }

    public double estimateCost(String packageInfo) {
        return 12.5;
    }
}
