public class File extends FileSystemComponent {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth)+ "File - " + _name+" (Size: " + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}
