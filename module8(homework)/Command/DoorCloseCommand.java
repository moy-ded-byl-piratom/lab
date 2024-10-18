public class DoorCloseCommand implements ICommand {
    private Door _door;

    public DoorCloseCommand(Door door) {
        this._door = door;
    }

    @Override
    public void execute() {
        _door.close();
    }

    @Override
    public void undo() {
        _door.open();
    }
}
