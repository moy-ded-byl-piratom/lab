public class Car implements IVehicle{
    private String brand;
    private String model;
    private String fuelType;
    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }
    @Override
    public void Drive() {
        System.out.println("Car is driving. Brand - " + brand + " Model - "+ model);
    }
    @Override
    public void Refuel() {
        System.out.println("Car is refueled. FuelType"+fuelType);
    }
}
