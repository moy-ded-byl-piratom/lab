public class RemoteControl {
    private ICommand onCommand;
    private ICommand offCommand;

    public void setCommands(ICommand onCommand, ICommand offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void pressOnButton() {
        onCommand.Execute();
    }

    public void pressOffButton() {
        offCommand.Execute();
    }

    public void pressUndoButton() {
        onCommand.Undo();
    }
}
