public class ReportCreator implements DocumentCreator{
    @Override
    public Document CreateDocument() {
        return new Report();
    }
}
