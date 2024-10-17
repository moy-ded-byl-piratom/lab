public class ReportClient {

    public static void main(String[] args) {
        ReportGenerator pdfReport = new PdfReport();
        pdfReport.generateReport();

        ReportGenerator excelReport = new ExcelReport();
        excelReport.generateReport();

        ReportGenerator htmlReport = new HtmlReport();
        htmlReport.generateReport();
        ReportGenerator csvReport = new CsvReport();
        csvReport.generateReport();
    }
}
