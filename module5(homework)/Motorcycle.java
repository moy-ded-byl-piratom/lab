public class Motorcycle implements IVehicle {
    private String type;
    private int engineCapacity;
    public Motorcycle(String type, int engineCapacity) {
        this.type = type;
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void Drive() {
        System.out.println("Motorcycle is driving.");
    }

    @Override
    public void Refuel() {
        System.out.println("Motorcycle is refueled");
    }
}
