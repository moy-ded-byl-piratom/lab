public abstract class FileSystemComponent {
    protected String _name;
    public FileSystemComponent(String name){
        this._name = name;
    }
    public abstract void Display(int depth);
}
