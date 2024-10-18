public class DecreaseTemperatureCommand implements ICommand {
    private Thermostat _thermostat;
    private int amount;

    public DecreaseTemperatureCommand(Thermostat thermostat, int amount) {
        this._thermostat = thermostat;
        this.amount = amount;
    }

    @Override
    public void execute() {
        _thermostat.decreaseTemperature(amount);
    }

    @Override
    public void undo() {
        _thermostat.increaseTemperature(amount);
    }
}
