public class MacroCommand implements ICommand {
    private ICommand[] commands;

    public MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void Execute() {
        for (ICommand command : commands) {
            command.Execute();
        }
    }

    @Override
    public void Undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].Undo();
        }
    }
}
