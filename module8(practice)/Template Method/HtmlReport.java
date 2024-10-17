public class HtmlReport extends ReportGenerator {

    @Override
    protected void prepareData() {
        System.out.println("preparing data HTML ");
    }

    @Override
    protected void formatReport() {
        System.out.println("formatting report HTML");
    }
}
