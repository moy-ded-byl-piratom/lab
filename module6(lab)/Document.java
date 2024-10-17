public class Document implements IPrototype{
    public String title;
    public String mainPart;
    public String collectionOfNestedElements;

    public Document(String title, String content) {
    }

    @Override
    public IPrototype Clone() {
        return null;
    }
}
