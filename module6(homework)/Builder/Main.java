public class Main {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        IReportBuilder textReportBuilder = new TextReportBuilder();
        director.constructReport(textReportBuilder, "Текстовый отчет", "AA", "Конец");
        Report textReport = textReportBuilder.getReport();
        System.out.println(textReport);


        IReportBuilder htmlReportBuilder = new HtmlReportBuilder();
        director.constructReport(htmlReportBuilder, "HTML отчет", "BB", "Конец");
        Report htmlReport = htmlReportBuilder.getReport();
        System.out.println(htmlReport);
    }
}
