import java.util.ArrayList;
public class Directory extends FileSystemComponent implements FileSystemComponentMethods{
private ArrayList<FileSystemComponent> _children = new ArrayList<FileSystemComponent>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void Add(FileSystemComponent component) {
        _children.add(component);
    }

    @Override
    public void Remove(FileSystemComponent component) {
        _children.remove(component);
    }

    @Override
    public FileSystemComponent GetChild(int index) {
        return null;
    }

    @Override
    public void Display(int depth) {
        System.out.println("-".repeat(depth)+ "Directory - " + _name);
        for(FileSystemComponent component: _children){
            component.Display(depth + 2);
        }
    }
}
