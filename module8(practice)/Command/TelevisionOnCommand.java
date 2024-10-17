public class TelevisionOnCommand implements ICommand{
    private Television _television;
    public void TelevisionOnCommand(Light _light){
        this._television=_television;
    }
    @Override
    public void Execute() {
        _television.On();
    }

    @Override
    public void Undo() {
        _television.Off();
    }
}
