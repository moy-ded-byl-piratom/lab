public class Car implements ITransport {
    @Override
    public void Mark() {
        System.out.println("Mark:");
    }
    @Override
    public void Speed() {
        System.out.println("Speed:");
    }
    public void Move() {
        System.out.println("Car moved");
    }
    public void FuelUp() {
        System.out.println("Car fueled up");
    }

}
