import java.util.Scanner;
public class MotorcycleFactory implements TransportFactory{
    @Override
    public ITransport CreateTransport() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark: ");
        String mark = scanner.nextLine();

        System.out.print("Enter speed: ");
        int speed = scanner.nextInt();

        return new Motorcycle(mark, speed);
    }
}
