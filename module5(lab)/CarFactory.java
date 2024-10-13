public class CarFactory implements TransportFactory {
    @Override
    public ITransport CreateTransport() {
        return new Car();
    }
}
