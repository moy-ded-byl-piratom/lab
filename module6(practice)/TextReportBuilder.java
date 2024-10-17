public class TextReportBuilder implements IReportBuilder{
    private Report report = new Report();
    @Override
    public void SetHeader(String header) {
        report.setHeader(header);
    }

    @Override
    public void SetContent(String content) {
        report.setContent(content);
    }

    @Override
    public void SetFooter(String footer) {
        report.setFooter(footer);
    }

    @Override
    public void AddSection(String sectionName, String sectionContent) {
        report.addSection(sectionName, sectionContent);
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
