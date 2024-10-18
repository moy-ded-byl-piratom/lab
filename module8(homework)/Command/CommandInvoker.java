import java.util.Stack;

public class CommandInvoker {
    private Stack<ICommand> commandHistory;

    public CommandInvoker() {
        commandHistory = new Stack<>();
    }

    public void executeCommand(ICommand command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {}
    }
}

