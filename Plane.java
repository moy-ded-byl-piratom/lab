public class Plane implements ITransport {
    public String mark;
    public int speed;

    public Plane(String mark, int speed) {
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
    public void Move() {
        System.out.println("Plane moved");
    }
    public void FuelUp() {
        System.out.println("Plane fueled up");
    }
}
