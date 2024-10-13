public class Motorcycle implements ITransport{
    public String mark;
    public int speed;

    public Motorcycle(String mark, int speed) {
        this.mark = mark;
        this.speed = speed;
    }

    @Override
    public void Mark() {
        System.out.println("Mark: " + mark);
    }

    @Override
    public void Speed() {
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public void Move() {
        System.out.println("Motorcycle moved");
    }

    @Override
    public void FuelUp() {
        System.out.println("Motorcycle fueled up");
    }
}
