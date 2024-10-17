public class HtmlReportBuilder implements IReportBuilder {
    private Report report = new Report();

    @Override
    public void SetHeader(String header) {
        report.setHeader("<h1>" + header + "</h1>");
    }

    @Override
    public void SetContent(String content) {
        report.setContent("<p>" + content + "</p>");
    }

    @Override
    public void SetFooter(String footer) {
        report.setFooter("<footer>" + footer + "</footer>");
    }

    @Override
    public void AddSection(String sectionName, String sectionContent) {
        report.addSection("<h2>" + sectionName + "</h2>", "<p>" + sectionContent + "</p>");
    }

    @Override
    public void SetStyle(ReportStyle style) {
        report.setStyle(style);
    }

    @Override
    public Report GetReport() {
        return report;
    }
}

