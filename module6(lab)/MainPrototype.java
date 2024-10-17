public class MainPrototype {
    public static void main(String[] args) {

        DocumentPrototype originalDoc = new DocumentPrototype("Document", "This is the document");
        originalDoc.addSection(new Section("Introduction", "This is the introduction"));
        originalDoc.addSection(new Section("Conclusion", "This is the conclusion"));
        originalDoc.addImage(new Image("http://example.com/"));
        originalDoc.addImage(new Image("http://example.com"));

        DocumentManager manager = new DocumentManager();

        DocumentPrototype clonedDoc = manager.CreateDocument(originalDoc);
        clonedDoc.setTitle("Cloned Document");

        System.out.println("Original\n" + originalDoc);
        System.out.println("Cloned\n" + clonedDoc);
    }
}
