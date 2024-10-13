public class Bicycle implements ITransport{
    @Override
    public void Mark() {
        System.out.println("Mark:");
    }
    @Override
    public void Speed() {
        System.out.println("Speed:");
    }
    public void Move() {
        System.out.println("Bicycle moved");
    }
    public void FuelUp() {
        System.out.println("Bicycle can't be fueled up");
    }

}

