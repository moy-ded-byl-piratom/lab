public class TelevisionOffCommand implements ICommand {
    private Television tv;

    public TelevisionOffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void Execute() {
        tv.Off();
    }

    @Override
    public void Undo() {
        tv.On();
    }
}