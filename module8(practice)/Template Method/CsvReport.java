public class CsvReport extends ReportGenerator {

    @Override
    protected void prepareData() {
        System.out.println("preparing data CSV");
    }

    @Override
    protected void formatReport() {
        System.out.println("formatting report CSV.");
    }

    @Override
    protected void saveReport() {
        System.out.println("CSV saved");
    }
}
