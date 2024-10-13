public class ResumeCreator implements DocumentCreator{
    @Override
    public Document CreateDocument() {
        return new Resume();
    }
}
