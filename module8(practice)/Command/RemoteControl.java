public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;
    private ICommand lastCommand;

    public RemoteControl(int slotCount) {
        onCommands = new ICommand[slotCount];
        offCommands = new ICommand[slotCount];

        ICommand noCommand = new NoCommand();
        for (int i = 0; i < slotCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void pressOnButton(int slot) {
        if (onCommands[slot] != null) {
            onCommands[slot].Execute();
            lastCommand = onCommands[slot];
        }
    }

    public void pressOffButton(int slot) {
        if (offCommands[slot] != null) {
            offCommands[slot].Execute();
            lastCommand = offCommands[slot];
        }
    }

    public void undoButton() {
        lastCommand.Undo(); // Отмена последней команды
    }
}
