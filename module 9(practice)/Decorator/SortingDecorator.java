public class SortingDecorator extends ReportDecorator {
    private String sortBy;

    public SortingDecorator(IReport report, String sortBy) {
        super(report);
        this.sortBy = sortBy;
    }

    @Override
    public String generate() {
        return super.generate() + " - Sorted by: " + sortBy;
    }
}
