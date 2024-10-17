public class LightOnCommand implements ICommand{
    private Light _light;
    public void LightOnCommand(Light _light){
        this._light=_light;
    }
    @Override
    public void Execute() {
        _light.On();
    }

    @Override
    public void Undo() {
        _light.Off();
    }

}
