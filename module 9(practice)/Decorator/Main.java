public class Main {
    public static void main(String[] args) {
        IReport salesReport = new SalesReport();
        System.out.println(salesReport.generate());

        IReport dateFilteredReport = new DateFilterDecorator(salesReport, "2024-01-01", "2024-12-31");
        System.out.println(dateFilteredReport.generate());

        IReport sortedReport = new SortingDecorator(dateFilteredReport, "date");
        System.out.println(sortedReport.generate());

        IReport csvExportedReport = new CsvExportDecorator(sortedReport);
        System.out.println(csvExportedReport.generate());

        IReport pdfExportedReport = new PdfExportDecorator(csvExportedReport);
        System.out.println(pdfExportedReport.generate());

        IReport userReport = new UserReport();
        IReport complexReport = new PdfExportDecorator(
                new CsvExportDecorator(
                        new SortingDecorator(
                                new DateFilterDecorator(userReport, "2024-02-01", "2024-05-01"), "name")));
        System.out.println(complexReport.generate());
    }
}
