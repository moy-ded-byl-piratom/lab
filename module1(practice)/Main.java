import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("A", "Aa", 2020, 4, "Auto");
        Car car2 = new Car("A", "Cc", 2020, 4, "Auto");
        Motorcycle motorcycle1 = new Motorcycle("B", "Bb", 2019, "C", false);


        Garage garage1 = new Garage();
        garage1.addVehicle(car1);
        garage1.addVehicle(car2);
        garage1.addVehicle(motorcycle1);


        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);

        garage1.removeVehicle(motorcycle1);

        ArrayList<Vehicle> foundVehicles = fleet.findVehicles("A", null);
        for (Vehicle vehicle : foundVehicles) {
            System.out.println(vehicle.getMark() + " " + vehicle.getModel());
        }
    }
}
