public class Main {
    public static void main(String[] args) {
        TransportFactory motorcycleFactory = new MotorcycleFactory();
        ITransport motorcycle1 = motorcycleFactory.CreateTransport();

        motorcycle1.Mark();
        motorcycle1.Speed();
        motorcycle1.Move();

        TransportFactory planeFactory = new PlaneFactory();
        ITransport plane1 = planeFactory.CreateTransport();

        plane1.FuelUp();
        plane1.Mark();
    }
}
