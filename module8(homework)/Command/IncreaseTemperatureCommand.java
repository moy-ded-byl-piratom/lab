public class IncreaseTemperatureCommand implements ICommand {
    private Thermostat _thermostat;
    private int amount;

    public IncreaseTemperatureCommand(Thermostat thermostat, int amount) {
        this._thermostat = thermostat;
        this.amount = amount;
    }

    @Override
    public void execute() {
        _thermostat.increaseTemperature(amount);
    }

    @Override
    public void undo() {
        _thermostat.decreaseTemperature(amount);
    }
}
