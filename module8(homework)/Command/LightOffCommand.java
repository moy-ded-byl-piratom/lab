public class LightOffCommand implements ICommand {
    private Light _light;

    public LightOffCommand(Light light) {
        this._light = light;
    }

    @Override
    public void execute() {
        _light.off();
    }

    @Override
    public void undo() {
        _light.on();
    }
}
