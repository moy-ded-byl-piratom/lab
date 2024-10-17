public class MainBuilder {
    public static void main(String[] args) {
        ReportDirector director = new ReportDirector();

        IReportBuilder textBuilder = new TextReportBuilder();
        ReportStyle textStyle = new ReportStyle("white", "black", 12);
        director.ConstructReport(textBuilder, textStyle);
        Report textReport = textBuilder.GetReport();
        System.out.println("Text Report:");
        System.out.println(textReport.getHeader());
        System.out.println(textReport.getContent());
        textReport.getSections().forEach(section -> {
            System.out.println(section.getSectionName());
            System.out.println(section.getSectionContent());
        });
        System.out.println(textReport.getFooter());


        IReportBuilder htmlBuilder = new HtmlReportBuilder();
        ReportStyle htmlStyle = new ReportStyle("#FFFFFF", "#000000", 14);
        director.ConstructReport(htmlBuilder, htmlStyle);
        Report htmlReport = htmlBuilder.GetReport();
        System.out.println("HTML Report:");
        System.out.println(htmlReport.getHeader());
        System.out.println(htmlReport.getContent());


        PdfReportBuilder pdfBuilder = new PdfReportBuilder();
        ReportStyle pdfStyle = new ReportStyle("#FFFFFF", "#000000", 14);
        director.ConstructReport(pdfBuilder, pdfStyle);
        pdfBuilder.ExportToPDF("report.pdf");
        System.out.println("PDF created.");
    }
}
