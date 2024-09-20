import java.util.ArrayList;
public class Fleet {
    private ArrayList<Garage> garages;

    public Fleet() {
        garages = new ArrayList<>();
    }

    public void addGarage(Garage garage) {
        garages.add(garage);
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage) ;
    }
    public ArrayList<Vehicle> findVehicles(String make, String model) {
        ArrayList<Vehicle> foundVehicles = new ArrayList<>();
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) {
                boolean matchesMark = (make == null || vehicle.getMark().equalsIgnoreCase(make));
                boolean matchesModel = (model == null || vehicle.getModel().equalsIgnoreCase(model));
                if (matchesMark && matchesModel) {
                    foundVehicles.add(vehicle);
                }
            }
        }
        return foundVehicles;
    }
}
