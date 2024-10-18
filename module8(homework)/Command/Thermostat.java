public class Thermostat {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(temperature);
    }

    public void increaseTemperature(int amount) {
        temperature += amount;
        System.out.println(amount + "  " + temperature);
    }

    public void decreaseTemperature(int amount) {
        temperature -= amount;
        System.out.println(amount + " " + temperature);
    }
}
