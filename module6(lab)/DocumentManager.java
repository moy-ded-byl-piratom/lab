public class DocumentManager {
    public DocumentPrototype CreateDocument(IPrototype prototype) {
        return (DocumentPrototype) prototype.Clone();
    }
}
