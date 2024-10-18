public class HtmlReportBuilder implements IReportBuilder {
    private Report report;

    public HtmlReportBuilder() {
        report = new Report();
    }

    @Override
    public void setHeader(String header) {
        report.setHeader(header);
    }

    @Override
    public void setContent(String content) {
        report.setContent(content);
    }

    @Override
    public void setFooter(String footer) {
        report.setFooter(footer);
    }

    @Override
    public Report getReport() {
        return report;
    }
}

