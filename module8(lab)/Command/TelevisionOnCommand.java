public class TelevisionOnCommand implements ICommand {
    private Television tv;

    public TelevisionOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void Execute() {
        tv.On();
    }

    @Override
    public void Undo() {
        tv.Off();
    }
}