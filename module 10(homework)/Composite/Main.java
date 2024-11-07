public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");

        File file1 = new File("File1.txt", 500);
        File file2 = new File("File2.txt", 300);
        Directory subDir1 = new Directory("SubDir1");
        Directory subDir2 = new Directory("SubDir2");

        root.addComponent(file1);
        root.addComponent(subDir1);

        subDir1.addComponent(file2);
        subDir1.addComponent(subDir2);

        File file3 = new File("File3.txt", 700);
        subDir2.addComponent(file3);

        root.display(1);
        System.out.println("Total Size: " + root.getSize() + " KB");
    }
}

