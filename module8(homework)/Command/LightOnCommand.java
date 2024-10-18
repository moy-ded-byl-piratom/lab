public class LightOnCommand implements ICommand {
    private Light _light;

    public LightOnCommand(Light light) {
        this._light = light;
    }

    @Override
    public void execute() {
        _light.on();
    }

    @Override
    public void undo() {
        _light.off();
    }
}
