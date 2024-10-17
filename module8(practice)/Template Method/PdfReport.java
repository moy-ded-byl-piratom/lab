public class PdfReport extends ReportGenerator {

    @Override
    protected void prepareData() {
        System.out.println("preparing data");
    }

    @Override
    protected void formatReport() {
        System.out.println("formatting report Pdf");
    }
}
