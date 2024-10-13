public class LetterCreator implements DocumentCreator{
    @Override
    public Document CreateDocument() {
        return new Letter();
    }
}
