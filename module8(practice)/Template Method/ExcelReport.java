public class ExcelReport extends ReportGenerator {

    @Override
    protected void prepareData() {
        System.out.println("preparing data");
    }

    @Override
    protected void formatReport() {
        System.out.println("formatting report Excel");
    }

    @Override
    protected void saveReport() {
        System.out.println("Excel saved");
    }
}
