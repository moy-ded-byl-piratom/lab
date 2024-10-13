public class Truck implements  IVehicle{
    private int loadCapacity;
    private int axles;
    public Truck(int loadCapacity, int axles) {
        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }
    @Override
    public void Drive() {
        System.out.println("Truck is driving.");
    }

    @Override
    public void Refuel() {
        System.out.println("Truck is refueled");
    }
}
