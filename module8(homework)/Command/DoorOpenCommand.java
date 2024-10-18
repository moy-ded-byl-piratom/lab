public class DoorOpenCommand implements ICommand {
    private Door _door;

    public DoorOpenCommand(Door door) {
        this._door = door;
    }

    @Override
    public void execute() {
        _door.open();
    }

    @Override
    public void undo() {
        _door.close();
    }
}

