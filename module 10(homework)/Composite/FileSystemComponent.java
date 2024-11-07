public abstract class FileSystemComponent {
    protected String _name;

    public FileSystemComponent(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public abstract void display(int depth);
    public abstract int getSize();
}

