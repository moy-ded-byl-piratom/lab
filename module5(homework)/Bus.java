public class Bus implements IVehicle{
    private int passengerCapacity;
    private String routeNumber;

    public Bus(int passengerCapacity, String routeNumber) {
        this.passengerCapacity = passengerCapacity;
        this.routeNumber = routeNumber;
    }

    @Override
    public void Drive() {
        System.out.println("Bus is driving.");
    }

    @Override
    public void Refuel() {
        System.out.println("Bus is refueled.");
    }
}
