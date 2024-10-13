import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип транспорта(car-1, motorcycle-2, truck-3, bus-4): ");
        int vehicleType = scanner.nextInt();
        scanner.nextLine();

        VehicleFactory factory = null;

        switch (vehicleType) {
            case 1:
                System.out.println("brand: ");
                String brand = scanner.nextLine();
                System.out.println("model: ");
                String model = scanner.nextLine();
                System.out.println("fuel type: ");
                String fuelType = scanner.nextLine();
                factory = new CarFactory(brand, model, fuelType);
                break;
            case 2:
                System.out.println("type: ");
                String type = scanner.nextLine();
                System.out.println("engine capacity: ");
                int engineCapacity = scanner.nextInt();
                factory = new MotorcycleFactory(type, engineCapacity);
                break;
            case 3:
                System.out.println("load capacity: ");
                int loadCapacity = scanner.nextInt();
                System.out.println("axles: ");
                int axles = scanner.nextInt();
                factory = new TruckFactory(loadCapacity, axles);
                break;
            case 4:
                System.out.println("passenger capacity: ");
                int passengerCapacity = scanner.nextInt();
                System.out.println("route number: ");
                String routeNumber = scanner.next();
                factory = new BusFactory(passengerCapacity, routeNumber);
                break;
            default:
                return;
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.Drive();
        vehicle.Refuel();

        scanner.close();
    }
}

