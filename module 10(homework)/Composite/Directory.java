import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> _children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        if (!_children.contains(component)) {
            _children.add(component);
        }
    }

    public void removeComponent(FileSystemComponent component) {
        _children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth)+ "Directory - " + _name);
        for(FileSystemComponent component: _children){
            component.display(depth + 2);
        }
    }

    @Override
    public int getSize() {
        return _children.stream().mapToInt(FileSystemComponent::getSize).sum();
    }
}

